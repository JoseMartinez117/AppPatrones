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
public class Skeleton implements Enemy{

    @Override
    public void attack() {
        System.out.println("El Esqueleto dispara flechas al jugador");
    }

    @Override
    public void jump() {
        System.out.println("El Esqueleto salta un metro");
    }

    @Override
    public void move() {
        System.out.println("El Esqueleto se aleja del jugador");
    }

    @Override
    public void die() {
        System.out.println("El Esqueleto deja caer huesos y flechas");
    }
    
}
