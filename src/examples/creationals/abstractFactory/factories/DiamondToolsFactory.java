/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examples.creationals.abstractFactory.factories;

import examples.creationals.abstractFactory.ToolFactory;
import examples.creationals.abstractFactory.tools.axes.Axe;
import examples.creationals.abstractFactory.tools.axes.DiamondAxe;
import examples.creationals.abstractFactory.tools.hoes.DiamondHoe;
import examples.creationals.abstractFactory.tools.hoes.Hoe;
import examples.creationals.abstractFactory.tools.pickaxes.DiamondPickaxe;
import examples.creationals.abstractFactory.tools.pickaxes.Pickaxe;
import examples.creationals.abstractFactory.tools.shovels.DiamondShovel;
import examples.creationals.abstractFactory.tools.shovels.Shovel;

/**
 *
 * @author Julian
 */
public class DiamondToolsFactory implements ToolFactory {
    @Override
    public Axe createAxe() {
        return new DiamondAxe();
    }

    @Override
    public Pickaxe createPickaxe() {
        return new DiamondPickaxe();
    }

    @Override
    public Hoe createHoe() {
        return new DiamondHoe();
    }

    @Override
    public Shovel createShovel() {
        return new DiamondShovel();
    }
}
