/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examples.creationals.abstractFactory;

import examples.creationals.abstractFactory.tools.axes.Axe;
import examples.creationals.abstractFactory.tools.hoes.Hoe;
import examples.creationals.abstractFactory.tools.pickaxes.Pickaxe;
import examples.creationals.abstractFactory.tools.shovels.Shovel;

/**
 *
 * @author Julian
 */
public interface ToolFactory
{
    Axe createAxe();
    Pickaxe createPickaxe();
    Hoe createHoe();
    Shovel createShovel();
}
