/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examples.creationals.builder;

import examples.creationals.builder.builders.BootsBuilder;
import examples.creationals.builder.builders.ChesplateBuilder;
import examples.creationals.builder.builders.HelmetBuilder;
import examples.creationals.builder.builders.LeggingsBuilder;
import examples.creationals.builder.builders.WeaponBuilder;
import examples.creationals.builder.builders.ZombieBuilder;
import examples.creationals.builder.equipment.Boots;
import examples.creationals.builder.equipment.Chesplate;
import examples.creationals.builder.equipment.Helmet;
import examples.creationals.builder.equipment.Leggings;
import examples.creationals.builder.equipment.Weapon;

/**
 *
 * @author Julian
 */
public class Director {
    private ZombieBuilder zb;
    private WeaponBuilder wb;
    private HelmetBuilder hb;
    private ChesplateBuilder cb;
    private LeggingsBuilder lb;
    private BootsBuilder bb;
    
    public Zombie constructZombieHard(){
        zb.setName("Zombie Dificil");
        zb.setHealthPoints(40);
        zb.setWeapon(constructTrindet());
        zb.setHelmet(constructDiamondHelmet());
        zb.setChesplate(constructDiamondChesplate());
        zb.setLeggings(constructDiamondLeggings());
        zb.setBoots(constructDiamondBoots());
        return zb.build();
    }
    
    public Zombie constructZombieNormal(){
        zb.setName("Zombie Normal");
        zb.setHealthPoints(20);
        zb.setWeapon(constructShield());
        zb.setHelmet(constructIronHelmet());
        zb.setChesplate(constructGoldChesplate());
        zb.setLeggings(constructIronLeggings());
        zb.setBoots(constructGoldBoots());
        return zb.build();
    }

    public Zombie constructZombieEasy(ZombieBuilder builder){
        zb.setName("Zombie Facil");
        zb.setHealthPoints(10);
        return zb.build();
    }

    private Weapon constructTrindet() {
        wb.setName("Trindente");
        wb.setDurability(250);
        wb.setDamage(9);
        return wb.build();
    }
    
    private Weapon constructShield() {
        wb.setName("Escudo");
        wb.setDurability(336);
        wb.setDamage(2);
        return wb.build();
    }
    
    private Helmet constructDiamondHelmet() {
        hb.setName("Casco de Diamante");
        hb.setDurability(363);
        hb.setProtectionPoints(3);
        return hb.build();
    }
     
    private Helmet constructGoldHelmet() {
        hb.setName("Casco de Oro");
        hb.setDurability(77);
        hb.setProtectionPoints(2);
        return hb.build();
    }
    
    private Helmet constructIronHelmet() {
        hb.setName("Casco de Hierro");
        hb.setDurability(165);
        hb.setProtectionPoints(2);
        return hb.build();
    }
    
    private Chesplate constructDiamondChesplate() {
        cb.setName("Pechera de Diamante");
        cb.setDurability(528);
        cb.setProtectionPoints(8);
        return cb.build();
    }
     
    private Chesplate constructGoldChesplate() {
        cb.setName("Pechera de Oro");
        cb.setDurability(112);
        cb.setProtectionPoints(5);
        return cb.build();
    }
    
    private Chesplate constructIronChesplate() {
        cb.setName("Pechera de Hierro");
        cb.setDurability(240);
        cb.setProtectionPoints(6);
        return cb.build();
    }
    
    private Leggings constructDiamondLeggings() {
        lb.setName("Pantalones de Diamante");
        lb.setDurability(495);
        lb.setProtectionPoints(6);
        return lb.build();
    }
     
    private Leggings constructGoldLeggings() {
        lb.setName("Pantalones de Oro");
        lb.setDurability(105);
        lb.setProtectionPoints(3);
        return lb.build();
    }
    
    private Leggings constructIronLeggings() {
        lb.setName("Pantalones de Hierro");
        lb.setDurability(225);
        lb.setProtectionPoints(5);
        return lb.build();
    }
    
    private Boots constructDiamondBoots() {
        bb.setName("Botas de Diamante");
        bb.setDurability(429);
        bb.setProtectionPoints(3);
        return bb.build();
    }
     
    private Boots constructGoldBoots() {
        bb.setName("Botas de Oro");
        bb.setDurability(91);
        bb.setProtectionPoints(1);
        return bb.build();
    }
    
    private Boots constructIronBoots() {
        bb.setName("Botas de Hierro");
        bb.setDurability(195);
        bb.setProtectionPoints(2);
        return bb.build();
    }
    
    
       

    
    
    
    
    
}
