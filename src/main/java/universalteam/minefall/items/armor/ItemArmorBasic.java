package universalteam.minefall.items.armor;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import universalteam.minefall.libs.ModReference;

public class ItemArmorBasic extends ItemArmor
{
	protected String unlocalizedName;
	protected String layerName;

	public ItemArmorBasic(ArmorMaterial armorMaterial, int renderIndex, int armorType, String unlocalizedName, String layerName)
	{
		super(armorMaterial, renderIndex, armorType);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(CreativeTabs.tabFood);
		this.unlocalizedName = unlocalizedName;
		this.layerName = layerName;
	}

	@Override
	public void registerIcons(IIconRegister register)
	{
		this.itemIcon = register.registerIcon(ModReference.MODID + ":" + unlocalizedName);
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		return ModReference.MODID + ":/textures/models/armor/" + layerName + "_layer_" + (slot == 2 ? "2" : "1") + ".png";
	}
}
