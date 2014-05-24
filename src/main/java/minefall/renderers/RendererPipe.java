package minefall.renderers;

import minefall.blocks.ModBlocks;
import minefall.blocks.pipes.TileEnergyPipe;
import minefall.libs.ModReference;
import minefall.models.ModelPipe;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.common.util.ForgeDirection;
import org.lwjgl.opengl.GL11;


public class RendererPipe extends TileEntitySpecialRenderer {


    private static final ResourceLocation texture = new ResourceLocation(ModReference.MODID + ":" + "textures/models/texturepipe.png");

    private ModelPipe model;

    public TileEnergyPipe tile;

    public RendererPipe(){
        this.model = new ModelPipe();
    }

    Minecraft mc = Minecraft.getMinecraft();

    public void renderTileEntityAt(TileEntity tileentity, double x, double y,double z, float f) {
        GL11.glPushMatrix();
        GL11.glTranslatef((float) x + 0.5F, (float) y + 1.5F, (float) z + 0.5F);
        GL11.glRotatef(180, 0F, 0F, 1F);
        this.bindTexture(texture);
        GL11.glPushMatrix();
        model.renderModel(0.0625F);
        GL11.glPopMatrix();
        GL11.glPopMatrix();
    }
}

