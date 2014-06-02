package universalteam.minefall.items.ammunition;

import net.minecraft.item.Item;
import universalteam.minefall.proxies.CommonProxy;

public class ItemPlasma extends Item
{
	public ItemPlasma()
	{
		this.setUnlocalizedName("plasma");
		this.setHasSubtypes(true);
		this.setCreativeTab(CommonProxy.tabCraftig);
	}
}
