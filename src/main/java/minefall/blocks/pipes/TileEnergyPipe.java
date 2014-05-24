package minefall.blocks.pipes;

import minefall.blocks.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.tileentity.*;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import universalcore.api.energy.IEnergyConnection;

public class TileEnergyPipe extends TileEntity implements IEnergyConnection{

    public TileEnergyPipe tile;

    public boolean canDrawConnection(ForgeDirection direction) {

          return true;
    }
}
