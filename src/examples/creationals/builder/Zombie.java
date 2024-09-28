/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examples.creationals.builder;

import examples.creationals.builder.equipment.Weapon;
import examples.creationals.builder.equipment.Helmet;
import examples.creationals.builder.equipment.Chesplate;
import examples.creationals.builder.equipment.Leggings;
import examples.creationals.builder.equipment.Boots;

/**
 *
 * @author Julian
 */
public class Zombie {
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
        return "Zombie{" +
                "\n name='" + name + '\'' +
                "\n healthPoints=" + healthPoints +
                "\n weapon=" + weapon +
                "\n helmet=" + helmet +
                "\n chesplate=" + chesplate +
                "\n leggings=" + leggings +
                "\n boots=" + boots +
                '}';
    }
}
