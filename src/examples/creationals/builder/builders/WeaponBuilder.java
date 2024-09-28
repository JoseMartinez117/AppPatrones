/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examples.creationals.builder.builders;

import examples.creationals.builder.equipment.Weapon;



/**
 *
 * @author Julian
 */
public class WeaponBuilder implements Builder{
    
    private String name;
    private double damage;
    private int durability;

    public void setName(String name) {
        this.name = name;
    }

    public void setDamage(double protectionPoints) {
        this.damage = protectionPoints;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    @Override
    public Weapon build() {
        Weapon weapon =  new Weapon(this.name, this.damage, this.durability);
        reset();
        return weapon;    
    }

    private void reset() {
        this.name = null;
        this.damage = 0;
        this.durability = 0;
    }
    
}
