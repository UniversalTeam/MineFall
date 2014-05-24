package minefall.items.weapon;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import minefall.ModMineFall;
import minefall.entities.PlasmaBolt;
import minefall.items.ModItems;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

/**
 *@author SeamusFD
 */
public class R_101C_Carbine extends Item{
    public R_101C_Carbine() {

        super();
        setUnlocalizedName("r_101C_Carbine");
        setCreativeTab(CreativeTabs.tabCombat);
    }
// THIS IS AN ATTEMPT AT AN ICON, DID NOT WORK BEFORE I HAD TO PUSH AND GO TO BED
//    @SideOnly(Side.CLIENT)
//    private IIcon[] icons;
//
//    @SideOnly(Side.CLIENT)
//    @Override
//    public void registerIcons(IIconRegister par1IconRegister) {
//        icons = new IIcon[2];
//
//        for (int i = 0; i < icons.length; i++)
//        {
//            icons[i] = par1IconRegister.registerIcon(ModMineFall.modid + ":" + (this.getUnlocalizedName().substring(5)) + i);
//        }
//    }
//
//    @Override
//    public IIcon getIconFromDamage(int par1) {
//        return icons[par1];
//    }

    @Override
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World world, EntityPlayer player) {
        if (player.capabilities.isCreativeMode||player.inventory.consumeInventoryItem(ModItems.plasmaAmmunition)) {
//            --par1ItemStack.stackSize;
        }
            world.playSoundAtEntity(player, "random.bow", 0.5f, 0.4f / (itemRand.nextFloat() * 0.4f + 0.8f));
            if (!world.isRemote) {
                world.spawnEntityInWorld(new PlasmaBolt(world, player) {
                });
            }
        return par1ItemStack;

    }
}
