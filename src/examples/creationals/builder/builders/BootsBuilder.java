/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examples.creationals.builder.builders;

import examples.creationals.builder.equipment.Boots;



/**
 *
 * @author Julian
 */
public class BootsBuilder implements Builder{
    
    private String name;
    private double protectionPoints;
    private int durability;

    public void setName(String name) {
        this.name = name;
    }

    public void setProtectionPoints(double protectionPoints) {
        this.protectionPoints = protectionPoints;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    @Override
    public Boots build() {
        Boots boots =  new Boots(this.name, this.protectionPoints, this.durability);
        reset();
        return boots;    
    }

    private void reset() {
        this.name = null;
        this.protectionPoints = 0;
        this.durability = 0;
    }
    
}
