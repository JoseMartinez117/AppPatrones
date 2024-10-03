/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examples.creationals.factoryMethod.factories;

import examples.creationals.factoryMethod.Enemy;
import examples.creationals.factoryMethod.entities.Bogged;

/**
 *
 * @author Julian
 */
public class BoggedFactory extends EnemyFactory{
    /**
 *
 * @return Julian
 */
    @Override
    public Enemy createEnemy() {
        return new Bogged();
    }
}
