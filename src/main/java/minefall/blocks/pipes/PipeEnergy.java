package minefall.blocks.pipes;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.util.ForgeDirection;
import universalcore.api.energy.IEnergyConnection;

public class PipeEnergy extends Block implements IEnergyConnection{

    public PipeEnergy(Material material){
        super(Material.glass);
    }

    public boolean canDrawConnection(ForgeDirection direction){
        return canDrawConnection(ForgeDirection.UNKNOWN);
    }
}
