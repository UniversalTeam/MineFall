package minefall;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import minefall.libs.ModReference;
import minefall.proxies.CommonProxy;

@Mod(modid = ModReference.MODID, name = ModReference.MODNAME, version = ModReference.VERSION, dependencies = "required-after:universalcore@")
public class ModMineFall
{
	@SidedProxy(clientSide = "minefall.proxies.ClientProxy", serverSide = "minefall.proxies.CommonProxy")
	public static CommonProxy proxy;

	@Mod.Instance(ModReference.MODID)
	public static ModMineFall instance;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		proxy.preInit();
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
		proxy.init();
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		proxy.postInit();
	}
}
