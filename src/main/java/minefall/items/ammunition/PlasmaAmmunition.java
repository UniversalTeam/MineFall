package minefall.items.ammunition;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * @author SeamusFD
 */
public class PlasmaAmmunition extends Item{
    public PlasmaAmmunition() {

        super();
        setUnlocalizedName("plasmaAmmunition");
        this.setHasSubtypes(true);
        this.setCreativeTab(CreativeTabs.tabCombat);
    }
}
