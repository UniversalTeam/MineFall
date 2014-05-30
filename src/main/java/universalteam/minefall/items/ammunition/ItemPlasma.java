package universalteam.minefall.items.ammunition;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemPlasma extends Item
{
	public ItemPlasma()
	{
		this.setUnlocalizedName("plasma");
		this.setHasSubtypes(true);
		this.setCreativeTab(CreativeTabs.tabCombat);
	}
}
