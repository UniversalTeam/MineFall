package minefall.blocks.cells;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.util.ForgeDirection;
//import universalcore.api.energy.EnergyCache;
import universalcore.api.energy.IEnergyCache;

public class TileCell extends TileEntity /*implements IEnergyCache*/{

    /*protected EnergyCache storage = new EnergyCache(40000);

    @Override
    public void readFromNBT(NBTTagCompound nbt) {

        super.readFromNBT(nbt);
        storage.readFromNBT(nbt);
    }

    @Override
    public void writeToNBT(NBTTagCompound nbt) {

        super.writeToNBT(nbt);
        storage.writeToNBT(nbt);
    }


    @Override
    public int drawEnergy(ForgeDirection direction, int maxDrawn) {

        return storage.drawEnergy(direction, maxDrawn);
    }

    @Override
    public int withdrawEnergy(ForgeDirection direction, int maxWithDrawn) {

        return storage.withdrawEnergy(direction, maxWithDrawn);
    }

    @Override
    public int getEnergyStored(ForgeDirection direction) {

        return storage.getEnergyStored(direction);
    }

    @Override
    public int getMaxEnergyStored(ForgeDirection direction) {

        return storage.getMaxEnergyStored(direction);
    }*/
}
