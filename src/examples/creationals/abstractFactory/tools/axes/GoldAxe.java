/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examples.creationals.abstractFactory.tools.axes;

/**
 *
 * @author Julian
 */
public class GoldAxe implements Axe {
    @Override
    public void cut() {
        System.out.println("El hacha de oro tardo en cortar el bloque 0.35 segundos");
    }

    @Override
    public void attack() {
        System.out.println("El hacha de oro hizo un daño de 4 puntos de salud");
    }
}
