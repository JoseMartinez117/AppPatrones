/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examples.creationals.builder.equipment;

/**
 *
 * @author Julian
 */
public class Leggings {
    private String leggingsName;
    private double protectionPoints;
    private int durability;

    public Leggings() {
    }

    public Leggings(String leggingsName, double protectionPoints, int durability) {
        this.leggingsName = leggingsName;
        this.protectionPoints = protectionPoints;
        this.durability = durability;
    }

    public String getArmorName() {
        return leggingsName;
    }

    public void setArmorName(String armorName) {
        this.leggingsName = armorName;
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
        return "Leggings{" +
                "leggingsName='" + leggingsName + '\'' +
                ", protectionPoints=" + protectionPoints +
                ", durability=" + durability +
                '}';
    }
}
