package universalteam.minefall.network;

import codechicken.lib.packet.PacketCustom;
import codechicken.lib.packet.PacketCustom.IClientPacketHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.network.play.INetHandlerPlayClient;
import universalteam.minefall.libs.ModReference;

public class MFSPH implements IClientPacketHandler
{
	public static final String channel = ModReference.CHANNEL;

	@Override
	public void handlePacket(PacketCustom packet, Minecraft mc, INetHandlerPlayClient netHandler)
	{
		switch (packet.getType())
		{
			git 
		}
	}
}
