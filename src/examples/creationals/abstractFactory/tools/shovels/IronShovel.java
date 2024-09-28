/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examples.creationals.abstractFactory.tools.shovels;

/**
 *
 * @author Julian
 */
public class IronShovel implements Shovel {
    @Override
    public void dig() {
        System.out.println("La pala de hierro cavo la tierra en 0.15 segundos ");
    }

    @Override
    public void makePath() {
        System.out.println("Se realizo un camino agradable con la pala de hierro");
    }
}
