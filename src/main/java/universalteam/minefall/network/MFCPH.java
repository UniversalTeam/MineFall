package universalteam.minefall.network;

import codechicken.lib.packet.PacketCustom;
import codechicken.lib.packet.PacketCustom.IServerPacketHandler;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.network.play.INetHandlerPlayServer;
import universalteam.minefall.libs.ModReference;

public class MFCPH implements IServerPacketHandler
{
	public static final String channel = ModReference.CHANNEL;

	@Override
	public void handlePacket(PacketCustom packet, EntityPlayerMP player, INetHandlerPlayServer netHandler)
	{
		switch (packet.getType())
		{

		}
	}
}
