package universalteam.minefall.items.weapon;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import universalteam.minefall.libs.ModReference;
import universalteam.minefall.proxies.CommonProxy;

public class ItemEVA8Shotgun extends Item
{
	public ItemEVA8Shotgun()
	{
		this.setUnlocalizedName("eVA8Shotgun");
		this.setCreativeTab(CommonProxy.minefallTabWeapons);
	}

	@Override
	public void registerIcons(IIconRegister par1IconRegister)
	{
		this.itemIcon = par1IconRegister.registerIcon(ModReference.MODID + ":eVA8Shotgun");
	}

	@Override
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World world, EntityPlayer player)
	{
		if (player.capabilities.isCreativeMode || player.inventory.consumeInventoryItem(CommonProxy.plasmaAmmunition))
		{
//			--par1ItemStack.stackSize;
		}

		world.playSoundAtEntity(player, "random.bow", 0.5f, 0.4f / (itemRand.nextFloat() * 0.4f + 0.8f));

		if (!world.isRemote)
		{
			world.spawnEntityInWorld(new EntitySnowball(world, player));
			world.spawnEntityInWorld(new EntitySnowball(world, player));
			world.spawnEntityInWorld(new EntitySnowball(world, player));
			world.spawnEntityInWorld(new EntitySnowball(world, player));
			world.spawnEntityInWorld(new EntitySnowball(world, player));
			world.spawnEntityInWorld(new EntitySnowball(world, player));
		}
		return par1ItemStack;

	}
}
