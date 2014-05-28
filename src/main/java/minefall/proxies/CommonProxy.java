package minefall.proxies;

import cpw.mods.fml.common.registry.GameRegistry;
import minefall.blocks.BlockCell;
import minefall.blocks.BlockEnergyPipe;
import minefall.items.ammunition.ItemPlasma;
import minefall.items.ammunition.ItemPlasmaAmmunition;
import minefall.items.weapon.R_101C_Carbine;
import minefall.tileentity.TileCell;
import minefall.tileentity.TileEnergyPipe;
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CommonProxy
{
	public static Block energyPipe;
	public static Block cellT1;

	public static Item r_101C_Carbine;
	public static Item r_97_Compact_SMG;
	public static Item smart_Pistol_Mk5;
	public static Item eVA_8_Shotgun;                   //TODO: need simpler in-code names
	public static Item longbow_DMR_Sniper;
	public static Item cAR_SMG;
	public static Item g2A4_Rifle;
	public static Item hemlok_BF_R;
	public static Item krabr_AP_Sniper;
	public static Item spitfire_LMG;

	public static Item b3_Wingman;
	public static Item hammond_P2011;
	public static Item rE_45_Autopistol;

	public static Item sideWinder_AT_SMR;
	public static Item archer_Heavy_Rocket;
	public static Item mGL;
	public static Item charge_Rifle;

	public static Item data_Knife;
	public static Item frag_Grenade;
	public static Item satchel_Charge;
	public static Item arc_Grenade;
	public static Item arc_Mine;

	public static Item cloak;
	public static Item stim;
	public static Item active_Radar_Pulse;

	public static Item enhanced_Parkour_Kit;
	public static Item explosive_Pack;
	public static Item power_Cell;
	public static Item quick_Reload_Kit;
	public static Item run_N_Gun_Kit;
	public static Item stealth_Kit;

	public static Item dome_Shield_Battery;
	public static Item minion_Detector;
	public static Item warpfall_Transmitter;
	public static Item dead_Mans_Trigger;
	public static Item guardian_Chip;
	public static Item the_icepick;

	public static Item plasmaAmmunition;

	public static Item plasma;

	public void preInit()
	{
		initBlocks();

		initItems();

		initRecipes();
	}

	public void init()
	{

	}

	public void postInit()
	{

	}

	public void initBlocks()
	{
		energyPipe = new BlockEnergyPipe();
		cellT1 = new BlockCell();

		GameRegistry.registerBlock(energyPipe, "Energy Pipe");
		GameRegistry.registerBlock(cellT1, "cell");

		GameRegistry.registerTileEntity(TileEnergyPipe.class, "energypipe");
		GameRegistry.registerTileEntity(TileCell.class, "cell");
	}

	public void initItems()
	{
		r_101C_Carbine = new R_101C_Carbine();
		plasmaAmmunition = new ItemPlasmaAmmunition();
		plasma = new ItemPlasma();

		GameRegistry.registerItem(plasmaAmmunition, "plasmaAmmuntion");
		GameRegistry.registerItem(r_101C_Carbine, "r_101C_Carbine");
		GameRegistry.registerItem(plasma, "plasma");
	}

	public void initRecipes()
	{
		GameRegistry.addRecipe(new ItemStack(plasmaAmmunition, 16),
				"yxy",
				"yxy",
				'y', Items.paper, 'x', plasma);

		GameRegistry.addRecipe(new ItemStack(plasma, 10),
				"yxy",
				"xzx",
				"yxy",
				'y', Items.blaze_powder, 'x', Items.gunpowder, 'z', Items.ender_pearl);
	}
}
