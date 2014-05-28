package minefall.entities;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class PlasmaBolt extends EntityThrowable
{
	private float speed = 15f;

	public PlasmaBolt(World par1World)
	{
		super(par1World);
	}

	public PlasmaBolt(World par1World, EntityLivingBase par2EntityLiving)
	{
		super(par1World, par2EntityLiving);
	}

	public PlasmaBolt(World par1World, double par2, double par4, double par6)
	{
		super(par1World, par2, par4, par6);
	}

	protected float getGravityVelocity()
	{
		this.motionX *= speed;
		this.motionY *= speed;
		this.motionZ *= speed;
		return 0F;
	}

	@Override
	protected void onImpact(MovingObjectPosition movingobjectposition)
	{
		if (movingobjectposition.entityHit != null)
		{
			byte damage = 5;

			if (movingobjectposition.entityHit instanceof EntityBlaze)
			{
				damage = 3;
			}

			movingobjectposition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), (float) damage);

			if (!this.worldObj.isRemote)
			{
				this.setDead();
			}
		}
	}
}
