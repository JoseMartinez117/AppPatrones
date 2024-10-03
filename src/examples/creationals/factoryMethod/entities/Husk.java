/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examples.creationals.factoryMethod.entities;

import examples.creationals.factoryMethod.Enemy;

/**
 *
 * @author Julian
 */
public class Husk implements Enemy{

    @Override
    public void attack() {
        System.out.println("El Disecado muerde al jugador");
    }

    @Override
    public void jump() {
        System.out.println("El Disecado salta medio metro");
    }

    @Override
    public void move() {
        System.out.println("El Disecado cojea hacia el jugador");
    }

    @Override
    public void die() {
        System.out.println("El Disecado deja caer carne podrida");
    }
    
}
