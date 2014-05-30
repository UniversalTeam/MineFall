package universalteam.minefall.proxies;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import universalteam.minefall.armour.IMCArmour;
import universalteam.minefall.blocks.BlockCell;
import universalteam.minefall.blocks.BlockEnergyPipe;
import universalteam.minefall.compat.MFPluginListener;
import universalteam.minefall.items.ammunition.ItemPlasma;
import universalteam.minefall.items.ammunition.ItemPlasmaAmmunition;
import universalteam.minefall.items.weapon.ItemEVA8Shotgun;
import universalteam.minefall.items.weapon.ItemrCarbine;
import universalteam.minefall.tileentity.TileCell;
import universalteam.minefall.tileentity.TileEnergyPipe;

public class CommonProxy
{
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

    //Armours
    public static ItemArmor.ArmorMaterial enumArmourMaterialIMC = EnumHelper.addArmorMaterial("IMC", 33, new int[] {3, 8, 6, 3}, 10);

    public static Item helmetIMC;
    public static Item chestplateIMC;
    public static Item leggingsIMC;
    public static Item bootsIMC;

	public void preInit()
	{
		initBlocks();

		initItems();

		initRecipes();
	}

	public void init()
	{
		MFPluginListener.handleCommon();
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
		rCarbine = new ItemrCarbine();
		eVA8Shotgun = new ItemEVA8Shotgun();
		plasmaAmmunition = new ItemPlasmaAmmunition();
		plasma = new ItemPlasma();

        //Armours
        RenderingRegistry.addNewArmourRendererPrefix("5");
        helmetIMC = new IMCArmour(CommonProxy.enumArmourMaterialIMC, 5, 0).setUnlocalizedName("helmetIMC").setCreativeTab(CreativeTabs.tabCombat);
        chestplateIMC = new IMCArmour(CommonProxy.enumArmourMaterialIMC, 5, 1).setUnlocalizedName("chestplateIMC").setCreativeTab(CreativeTabs.tabCombat);
        leggingsIMC = new IMCArmour(CommonProxy.enumArmourMaterialIMC, 5, 2).setUnlocalizedName("leggingsIMC").setCreativeTab(CreativeTabs.tabCombat);
        bootsIMC = new IMCArmour(CommonProxy.enumArmourMaterialIMC, 5, 3).setUnlocalizedName("bootsIMC").setCreativeTab(CreativeTabs.tabCombat);


        GameRegistry.registerItem(plasmaAmmunition, "plasmaAmmuntion");
		GameRegistry.registerItem(rCarbine, "rCarbine");
		GameRegistry.registerItem(eVA8Shotgun, "eVA8Shotgun");
		GameRegistry.registerItem(plasma, "plasma");

        //Armours
        GameRegistry.registerItem(helmetIMC, "helmetIMC");
        GameRegistry.registerItem(chestplateIMC, "chestplateIMC");
        GameRegistry.registerItem(leggingsIMC, "leggingsIMC");
        GameRegistry.registerItem(bootsIMC, "bootsIMC");

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
