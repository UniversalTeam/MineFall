package universalteam.minefall.armour;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import universalteam.minefall.proxies.CommonProxy;

/**
 *@author SeamusFD
 */
public class IMCArmour extends ItemArmor {

    private String [] armourTypes = new String[] {"helmetIMC", "chestplateIMC", "leggingsIMC", "bootsIMC"};
    public IMCArmour(ArmorMaterial armourmaterial, int renderIndex, int armourType) {
        super(armourmaterial, renderIndex, armourType);
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String layer) {
        if (stack.getItem().equals(CommonProxy.helmetIMC) || stack.getItem().equals(CommonProxy.chestplateIMC) || stack.getItem().equals(CommonProxy.bootsIMC)) {
            return "minefall:examplepng.png";
        }

        if (stack.getItem().equals(CommonProxy.leggingsIMC)) {
            return "minefall:exaplepng.png";
        }

        else return null;
    }

    @Override
    public void registerIcons(IIconRegister reg) {
        if (this == CommonProxy.helmetIMC) {
            this.itemIcon = reg.registerIcon("minefall:example.png");
        }

        if (this == CommonProxy.chestplateIMC) {
            this.itemIcon = reg.registerIcon("minefall:example.png");
        }

        if (this == CommonProxy.leggingsIMC) {
            this.itemIcon = reg.registerIcon("minefall:example.png");
        }

        if (this == CommonProxy.bootsIMC) {
            this.itemIcon = reg.registerIcon("minefall:example.png");
        }
    }
}
