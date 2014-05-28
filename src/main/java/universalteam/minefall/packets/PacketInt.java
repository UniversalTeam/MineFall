package universalteam.minefall.packets;

import cpw.mods.fml.common.network.NetworkRegistry;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import universalteam.minefall.libs.ModReference;
import net.minecraft.world.World;

public abstract class PacketInt extends AbstractPacket
{
	protected int x, y, z;

	public PacketInt()
	{

	}

	public PacketInt(int x, int y, int z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
	}

	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf buffer)
	{
		buffer.writeInt(x);
		buffer.writeInt(y);
		buffer.writeInt(z);
	}

	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf buffer)
	{
		x = buffer.readInt();
		y = buffer.readInt();
		z = buffer.readInt();
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
