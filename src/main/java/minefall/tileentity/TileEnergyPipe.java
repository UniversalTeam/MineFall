package minefall.tileentity;

import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.util.ForgeDirection;
import universalcore.api.energy.IEnergyConnection;

public class TileEnergyPipe extends TileEntity implements IEnergyConnection
{
	public TileEnergyPipe tile;

	public boolean canDrawConnection(ForgeDirection direction)
	{
		return true;
	}
}