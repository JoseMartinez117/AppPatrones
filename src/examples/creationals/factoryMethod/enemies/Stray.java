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
public class Stray implements Enemy{

    @Override
    public void attack() {
        System.out.println("El Errante dispara flechas de lentitud al jugador");
    }

    @Override
    public void jump() {
        System.out.println("El Errante salta un metro y 25 centimetros");
    }

    @Override
    public void move() {
        System.out.println("El Errante corre lejos del jugador");
    }

    @Override
    public void die() {
        System.out.println("El Errante deja caer huesos y flechas de lentitud");
    }
    
}
