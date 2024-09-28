/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examples.creationals.factoryMethod.factories;

import examples.creationals.factoryMethod.Enemy;
import examples.creationals.factoryMethod.enemies.Skeleton;

/**
 *
 * @author Julian
 */
public class SkeletonFactory extends EnemyFactory{
    @Override
    public Enemy createEnemy() {
        return new Skeleton();
    }
}
