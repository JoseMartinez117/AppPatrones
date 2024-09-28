/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examples.creationals.abstractFactory.tools.hoes;

/**
 *
 * @author Julian
 */
public class DiamondHoe implements Hoe {
    @Override
    public void plow() {
        System.out.println("La azada de diamante tardo 0.5 segundos en arar el suelo");
    }

    @Override
    public void harvest() {
        System.out.println("La azada de diamante obtuvo 5 items extra");
    }
}
