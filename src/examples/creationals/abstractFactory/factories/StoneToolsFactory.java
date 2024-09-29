/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examples.creationals.abstractFactory.factories;

import examples.creationals.abstractFactory.ToolFactory;
import examples.creationals.abstractFactory.tools.axes.Axe;
import examples.creationals.abstractFactory.tools.axes.StoneAxe;
import examples.creationals.abstractFactory.tools.hoes.StoneHoe;
import examples.creationals.abstractFactory.tools.hoes.Hoe;
import examples.creationals.abstractFactory.tools.pickaxes.StonePickaxe;
import examples.creationals.abstractFactory.tools.pickaxes.Pickaxe;
import examples.creationals.abstractFactory.tools.shovels.StoneShovel;
import examples.creationals.abstractFactory.tools.shovels.Shovel;

/**
 *
 * @author Julian
 */
public class StoneToolsFactory implements ToolFactory {
    @Override
    public Axe createAxe() {
        return new StoneAxe();
    }

    @Override
    public Pickaxe createPickaxe() {
        return new StonePickaxe();
    }

    @Override
    public Hoe createHoe() {
        return new StoneHoe();
    }

    @Override
    public Shovel createShovel() {
        return new StoneShovel();
    }
}