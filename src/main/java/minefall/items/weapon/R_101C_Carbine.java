package minefall.items.weapon;

import minefall.entities.PlasmaBolt;
import minefall.libs.ModReference;
import minefall.proxies.CommonProxy;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class R_101C_Carbine extends Item
{
	public R_101C_Carbine()
	{
		this.setUnlocalizedName("rCarbine");
		this.setCreativeTab(CreativeTabs.tabCombat);
	}

	@Override
	public void registerIcons(IIconRegister par1IconRegister)
	{
		this.itemIcon = par1IconRegister.registerIcon(ModReference.MODID + ":r_101C_Carbine");
	}

	@Override
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World world, EntityPlayer player)
	{
		if (player.capabilities.isCreativeMode || player.inventory.consumeInventoryItem(CommonProxy.plasmaAmmunition))
//			--par1ItemStack.stackSize;

		world.playSoundAtEntity(player, "random.bow", 0.5f, 0.4f / (itemRand.nextFloat() * 0.4f + 0.8f));

		if (!world.isRemote)
			world.spawnEntityInWorld(new PlasmaBolt(world, player));

		return par1ItemStack;

	}
}
