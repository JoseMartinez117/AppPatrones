/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examples.creationals.factoryMethod.enemies;

import examples.creationals.factoryMethod.Enemy;

/**
 *
 * @author Julian
 */
public class Drowned implements Enemy{

    @Override
    public void attack() {
        System.out.println("El Ahogado golpea al jugador con un tridente");
    }

    @Override
    public void jump() {
        System.out.println("El Ahogado nada hacia la superficie");
    }

    @Override
    public void move() {
        System.out.println("El Ahogado nada hacia el jugador");
    }

    @Override
    public void die() {
        System.out.println("El Ahogado deja caer lingotes de cobre");
    }
    
}
