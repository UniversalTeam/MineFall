package minefall.items;

import cpw.mods.fml.common.registry.GameRegistry;
import minefall.items.ammunition.PlasmaAmmunition;
import minefall.items.weapon.AssaultRifle;
import net.minecraft.item.Item;

public class ModItems{

    //Weapons Generic
    public static Item shotgun;
    public static Item pistol;
    public static Item sPistol;
    public static Item sniper;
    public static Item SMG;
    public static Item assualtRifle;

    //Special Weapons
    public static Item swiftM1;
    public static Item midM1;
    public static Item ogreM1;

    public static Item swift2;
    public static Item midM2;
    public static Item ogreM2;

    public static Item swift3;
    public static Item midM3;
    public static Item ogreM3;

    //Ammunitions

    public static Item plasmaAmmunition;


    public static void PreInit(){
        plasmaAmmunition = new PlasmaAmmunition().setUnlocalizedName("plasmaAmmunition");
        GameRegistry.registerItem(plasmaAmmunition, "Plasma Ammunition");

        assualtRifle = new AssaultRifle();
        GameRegistry.registerItem(assualtRifle, "Assualt Rifle");
    //    Shotgun = new Gun();
    }
}
