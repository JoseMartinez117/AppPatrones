/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examples.creationals.builder.equipment;

/**
 *
 * @author Julian
 */
public class Boots {
    private String bootsName;
    private double protectionPoints;
    private int durability;

    public Boots() {
    }

    public Boots(String bootsName, double protectionPoints, int durability) {
        this.bootsName = bootsName;
        this.protectionPoints = protectionPoints;
        this.durability = durability;
    }

    public String getArmorName() {
        return bootsName;
    }

    public void setArmorName(String armorName) {
        this.bootsName = armorName;
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
        return "Boots{" +
                "bootsName='" + bootsName + '\'' +
                ", protectionPoints=" + protectionPoints +
                ", durability=" + durability +
                '}';
    }
}