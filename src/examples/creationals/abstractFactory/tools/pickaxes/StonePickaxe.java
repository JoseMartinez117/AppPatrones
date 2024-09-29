/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examples.creationals.abstractFactory.tools.pickaxes;

/**
 *
 * @author Julian
 */
public class StonePickaxe implements Pickaxe {
    @Override
    public void mine() {
        System.out.println("El pico de piedra tardo en romper el bloque 1.9 segundos");
    }

    @Override
    public void dropMineral() {
        System.out.println("El pico de piedra obtuvo 2 minerales extra");
    }
}
