package universalteam.minefall.client.render.item;

import codechicken.lib.render.CCModel;
import codechicken.lib.render.CCRenderState;
import codechicken.lib.vec.RedundantTransformation;
import codechicken.lib.vec.Rotation;
import codechicken.lib.vec.SwapYZ;
import codechicken.lib.vec.TransformationList;
import codechicken.lib.vec.Translation;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;

import java.util.Map;

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
			case INVENTORY:
				t = new TransformationList(new RedundantTransformation());
				break;
			case ENTITY:
				t = new TransformationList(new RedundantTransformation());
				break;
			case EQUIPPED:
				t = new TransformationList(new RedundantTransformation());
				break;
			case EQUIPPED_FIRST_PERSON:
				t = new TransformationList(new RedundantTransformation(), new Rotation(180, 1, 0, 0), new Rotation(70, 0, 1, 0), new Translation(0, 0.8, 0));
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
