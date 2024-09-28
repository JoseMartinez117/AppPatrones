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
public class Bogged implements Enemy{

    @Override
    public void attack() {
        System.out.println("El Enpantanado dispara flechas de veneno al jugador");
    }

    @Override
    public void jump() {
        System.out.println("El Enpantanado salta medio metro");
    }

    @Override
    public void move() {
        System.out.println("El Enpantanado camina lejos del jugador");
    }

    @Override
    public void die() {
        System.out.println("El Enpantanado deja caer setas y flechas de veneno");
    }
    
}
