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
