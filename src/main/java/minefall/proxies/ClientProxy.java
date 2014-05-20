package minefall.proxies;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import minefall.blocks.ModBlocks;
import minefall.blocks.cells.TileCell;
import minefall.blocks.pipes.TileEnergyPipe;
import minefall.renderers.*;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends CommonProxy{

    public static final RendererPipe pipeRender = new RendererPipe();

    public void registerRenderers(){
         ClientRegistry.bindTileEntitySpecialRenderer(TileEnergyPipe.class, new RendererPipe());
         ClientRegistry.bindTileEntitySpecialRenderer(TileCell.class, new RendererCell());

        registerItemRenderers();
    }

    public void registerItemRenderers(){

    }
}
