/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Julian
 */
public class JsonInformation {
    
    private FileReader reader;
    private JSONParser parser;
    private JSONObject json;

    public JsonInformation() throws FileNotFoundException, IOException, ParseException {
        reader = new FileReader("src/Assets/Patrones.json");
        parser = new JSONParser();
        json = (JSONObject) parser.parse(reader);
    }
    
    public String getInfo(String key, String element){
        JSONObject pattern = (JSONObject) json.get(key);
        String information = (String) pattern.get(element);
        return information;
    }
    
    public String getList(String key, String element){
        String information = "";
        String text;
        
        JSONObject pattern = (JSONObject) json.get(key);
        JSONArray list = (JSONArray) pattern.get(element);
        
        for (int i = 0; i < list.size(); i++) {
            String info = (String) list.get(i);
            information = information + (i+1) + ". " + info + "<p><p>";
        }
        
        return information;
    }
}
