package universalteam.minefall.proxies;

import cpw.mods.fml.client.registry.ClientRegistry;
import universalteam.minefall.client.render.item.RenderItemShotgun;
import universalteam.minefall.compat.MFPluginListener;
import universalteam.minefall.tileentity.TileCell;
import universalteam.minefall.tileentity.TileEnergyPipe;
import universalteam.minefall.renderers.RendererCell;
import universalteam.minefall.renderers.RendererPipe;
import net.minecraftforge.client.MinecraftForgeClient;

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
		ClientRegistry.bindTileEntitySpecialRenderer(TileEnergyPipe.class, new RendererPipe());
		ClientRegistry.bindTileEntitySpecialRenderer(TileCell.class, new RendererCell());
	}

	public void initItemRenders()
	{
		MinecraftForgeClient.registerItemRenderer(eVA8Shotgun, new RenderItemShotgun());
	}
}
