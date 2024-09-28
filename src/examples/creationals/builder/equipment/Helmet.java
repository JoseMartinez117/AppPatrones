/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examples.creationals.builder.equipment;

/**
 *
 * @author Julian
 */
public class Helmet {
    private String helmetName;
    private double protectionPoints;
    private int durability;

    public Helmet() {
    }

    public Helmet(String helmetName, double protectionPoints, int durability) {
        this.helmetName = helmetName;
        this.protectionPoints = protectionPoints;
        this.durability = durability;
    }

    public String getArmorName() {
        return helmetName;
    }

    public void setArmorName(String armorName) {
        this.helmetName = armorName;
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
        return "Helmet{" +
                "helmetName='" + helmetName + '\'' +
                ", protectionPoints=" + protectionPoints +
                ", durability=" + durability +
                '}';
    }
}
