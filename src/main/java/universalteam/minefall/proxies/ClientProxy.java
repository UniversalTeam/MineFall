package universalteam.minefall.proxies;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraftforge.client.MinecraftForgeClient;
import universalteam.minefall.client.render.entity.RenderBulletBasic;
import universalteam.minefall.client.render.item.RenderItemShotgun;
import universalteam.minefall.client.render.tile.TESRCell;
import universalteam.minefall.client.render.tile.TESRPipe;
import universalteam.minefall.compat.MFPluginListener;
import universalteam.minefall.entities.EntityBulletBasic;
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

	protected void initTESRs()
	{
		ClientRegistry.bindTileEntitySpecialRenderer(TileEnergyPipe.class, new TESRPipe());
		ClientRegistry.bindTileEntitySpecialRenderer(TileCell.class, new TESRCell());
	}

	protected void initItemRenders()
	{
		MinecraftForgeClient.registerItemRenderer(eVA8Shotgun, new RenderItemShotgun());
		RenderingRegistry.registerEntityRenderingHandler(EntityBulletBasic.class, new RenderBulletBasic());
	}

	@Override
	public int registerArmor(String armor)
	{
		return RenderingRegistry.addNewArmourRendererPrefix(armor);
	}
}
