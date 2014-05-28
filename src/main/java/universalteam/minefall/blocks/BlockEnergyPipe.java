package universalteam.minefall.blocks;

import universalteam.minefall.tileentity.TileEnergyPipe;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockEnergyPipe extends BlockContainer
{
	public BlockEnergyPipe()
	{
		super(Material.glass);
		this.setHardness(2.0F);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setBlockName("energyPipe");
	}

	@Override
	public TileEntity createNewTileEntity(World world, int par2)
	{
		return new TileEnergyPipe();
	}

	@Override
	public int getRenderType()
	{
		return -1;
	}

	@Override
	public boolean isOpaqueCube()
	{
		return false;
	}

	public boolean renderAsNormalBlock()
	{
		return false;
	}
}
