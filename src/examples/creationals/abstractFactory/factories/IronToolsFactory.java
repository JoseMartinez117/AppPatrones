/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examples.creationals.abstractFactory.factories;

import examples.creationals.abstractFactory.ToolFactory;
import examples.creationals.abstractFactory.tools.axes.Axe;
import examples.creationals.abstractFactory.tools.axes.IronAxe;
import examples.creationals.abstractFactory.tools.hoes.IronHoe;
import examples.creationals.abstractFactory.tools.hoes.Hoe;
import examples.creationals.abstractFactory.tools.pickaxes.IronPickaxe;
import examples.creationals.abstractFactory.tools.pickaxes.Pickaxe;
import examples.creationals.abstractFactory.tools.shovels.IronShovel;
import examples.creationals.abstractFactory.tools.shovels.Shovel;

/**
 *
 * @author Julian
 */
public class IronToolsFactory implements ToolFactory {
    @Override
    public Axe createAxe() {
        return new IronAxe();
    }

    @Override
    public Pickaxe createPickaxe() {
        return new IronPickaxe();
    }

    @Override
    public Hoe createHoe() {
        return new IronHoe();
    }

    @Override
    public Shovel createShovel() {
        return new IronShovel();
    }
}
