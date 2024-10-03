/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assets.FONT;

import java.awt.Font;
import java.io.InputStream;

/**
 *
 * @author josem
 */
public class Fonts {
    private Font font=null;
    public String instruments = "InstrumentSans-VariableFont_wdth,wght.ttf";
    
    
    public Font fontV(String name, int style, float size){
        try{
            InputStream is = getClass().getResourceAsStream(name);
            font = Font.createFont(Font.TRUETYPE_FONT, is);

        } catch(Exception ex){
            System.err.println(name+" No se cargo la fuente");
            font = new Font("Calibrr", Font.PLAIN, 16);
        }
        Font tfont = font.deriveFont(style, size);
        return tfont;
    }
    
}
