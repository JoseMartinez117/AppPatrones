/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examples.creationals.builder.builders;

import examples.creationals.builder.Zombie;
import examples.creationals.builder.equipment.Boots;
import examples.creationals.builder.equipment.Chesplate;
import examples.creationals.builder.equipment.Helmet;
import examples.creationals.builder.equipment.Leggings;
import examples.creationals.builder.equipment.Weapon;

/**
 *
 * @author Julian
 */
public class ZombieBuilder implements Builder{

    private String name;
    private double healthPoints;
    private Weapon weapon;
    private Helmet helmet;
    private Chesplate chesplate;
    private Leggings leggings;
    private Boots boots;

    public void setName(String name) {
        this.name = name;
    }

    public void setHealthPoints(double healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void setHelmet(Helmet helmet) {
        this.helmet = helmet;
    }

    public void setChesplate(Chesplate chesplate) {
        this.chesplate = chesplate;
    }

    public void setLeggings(Leggings leggings) {
        this.leggings = leggings;
    }

    public void setBoots(Boots boots) {
        this.boots = boots;
    }

    public Zombie build(){
        Zombie zombie =  new Zombie(this.name, this.healthPoints, this.weapon, this.helmet, this.chesplate, this.leggings, this.boots);
        reset();
        return zombie;
    }

    public ZombieBuilder(){
    }

    public void reset(){
        this.name = null;
        this.healthPoints = 0;
        this.helmet = null;
        this.chesplate = null;
        this.leggings = null;
        this.boots = null;
        this.weapon = null;
    }
}
