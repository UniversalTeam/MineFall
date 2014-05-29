package universalteam.minefall.client.render.item;

import codechicken.lib.render.CCModel;
import codechicken.lib.render.CCRenderState;
import codechicken.lib.vec.RedundantTransformation;
import codechicken.lib.vec.Rotation;
import codechicken.lib.vec.Scale;
import codechicken.lib.vec.SwapYZ;
import codechicken.lib.vec.TransformationList;
import codechicken.lib.vec.Translation;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;

import java.util.Map;

import static codechicken.lib.math.MathHelper.pi;

public class RenderItemShotgun implements IItemRenderer
{
	public CCModel gun;

	public RenderItemShotgun()
	{
		Map<String, CCModel> models = CCModel.parseObjModels(new ResourceLocation("minefall:models/shotgun.obj"), 7, new SwapYZ());
		gun = models.get("Gun");
	}

	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type)
	{
		return !type.equals(ItemRenderType.INVENTORY);
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper)
	{
		return true;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data)
	{
		TransformationList t;

		switch (type)
		{
			case ENTITY:
				t = new TransformationList(new Scale(1), new Translation(0, 0, 0.25), new Rotation(-pi/2, 1, 0, 0));
				break;
			case EQUIPPED:
				t = new TransformationList(new Scale(1.5), new Rotation(-pi/2, 1, 0, 0), new Rotation(-pi*3/4, 0, 1, 0), new Translation(0.75, 0.5, 0.75));
				break;
			case EQUIPPED_FIRST_PERSON:
				t = new TransformationList(new Scale(1.5), new Rotation(-pi/2, 1, 0, 0), new Rotation(pi*3/4, 0, 1, 0), new Translation(0.5, 0.5, 0.5));
				break;
			default:
				t = new TransformationList(new RedundantTransformation());
		}

		CCRenderState.reset();
		CCRenderState.useNormals = true;
		CCRenderState.pullLightmap();
		CCRenderState.changeTexture("minefall:textures/models/shotgun.png");
		CCRenderState.startDrawing();
		gun.render(t);
		CCRenderState.draw();
	}
}
