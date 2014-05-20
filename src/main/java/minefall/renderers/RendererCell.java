package minefall.renderers;

import minefall.libs.ModReference;
import minefall.models.ModelCell;
import minefall.models.ModelPipe;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class RendererCell extends TileEntitySpecialRenderer {

    private static final ResourceLocation texture = new ResourceLocation(ModReference.MODID + ":" + "textures/models/texturecell.png");

    private ModelCell model;

    public RendererCell(){
        this.model = new ModelCell();
    }

    Minecraft mc = Minecraft.getMinecraft();

    public void renderTileEntityAt(TileEntity tileentity, double x, double y,double z, float f) {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)x + 0.5F, (float)y + 1.5F, (float)z + 0.5F);
        GL11.glRotatef(180, 0F, 0F, 1F);
        this.bindTexture(texture);
        GL11.glPushMatrix();
        model.renderModel(0.0625F);
        GL11.glPopMatrix();
        GL11.glPopMatrix();
    }
}
