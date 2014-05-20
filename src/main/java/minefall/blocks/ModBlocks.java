package minefall.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import minefall.blocks.cells.BlockCell;
import minefall.blocks.cells.TileCell;
import minefall.blocks.pipes.*;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class ModBlocks{

    public static Block EnergyPipe;
    public static Block TitanCargo;

    public static Block CellT1;

    public static void preInit(){

        EnergyPipe = new BlockEnergyPipe(Material.glass).setHardness(2.0F).setCreativeTab(CreativeTabs.tabBlock);
        GameRegistry.registerBlock(EnergyPipe, "energypipe");
        GameRegistry.registerTileEntity(TileEnergyPipe.class, "energypipe");

        CellT1 = new BlockCell(Material.glass).setHardness(10.0F).setCreativeTab(CreativeTabs.tabBlock);
        GameRegistry.registerBlock(CellT1, "cell");
        GameRegistry.registerTileEntity(TileCell.class, "cell");
    }
}
