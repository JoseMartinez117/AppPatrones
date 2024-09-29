/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examples.creationals.prototype;

import examples.creationals.prototype.equipment.Weapon;
import examples.creationals.prototype.equipment.Helmet;
import examples.creationals.prototype.equipment.Chesplate;
import examples.creationals.prototype.equipment.Leggings;
import examples.creationals.prototype.equipment.Boots;

/**
 *
 * @author Julian
 */
public class Zombie implements Prototype{
    private String name;
    private double healthPoints;
    private Weapon weapon;
    private Helmet helmet;
    private Chesplate chesplate;
    private Leggings leggings;
    private Boots boots;

    public Zombie(String name, double healthPoints, Weapon weapon, Helmet helmet, Chesplate chesplate, Leggings leggings, Boots boots) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.weapon = weapon;
        this.helmet = helmet;
        this.chesplate = chesplate;
        this.leggings = leggings;
        this.boots = boots;
    }

    public String getName() {
        return name;
    }

    public double getHealthPoints() {
        return healthPoints;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public Helmet getHelmet() {
        return helmet;
    }

    public Chesplate getChesplate() {
        return chesplate;
    }

    public Leggings getLeggings() {
        return leggings;
    }

    public Boots getBoots() {
        return boots;
    }

    @Override
    public String toString() {
        return "Zombie - " + Integer.toHexString(System.identityHashCode(this))  +  "{" +
                "\n name='" + name + '\'' +
                "\n healthPoints=" + healthPoints +
                "\n weapon=" + weapon +
                "\n helmet=" + helmet +
                "\n chesplate=" + chesplate +
                "\n leggings=" + leggings +
                "\n boots=" + boots +
                '}';
    }
    
     @Override
    public Zombie clone() {
        return new Zombie(this.name, this.healthPoints, this.weapon.clone(), this.helmet.clone(), this.chesplate.clone(), this.leggings.clone(), this.boots.clone());
    }
}
