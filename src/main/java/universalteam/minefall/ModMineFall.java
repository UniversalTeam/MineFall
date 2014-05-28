package universalteam.minefall;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import universalteam.minefall.libs.ModReference;
import universalteam.minefall.proxies.CommonProxy;

@Mod(modid = ModReference.MODID, name = ModReference.MODNAME, version = ModReference.VERSION, dependencies = "required-after:universalcore@")
public class ModMineFall
{
	@SidedProxy(clientSide = "ClientProxy", serverSide = "CommonProxy")
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