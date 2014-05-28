package minefall.proxies;

import cpw.mods.fml.client.registry.ClientRegistry;
import minefall.client.render.item.RenderItemShotgun;
import minefall.compat.MFPluginListener;
import minefall.tileentity.TileCell;
import minefall.tileentity.TileEnergyPipe;
import minefall.renderers.RendererCell;
import minefall.renderers.RendererPipe;
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
		MinecraftForgeClient.registerItemRenderer(rCarbine, new RenderItemShotgun()); //TODO: apply to proper gun
	}
}
