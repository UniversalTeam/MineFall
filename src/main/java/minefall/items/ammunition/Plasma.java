package minefall.items.ammunition;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 *@author SeamusFD
 */
public class Plasma extends Item {
    public Plasma() {

        super();
        setUnlocalizedName("plasma");
        this.setHasSubtypes(true);
        this.setCreativeTab(CreativeTabs.tabCombat);
    }
}
