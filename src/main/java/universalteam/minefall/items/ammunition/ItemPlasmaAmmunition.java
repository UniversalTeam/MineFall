package universalteam.minefall.items.ammunition;

import net.minecraft.item.Item;
import universalteam.minefall.proxies.CommonProxy;

public class ItemPlasmaAmmunition extends Item
{
	public ItemPlasmaAmmunition()
	{
		this.setUnlocalizedName("plasmaAmmunition");
		this.setHasSubtypes(true);
		this.setCreativeTab(CommonProxy.minefallTabCrafting);
	}
}
