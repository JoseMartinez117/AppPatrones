/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examples.creationals.abstractFactory.factories;

import examples.creationals.abstractFactory.ToolFactory;
import examples.creationals.abstractFactory.tools.axes.Axe;
import examples.creationals.abstractFactory.tools.axes.GoldAxe;
import examples.creationals.abstractFactory.tools.hoes.GoldHoe;
import examples.creationals.abstractFactory.tools.hoes.Hoe;
import examples.creationals.abstractFactory.tools.pickaxes.GoldPickaxe;
import examples.creationals.abstractFactory.tools.pickaxes.Pickaxe;
import examples.creationals.abstractFactory.tools.shovels.GoldShovel;
import examples.creationals.abstractFactory.tools.shovels.Shovel;

/**
 *
 * @author Julian
 */
public class GoldToolsFactory implements ToolFactory {
    @Override
    public Axe createAxe() {
        return new GoldAxe();
    }

    @Override
    public Pickaxe createPickaxe() {
        return new GoldPickaxe();
    }

    @Override
    public Hoe createHoe() {
        return new GoldHoe();
    }

    @Override
    public Shovel createShovel() {
        return new GoldShovel();
    }
}
