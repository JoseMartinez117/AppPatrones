/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examples.creationals.abstractFactory.tools.hoes;

/**
 *
 * @author Julian
 */
public class GoldHoe implements Hoe {
    @Override
    public void plow() {
        System.out.println("La azada de piedra tardo 0.3 segundos en arar el suelo");
    }

    @Override
    public void harvest() {
        System.out.println("La azada de piedra obtuvo 0 item extra");
    }
}
