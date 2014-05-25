package minefall.items;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import minefall.items.ammunition.PlasmaAmmunition;
import minefall.items.weapon.R_101C_Carbine;
import net.minecraft.item.Item;

public class ModItems{

    //Primary Weapons
    public static Item r_101C_Carbine;
    public static Item r_97_Compact_SMG;
    public static Item smart_Pistol_Mk5;
    public static Item eVA_8_Shotgun;
    public static Item longbow_DMR_Sniper;
    public static Item cAR_SMG;
    public static Item g2A4_Rifle;
    public static Item hemlok_BF_R;
    public static Item krabr_AP_Sniper;
    public static Item spitfire_LMG;

    //Sidearm
    public static Item b3_Wingman;
    public static Item hammond_P2011;
    public static Item rE_45_Autopistol;

    //Anti-titan Weapons
    public static Item sideWinder_AT_SMR;
    public static Item archer_Heavy_Rocket;
    public static Item mGL;
    public static Item charge_Rifle;

    //Ordance
    public static Item data_Knife;
    public static Item frag_Grenade;
    public static Item satchel_Charge;
    public static Item arc_Grenade;
    public static Item arc_Mine;

    //Tactical Ability
    public static Item cloak;
    public static Item stim;
    public static Item active_Radar_Pulse;

    //Tier 1 Kit
    public static Item enhanced_Parkour_Kit;
    public static Item explosive_Pack;
    public static Item power_Cell;
    public static Item quick_Reload_Kit;
    public static Item run_N_Gun_Kit;
    public static Item stealth_Kit;

    //Tier 2 kit
    public static Item dome_Shield_Battery;
    public static Item minion_Detector;
    public static Item warpfall_Transmitter;
    public static Item dead_Mans_Trigger;
    public static Item guardian_Chip;
    public static Item the_icepick;

    //Ammunitions

    public static Item plasmaAmmunition;


    public static void PreInit(){
        plasmaAmmunition = new PlasmaAmmunition();
        GameRegistry.registerItem(plasmaAmmunition, "plasmaAmmuntion");
        LanguageRegistry.addName(plasmaAmmunition, "Plasma Ammunition");

        r_101C_Carbine = new R_101C_Carbine();
        GameRegistry.registerItem(r_101C_Carbine, "r_101C_Carbine");
        LanguageRegistry.addName(r_101C_Carbine, "R-101C Carbine");
    //    Shotgun = new Gun();
    }
}
