/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examples.creationals.abstractFactory.tools.axes;

/**
 *
 * @author Julian
 */
public class StoneAxe implements Axe {
    @Override
    public void cut() {
        System.out.println("El hacha de piedra tardo en cortar el bloque 0.95 segundos");
    }

    @Override
    public void attack() {
        System.out.println("El hacha de piedra hizo un daño de 5 puntos de salud");
    }
}
