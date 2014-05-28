package minefall.proxies;

import cpw.mods.fml.client.registry.ClientRegistry;
import minefall.tileentity.TileCell;
import minefall.tileentity.TileEnergyPipe;
import minefall.renderers.RendererCell;
import minefall.renderers.RendererPipe;

public class ClientProxy extends CommonProxy
{
	@Override
	public void preInit()
	{
		super.preInit();

		initTESRs();
	}

	@Override
	public void init()
	{
		super.init();
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
}
