/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examples.creationals.abstractFactory.tools.pickaxes;

/**
 *
 * @author Julian
 */
public class DiamondPickaxe implements Pickaxe {
    @Override
    public void mine() {
        System.out.println("El pico de diamante tardo en romper el bloque 0.95 segundos");
    }

    @Override
    public void dropMineral() {
        System.out.println("El pico de diamante obtuvo 4 minerales extra");
    }
}
