/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examples.creationals.abstractFactory.tools.shovels;

/**
 *
 * @author Julian
 */
public class DiamondShovel implements Shovel {
    @Override
    public void dig() {
        System.out.println("La pala de diamante cavo la tierra en 0.1 segundos ");
    }

    @Override
    public void makePath() {
        System.out.println("Se realizo un camino exepcional con la pala de diamante");
    }
}
