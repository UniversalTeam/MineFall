package minefall.items.weapon;

import minefall.items.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

/**
 *@author SeamusFD
 */
public class AssaultRifle extends Item{
    public AssaultRifle() {

        super();
        setUnlocalizedName("assualtRifle");
        setCreativeTab(CreativeTabs.tabCombat);
    }

    @Override
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World world, EntityPlayer player) {
        if (player.capabilities.isCreativeMode||player.inventory.consumeInventoryItem(ModItems.plasmaAmmunition)) {
//            --par1ItemStack.stackSize;
        }
            world.playSoundAtEntity(player, "random.bow", 0.5f, 0.4f / (itemRand.nextFloat() * 0.4f + 0.8f));
            if (!world.isRemote) {
                world.spawnEntityInWorld(new EntitySnowball(world, player) {
                });
            }
        return par1ItemStack;

    }
}
