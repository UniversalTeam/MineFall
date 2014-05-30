package universalteam.minefall.armour;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import universalteam.minefall.proxies.CommonProxy;

public class ItemArmourMCOR extends ItemArmor {
    private int armorType;

    public ItemArmourMCOR(ItemArmor.ArmorMaterial armourmaterial, int renderIndex, int armorType)
    {
        super(armourmaterial, renderIndex, armorType);
        this.setCreativeTab(CreativeTabs.tabCombat);
        this.armorType = armorType;
    }

    @Override
    public String getUnlocalizedName()
    {
        switch (armorType)
        {
            case 0:
                return "helmetMCOR";
            case 1:
                return "chestplateMCOR";
            case 2:
                return "leggingsMCOR";
            case 3:
                return "bootsMCOR";
            default:
                return "";
        }
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String layer)
    {
        if (slot == 2)
            return "minefall:example.png";

        return "minefall:example.png";
    }

    @Override
    public void registerIcons(IIconRegister reg)
    {
        if (this == CommonProxy.helmetMCOR)
            this.itemIcon = reg.registerIcon("minefall:example.png");

        if (this == CommonProxy.chestplateMCOR)
            this.itemIcon = reg.registerIcon("minefall:example.png");

        if (this == CommonProxy.leggingsMCOR)
            this.itemIcon = reg.registerIcon("minefall:example.png");

        if (this == CommonProxy.bootsMCOR)
            this.itemIcon = reg.registerIcon("minefall:example.png");
    }
}
