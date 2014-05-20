package minefall.blocks.cells;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockCell extends BlockContainer{

    public BlockCell(Material material){
        super(Material.glass);
    }

    @Override
    public TileEntity createNewTileEntity(World world, int par2) {
        return new TileCell();
    }

    @Override
    public int getRenderType() {
        return -1;
    }

    @Override
    public boolean isOpaqueCube() {
        return false;
    }

    public boolean renderAsNormalBlock() {
        return false;
    }
}
