/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examples.creationals.abstractFactory.tools.pickaxes;

/**
 *
 * @author Julian
 */
public class GoldPickaxe implements Pickaxe {
   @Override
    public void mine() {
        System.out.println("El pico de oro tardo en romper el bloque 0.65 segundos");
    }

    @Override
    public void dropMineral() {
        System.out.println("El pico de oro obtuvo 1 minerales extra");
    } 
}
