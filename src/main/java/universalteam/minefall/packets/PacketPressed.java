package universalteam.minefall.packets;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;

@Deprecated
public class PacketPressed extends AbstractPacket
{
	private int keyIndex;

	public PacketPressed()
	{

	}

	public PacketPressed(int keyPressedIndex)
	{
		keyIndex = keyPressedIndex;
	}

	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf buffer)
	{
		buffer.writeInt(keyIndex);
	}

	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf buffer)
	{
		keyIndex = buffer.readInt();
	}

	@Override
	public void handleClientSide(EntityPlayer player)
	{

	}

	@Override
	public void handleServerSide(EntityPlayer player)
	{
		switch (keyIndex)
		{
			//TODO: implement
		}
	}

}