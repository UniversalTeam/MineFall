package universalteam.minefall.tileentity;

import universalteam.minefall.network.MFCPH;
import universalteam.universalcore.tile.TileAdvanced;

public abstract class TileMineFall extends TileAdvanced
{
	@Override
	public String getChannelName()
	{
		return MFCPH.channel;
	}
}
