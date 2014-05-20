package minefall.blocks.pipes;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockEnergyPipe extends BlockContainer{

    public BlockEnergyPipe(Material material) {
        super(Material.glass);
    }

    @Override
    public TileEntity createNewTileEntity(World world, int par2) {
        return new TileEnergyPipe();
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
