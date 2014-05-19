package minefall;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import minefall.blocks.ModBlocks;
import minefall.items.ModItems;
import minefall.libs.MCMod;
import minefall.libs.ModReference;
import minefall.proxies.CommonProxy;
import minefall.plugins.*;
import universalcore.libs.ReferenceCore;



@Mod(modid = ModReference.MODID,name = ModReference.MODNAME,version = ModReference.VERSION,dependencies = "required-after:universalcore@[" + ReferenceCore.VERSION + ",)")
public class ModMineFall {

    @SidedProxy(clientSide = "minefall.proxies.ClientProxy", serverSide = "minefall.proxies.CommonProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void PreInit(FMLPreInitializationEvent event){

        MCMod.MetaMcMod();
        ModBlocks.preInit();
        ModItems.PreInit();
        proxy.registerRenderers();
    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event){

    }

    @Mod.EventHandler
    public void PostInit(FMLPostInitializationEvent event){

    }

}
