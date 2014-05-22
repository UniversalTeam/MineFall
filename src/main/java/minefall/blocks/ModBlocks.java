package minefall.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import minefall.blocks.cells.BlockCell;
import minefall.blocks.cells.TileCell;
import minefall.blocks.pipes.*;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class ModBlocks{

    public static Block energyPipe;
    public static Block titanCargo;

    public static Block cellT1;

    public static void preInit(){

        energyPipe = new BlockEnergyPipe(Material.glass).setHardness(2.0F).setCreativeTab(CreativeTabs.tabBlock).setBlockName("EnergyPipe");
        GameRegistry.registerBlock(energyPipe, "Energy Pipe");
        GameRegistry.registerTileEntity(TileEnergyPipe.class, "energypipe");

        cellT1 = new BlockCell(Material.glass).setHardness(10.0F).setCreativeTab(CreativeTabs.tabBlock).setBlockName("Cell Tier 1");
        GameRegistry.registerBlock(cellT1, "cell");
        GameRegistry.registerTileEntity(TileCell.class, "cell");
    }
}
