package universalteam.minefall.proxies;

import codechicken.lib.packet.PacketCustom;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import universalteam.minefall.ModMineFall;
import universalteam.minefall.blocks.BlockCell;
import universalteam.minefall.blocks.BlockEnergyPipe;
import universalteam.minefall.compat.MFPluginListener;
import universalteam.minefall.items.ammunition.ItemPlasma;
import universalteam.minefall.items.ammunition.ItemPlasmaAmmunition;
import universalteam.minefall.items.armor.ItemArmorBasic;
import universalteam.minefall.items.weapon.ItemEVA8Shotgun;
import universalteam.minefall.items.weapon.ItemrCarbine;
import universalteam.minefall.network.MFSPH;
import universalteam.minefall.tileentity.TileCell;
import universalteam.minefall.tileentity.TileEnergyPipe;

public class CommonProxy
{
	public static CreativeTabs tabWeapons;
	public static CreativeTabs tabCraftig;
	public static CreativeTabs tabBlocks;
	public static CreativeTabs tabPower;

	public static Block energyPipe;
	public static Block cellT1;

	//Weapons
	public static Item rCarbine;
	public static Item rCompactSMG;
	public static Item smartPistolMk5;
	public static Item eVA8Shotgun;
	public static Item longbowSniper;
	public static Item SMG;
	public static Item g2A4Rifle;
	public static Item hemlok;
	public static Item krabrSniper;
	public static Item spitfireLMG;

	public static Item b3Wingman;
	public static Item hammondP2;
	public static Item rAutopistol;

	public static Item sideWinderSMR;
	public static Item HeavyRocket;
	public static Item mGL;
	public static Item chargeRifle;

	public static Item Knife;
	public static Item fragGrenade;
	public static Item satchelCharge;
	public static Item arcGrenade;
	public static Item arcMine;

	public static Item cloak;
	public static Item stim;
	public static Item activeRadarPulse;

	public static Item enhancedParkourKit;
	public static Item explosivePack;
	public static Item powerCell;
	public static Item quickReloadKit;
	public static Item runNGunKit;
	public static Item stealthKit;

	public static Item domeShieldBattery;
	public static Item minionDetector;
	public static Item warpfallTransmitter;
	public static Item deadMansTrigger;
	public static Item guardianChip;
	public static Item theIcepick;

	//Ammo
	public static Item plasmaAmmunition;
	public static Item plasma;

	//Armors
	public static ArmorMaterial armorMaterialIMC;
	public static ArmorMaterial armorMaterialMCOR;

	public static Item helmetIMC;
	public static Item chestPlateIMC;
	public static Item leggingsIMC;
	public static Item bootsIMC;

	public static Item helmetMCOR;
	public static Item chestPlateMCOR;
	public static Item leggingsMCOR;
	public static Item bootsMCOR;

	public void preInit()
	{
		initCreativeTabs();

		initBlocks();

		initArmorMaterials();

		initItems();

		initRecipes();
	}

	public void init()
	{
		PacketCustom.assignHandler(MFSPH.channel, new MFSPH());

		MFPluginListener.handleCommon();
	}

	public void postInit()
	{

	}

	protected void initCreativeTabs()
	{
		tabWeapons = new CreativeTabs("tabWeapons")
		{
			@Override
			public Item getTabIconItem()
			{
				return rCarbine;
			}
		};

		tabCraftig = new CreativeTabs("tabCrafting")
		{
			@Override
			public Item getTabIconItem()
			{
				return plasma;
			}
		};

		tabBlocks = new CreativeTabs("tabBlocks")
		{
			@Override
			public Item getTabIconItem()
			{
				return new Item();
			}
		};

		tabPower = new CreativeTabs("tabPower")
		{
			@Override
			public Item getTabIconItem()
			{
				return new Item();
			}
		};
	}

	protected void initBlocks()
	{
		energyPipe = new BlockEnergyPipe();
		cellT1 = new BlockCell();

		GameRegistry.registerBlock(energyPipe, "Energy Pipe");
		GameRegistry.registerBlock(cellT1, "cell");

		GameRegistry.registerTileEntity(TileEnergyPipe.class, "energypipe");
		GameRegistry.registerTileEntity(TileCell.class, "cell");
	}

	protected void initArmorMaterials()
	{
		armorMaterialIMC = EnumHelper.addArmorMaterial("IMC", 33, new int[]{3, 8, 6, 3}, 10);
		armorMaterialMCOR = EnumHelper.addArmorMaterial("MCOR", 33, new int[]{3, 8, 6, 3}, 10);
	}

	protected void initItems()
	{
		rCarbine = new ItemrCarbine();
		eVA8Shotgun = new ItemEVA8Shotgun();
		plasmaAmmunition = new ItemPlasmaAmmunition();
		plasma = new ItemPlasma();

		int IMCRenderIndex = ModMineFall.proxy.registerArmor("IMC");
		helmetIMC = new ItemArmorBasic(armorMaterialIMC, IMCRenderIndex, 0, "helmetIMC", "imc");
		chestPlateIMC = new ItemArmorBasic(armorMaterialIMC, IMCRenderIndex, 1, "chestPlateIMC", "imc");
		leggingsIMC = new ItemArmorBasic(armorMaterialIMC, IMCRenderIndex, 2, "leggingsIMC", "imc");
		bootsIMC = new ItemArmorBasic(armorMaterialIMC, IMCRenderIndex, 3, "bootsIMC", "imc");

		int MCORRenderIndex = ModMineFall.proxy.registerArmor("MCOR");
		helmetMCOR = new ItemArmorBasic(armorMaterialMCOR, MCORRenderIndex, 0, "helmetMCOR", "mcor");
		chestPlateMCOR = new ItemArmorBasic(armorMaterialMCOR, MCORRenderIndex, 1, "chestPlateMCOR", "mcor");
		leggingsMCOR = new ItemArmorBasic(armorMaterialMCOR, MCORRenderIndex, 2, "leggingsMCOR", "mcor");
		bootsMCOR = new ItemArmorBasic(armorMaterialMCOR, MCORRenderIndex, 3, "bootsMCOR", "mcor");

		GameRegistry.registerItem(plasmaAmmunition, "plasmaAmmuntion");
		GameRegistry.registerItem(rCarbine, "rCarbine");
		GameRegistry.registerItem(eVA8Shotgun, "eVA8Shotgun");
		GameRegistry.registerItem(plasma, "plasma");

		GameRegistry.registerItem(helmetIMC, "helmetIMC");
		GameRegistry.registerItem(chestPlateIMC, "chestplateIMC");
		GameRegistry.registerItem(leggingsIMC, "leggingsIMC");
		GameRegistry.registerItem(bootsIMC, "bootsIMC");

		GameRegistry.registerItem(helmetMCOR, "helmetMCOR");
		GameRegistry.registerItem(chestPlateMCOR, "chestplateMCOR");
		GameRegistry.registerItem(leggingsMCOR, "leggingsMCOR");
		GameRegistry.registerItem(bootsMCOR, "bootsMCOR");

	}

	protected void initRecipes()
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

	public int registerArmor(String armor)
	{
		return 0;
	}
}
