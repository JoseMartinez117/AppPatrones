/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examples.creationals.prototype.equipment;

import examples.creationals.prototype.Prototype;

/**
 *
 * @author Julian
 */
public class Weapon implements Prototype{
    private String weaponName;
    private double damage;
    private int durability;

    public Weapon(){

    }

    public Weapon(String weaponName, double damage, int durability) {
        this.weaponName = weaponName;
        this.damage = damage;
        this.durability = durability;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    @Override
    public String toString() {
        return "Weapon - " + Integer.toHexString(System.identityHashCode(this))  +  "{" +
                "weaponName='" + weaponName + '\'' +
                ", damage=" + damage +
                ", durability=" + durability +
                '}';
    }
    
    @Override
    public Weapon clone() {
        return new Weapon(this.weaponName, this.damage, this.durability);
    }
}
