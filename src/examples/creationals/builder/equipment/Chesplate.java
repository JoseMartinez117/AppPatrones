/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examples.creationals.builder.equipment;

/**
 *
 * @author Julian
 */
public class Chesplate{
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
        return "Chesplate{" +
                "chesplateName='" + chesplateName + '\'' +
                ", protectionPoints=" + protectionPoints +
                ", durability=" + durability +
                '}';
    }
}
