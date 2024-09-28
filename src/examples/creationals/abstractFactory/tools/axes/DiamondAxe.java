/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examples.creationals.abstractFactory.tools.axes;

/**
 *
 * @author Julian
 */
public class DiamondAxe implements Axe{

    @Override
    public void cut() {
        System.out.println("El hacha de diamante tardo en cortar el bloque 0.5 segundos");
    }

    @Override
    public void attack() {
        System.out.println("El hacha de diamante hizo un daño de 7 puntos de salud");
    }
    
}
