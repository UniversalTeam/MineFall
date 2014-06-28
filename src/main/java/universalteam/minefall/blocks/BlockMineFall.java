package universalteam.minefall.blocks;

import net.minecraft.block.material.Material;
import universalteam.minefall.ModMineFall;
import universalteam.minefall.libs.ModReference;
import universalteam.universalcore.block.BlockAdvanced;

public abstract class BlockMineFall extends BlockAdvanced
{
	protected BlockMineFall(Material material)
	{
		super(material);
	}

	@Override
	public Object getModInstace()
	{
		return ModMineFall.instance;
	}

	@Override
	public String getModID()
	{
		return ModReference.MODID.toLowerCase();
	}
}
