package minefall.recipes;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.registry.GameRegistry;
import minefall.items.ModItems;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

/**
 *@author SeamusFD
 */
public class WeaponRecipes {

    @Mod.EventHandler
    public static void PreInit() {
    GameRegistry.addRecipe(new ItemStack(ModItems.plasmaAmmunition, 16),
            "yxy",
            "yxy",
            'y', Items.paper, 'x',  ModItems.plasma);

    GameRegistry.addRecipe(new ItemStack(ModItems.plasma, 10),
            "yxy",
            "xzx",
            "yxy",
            'y', Items.blaze_powder, 'x', Items.gunpowder, 'z', Items.ender_pearl);
    }
}
