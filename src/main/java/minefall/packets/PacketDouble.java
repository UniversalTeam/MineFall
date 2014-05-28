package minefall.packets;

import cpw.mods.fml.common.network.NetworkRegistry;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import minefall.libs.ModReference;
import net.minecraft.world.World;

public abstract class PacketDouble extends AbstractPacket
{
	protected double x, y, z;

	public PacketDouble()
	{

	}

	public PacketDouble(double x, double y, double z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
	}

	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf buffer)
	{
		buffer.writeDouble(x);
		buffer.writeDouble(y);
		buffer.writeDouble(z);
	}

	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf buffer)
	{
		x = buffer.readDouble();
		y = buffer.readDouble();
		z = buffer.readDouble();
	}

	public NetworkRegistry.TargetPoint getTargetPoint(World world)
	{
		return getTargetPoint(world, ModReference.PACKET_UPDATER);
	}

	public NetworkRegistry.TargetPoint getTargetPoint(World world, double updateDistance)
	{
		return new NetworkRegistry.TargetPoint(world.provider.dimensionId, x, y, z, updateDistance);
	}
}
