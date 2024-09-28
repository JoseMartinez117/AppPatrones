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
public class Chesplate implements Prototype{
    private String chesplateName;
    private double protectionPoints;
    private int durability;

    public Chesplate() {
    }

    public Chesplate(String chesplateName, double protectionPoints, int durability) {
        this.chesplateName = chesplateName;
        this.protectionPoints = protectionPoints;
        this.durability = durability;
    }

    public String getArmorName() {
        return chesplateName;
    }

    public void setArmorName(String armorName) {
        this.chesplateName = armorName;
    }

    public double getProtectionPoints() {
        return protectionPoints;
    }

    public void setProtectionPoints(double protectionPoints) {
        this.protectionPoints = protectionPoints;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    @Override
    public String toString() {
        return "Chesplate - " + Integer.toHexString(System.identityHashCode(this))  +  "{" +
                "chesplateName='" + chesplateName + '\'' +
                ", protectionPoints=" + protectionPoints +
                ", durability=" + durability +
                '}';
    }
    
    @Override
    public Chesplate clone() {
        return new Chesplate(this.chesplateName, this.protectionPoints, this.durability);
    }
}
