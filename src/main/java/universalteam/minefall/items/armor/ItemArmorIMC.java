package universalteam.minefall.items.armor;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import universalteam.minefall.libs.ModReference;
import universalteam.minefall.proxies.CommonProxy;

public class ItemArmorIMC extends ItemArmor
{
	private int armorType;

	public ItemArmorIMC(ArmorMaterial armorMaterial, int renderIndex, int armortype)
	{
		super(armorMaterial, renderIndex, armortype);
		this.setCreativeTab(CreativeTabs.tabCombat);
		this.armorType = armortype;
	}

	@Override
	public String getUnlocalizedName()
	{
		switch (armorType)
		{
			case 0:
				return "helmetIMC";
			case 1:
				return "chestplateIMC";
			case 2:
				return "leggingsIMC";
			case 3:
				return "bootsIMC";
			default:
				return "";
		}
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String layer)
	{
		if (slot == 2)
			return ModReference.MODID + ":IMC_Armor2.png";

		return ModReference.MODID + ":IMC_Armor1.png";
	}

	@Override
	public void registerIcons(IIconRegister reg)
	{
		if (this == CommonProxy.helmetIMC)
			this.itemIcon = reg.registerIcon("minefall:example.png");

		if (this == CommonProxy.chestplateIMC)
			this.itemIcon = reg.registerIcon("minefall:example.png");

		if (this == CommonProxy.leggingsIMC)
			this.itemIcon = reg.registerIcon("minefall:example.png");

		if (this == CommonProxy.bootsIMC)
			this.itemIcon = reg.registerIcon("minefall:example.png");
	}
}
