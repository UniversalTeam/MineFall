package universalteam.minefall.proxies;

import cpw.mods.fml.client.registry.ClientRegistry;
import net.minecraftforge.client.MinecraftForgeClient;
import universalteam.minefall.client.render.item.RenderItemShotgun;
import universalteam.minefall.client.render.tile.TESRCell;
import universalteam.minefall.client.render.tile.TESRPipe;
import universalteam.minefall.compat.MFPluginListener;
import universalteam.minefall.tileentity.TileCell;
import universalteam.minefall.tileentity.TileEnergyPipe;

public class ClientProxy extends CommonProxy
{
	@Override
	public void preInit()
	{
		super.preInit();

		initTESRs();

		initItemRenders();
	}

	@Override
	public void init()
	{
		super.init();

		MFPluginListener.handleClient();
	}

	@Override
	public void postInit()
	{
		super.postInit();
	}

	public void initTESRs()
	{
		ClientRegistry.bindTileEntitySpecialRenderer(TileEnergyPipe.class, new TESRPipe());
		ClientRegistry.bindTileEntitySpecialRenderer(TileCell.class, new TESRCell());
	}

	public void initItemRenders()
	{
		MinecraftForgeClient.registerItemRenderer(eVA8Shotgun, new RenderItemShotgun());
	}
}
