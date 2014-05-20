package minefall.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelPipe extends ModelBase
{
  //fields
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
  
  public ModelPipe()
  {
    textureWidth = 128;
    textureHeight = 64;
    
      Shape1 = new ModelRenderer(this, 0, 0);
      Shape1.addBox(0F, 0F, 0F, 8, 8, 8);
      Shape1.setRotationPoint(-4F, 13F, -4F);
      Shape1.setTextureSize(128, 64);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
/*    Shape2 = new ModelRenderer(this, 73, 0);
      Shape2.addBox(0F, 0F, 0F, 6, 6, 6);
      Shape2.setRotationPoint(-3F, 14F, 2F);
      Shape2.setTextureSize(128, 64);
      Shape2.mirror = true;
      setRotation(Shape2, 0F, 0F, 0F);
      Shape3 = new ModelRenderer(this, 43, 0);
      Shape3.addBox(0F, 0F, 0F, 6, 6, 6);
      Shape3.setRotationPoint(-3F, 14F, -8F);
      Shape3.setTextureSize(128, 64);
      Shape3.mirror = true;
      setRotation(Shape3, 0F, 0F, 0F);
      */
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Shape1.render(f5);
 //   Shape2.render(f5);
 //   Shape3.render(f5);
  }

    public void renderModel(float f){
        Shape1.render(f);
    //    Shape2.render(f);
    //    Shape3.render(f);
    }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}
