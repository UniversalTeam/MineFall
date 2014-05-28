package universalteam.minefall.items.ammunition;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemPlasmaAmmunition extends Item
{
	public ItemPlasmaAmmunition()
	{
		this.setUnlocalizedName("plasmaAmmunition");
		this.setHasSubtypes(true);
		this.setCreativeTab(CreativeTabs.tabCombat);
	}
}
