package universalteam.minefall.entities;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityPlasmaBolt extends EntityBulletBasic
{
	private float speed = 15f;

    public int bulletShake = 0;

	public EntityPlasmaBolt(World world)
	{
		super(world);
	}

	public EntityPlasmaBolt(World world, EntityLivingBase entity)
	{
		super(world, entity);
	}

	public EntityPlasmaBolt(World world, double x, double y, double z)
	{
		super(world, x, y, z);
	}

	protected float getGravityVelocity()
	{
		this.motionX *= speed;
		this.motionY *= speed;
		this.motionZ *= speed;
		return 0F;
	}

    protected void onImpact(MovingObjectPosition movingobjectposition) {
        for (int i = 0; i < 8; ++i)
        {
            this.worldObj.spawnParticle("snowballpoof", this.posX, this.posY, this.posZ, 0.0D, 0.0D, 0.0D);
        }

        if (!this.worldObj.isRemote)
        {
            this.setDead();
        }
    }

	@Override
	public float getSpeed()
	{
		return 0;
	}

	@Override
	public float getdamage()
	{
		return 5;
	}
}
