/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examples.creationals.abstractFactory.tools.shovels;

/**
 *
 * @author Julian
 */
public class StoneShovel implements Shovel {
    @Override
    public void dig() {
        System.out.println("La pala de piedra cavo la tierra en 0.2 segundos ");
    }

    @Override
    public void makePath() {
        System.out.println("Se realizo un camino simple con la pala de piedra");
    }
}
