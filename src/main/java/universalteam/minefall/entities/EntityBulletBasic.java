package universalteam.minefall.entities;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public abstract class EntityBulletBasic extends EntityThrowable
{
	public EntityBulletBasic(World world)
	{
		super(world);
	}

	public EntityBulletBasic(World world, EntityLivingBase entity)
	{
		super(world, entity);
	}

	public EntityBulletBasic(World world, double x, double y, double z)
	{
		super(world, x, y, z);
	}

	public abstract float getSpeed();

	public abstract float getdamage();

	public float getDamageVSEntity(Entity entity)
	{
		return getdamage();
	}

	public DamageSource getDamageSource()
	{
		return DamageSource.causeThrownDamage(this, this.getThrower());
	}

	@Override
	protected void onImpact(MovingObjectPosition mop)
	{
		if (mop.entityHit != null)
		{
			Entity entity = mop.entityHit;
			entity.attackEntityFrom(getDamageSource(), getDamageVSEntity(entity));
		}

		if (!this.worldObj.isRemote)
			this.setDead();
	}
}