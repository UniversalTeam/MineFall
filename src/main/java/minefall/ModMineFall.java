package minefall;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import minefall.blocks.ModBlocks;
import minefall.items.ModItems;
import minefall.libs.ModReference;
import minefall.proxies.CommonProxy;
import minefall.recipes.WeaponRecipes;
import universalcore.libs.ReferenceCore;



@Mod(modid = ModReference.MODID, name = ModReference.MODNAME, version = ModReference.VERSION, dependencies = "required-after:universalcore@[" + ReferenceCore.VERSION + ",)")
public class ModMineFall {

    @SidedProxy(clientSide = "minefall.proxies.ClientProxy", serverSide = "minefall.proxies.CommonProxy")
    public static CommonProxy proxy;

	@Mod.Instance(ModReference.MODID)
	public static ModMineFall instance;

    @Mod.EventHandler
    public void PreInit(FMLPreInitializationEvent event){

        ModBlocks.preInit();
        ModItems.PreInit();
        WeaponRecipes.PreInit();
        proxy.registerRenderers();
    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event){

    }

    @Mod.EventHandler
    public void PostInit(FMLPostInitializationEvent event){

    }

}
