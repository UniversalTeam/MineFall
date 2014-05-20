package minefall.blocks.pipes;

import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.util.ForgeDirection;
import universalcore.api.energy.IEnergyConnection;

public class TileEnergyPipe extends TileEntity implements IEnergyConnection{

    public boolean canDrawConnection(ForgeDirection direction) {

        return canDrawConnection(ForgeDirection.UNKNOWN);
    }


}
