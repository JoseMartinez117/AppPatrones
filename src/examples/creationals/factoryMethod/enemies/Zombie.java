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
public class Zombie implements Enemy{

    @Override
    public void attack() {
        System.out.println("El Zombie araña al jugador");
    }

    @Override
    public void jump() {
        System.out.println("El Zombie salta un metro");
    }

    @Override
    public void move() {
        System.out.println("El Zombie camina hacia el jugador");
    }

    @Override
    public void die() {
        System.out.println("El Zombie deja caer carne podrida");
    }
    
}
