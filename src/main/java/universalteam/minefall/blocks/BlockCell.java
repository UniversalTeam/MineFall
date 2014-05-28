package universalteam.minefall.blocks;

import universalteam.minefall.tileentity.TileCell;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockCell extends BlockContainer{

    public BlockCell(){
        super(Material.glass);
	    this.setHardness(10.0F);
	    this.setCreativeTab(CreativeTabs.tabBlock);
	    this.setBlockName("cellT1");
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
