package ravenholmzombie.houseblocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class HB_Blocks {
	
	// Create useless items for creative tabs
	public static Item iconItem;
	public static Item iconItem2;
	
	// Block variables here.
	// Drywall
	public static Block blockDrywall;
		
	// White blocks
	public static Block blockWhiteOut;
	public static Block blockWhiteCorner;
		
	// Red blocks
	public static Block blockRedOut;
	public static Block blockRedCorner;
		
	// Green blocks
	public static Block blockGreenOut;
	public static Block blockGreenCorner;
	
	// Blue blocks
	public static Block blockBlueOut;
	public static Block blockBlueCorner;
	
	// Light Blue Blocks
	public static Block blockLBlueOut;
	public static Block blockLBlueCorner;
	
	// Lime blocks
	public static Block blockLimeOut;
	public static Block blockLimeCorner;
	
	// Pink blocks
	public static Block blockPinkOut;
	public static Block blockPinkCorner;
	
	// Brown blocks
	public static Block blockBrownOut;
	public static Block blockBrownCorner;
	
	// Yellow blocks.
	public static Block blockYellowOut;
	public static Block blockYellowCorner;
	
	// Grey blocks.
	public static Block blockGreyOut;
	public static Block blockGreyCorner;
	
	// Light Grey blocks
	public static Block blockLGreyOut;
	public static Block blockLGreyCorner;
	
	// Orange blocks.
	public static Block blockOrangeOut;
	public static Block blockOrangeCorner;
	
	// Purple blocks.
	public static Block blockPurpleOut;
	public static Block blockPurpleCorner;
	
	//Cyan blocks.
	public static Block blockCyanOut;
	public static Block blockCyanCorner;
	
	//Magenta blocks.
	public static Block blockMagentaOut;
	public static Block blockMagentaCorner;
		
	// Test block.
	public static Block testBlock;
	
	
	// Put all blocks here.
	public static void BlockLibrary() {
		// Creative Tab item.
		iconItem = new ItemIcon().setUnlocalizedName("house").setTextureName("houseblocks:itemBluePanel");
		iconItem2 = new ItemIcon().setUnlocalizedName("house2").setTextureName("houseblocks:itemBlueCorner");
		
		// Drywall Block
		blockDrywall = new BlockDrywall(Material.rock).setBlockName("Drywall").setBlockTextureName("houseblocks:drywall").setCreativeTab(Houseblocks.tabHouseblocks);
				
		// White Blocks
		blockWhiteOut = new BlockWhiteOut(Material.rock).setBlockName("WhiteOutsideSolid").setCreativeTab(Houseblocks.tabHouseblocks);
		blockWhiteCorner = new BlockWhiteCorner(Material.rock).setBlockName("WhiteCorner").setCreativeTab(Houseblocks.tabHBCorner);
				
		// Red Blocks
		blockRedOut = new BlockRedOut(Material.rock).setBlockName("RedOutsideSolid").setCreativeTab(Houseblocks.tabHouseblocks);
		blockRedCorner = new BlockRedCorner(Material.rock).setBlockName("RedCorner").setCreativeTab(Houseblocks.tabHBCorner);
				
		// Green Blocks
		blockGreenOut = new BlockGreenOut(Material.rock).setBlockName("GreenOutsideSolid").setCreativeTab(Houseblocks.tabHouseblocks);
		blockGreenCorner = new BlockGreenCorner(Material.rock).setBlockName("GreenCorner").setCreativeTab(Houseblocks.tabHBCorner);
				
		// Blue Blocks
		blockBlueOut = new BlockBlueOut(Material.rock).setBlockName("BlueOutsideSolid").setCreativeTab(Houseblocks.tabHouseblocks);
		blockBlueCorner = new BlockBlueCorner(Material.rock).setBlockName("BlueCorner").setCreativeTab(Houseblocks.tabHBCorner);
		
		// Light Blue Blocks
		blockLBlueOut = new BlockLBlueOut(Material.rock).setBlockName("BlockLBlueSolid").setCreativeTab(Houseblocks.tabHouseblocks);
		blockLBlueCorner = new BlockLBlueCorner(Material.rock).setBlockName("LBlueCorner").setCreativeTab(Houseblocks.tabHBCorner);
		
		// Lime
		blockLimeOut = new BlockLimeOut(Material.rock).setBlockName("BlockLimeSolid").setCreativeTab(Houseblocks.tabHouseblocks);
		blockLimeCorner = new BlockLimeCorner(Material.rock).setBlockName("LimeCorner").setCreativeTab(Houseblocks.tabHBCorner);
		
		// Pink
		blockPinkOut = new BlockPinkOut(Material.rock).setBlockName("BlockPinkSolid").setCreativeTab(Houseblocks.tabHouseblocks);
		blockPinkCorner = new BlockPinkCorner(Material.rock).setBlockName("PinkCorner").setCreativeTab(Houseblocks.tabHBCorner);
		
		// Brown
		blockBrownOut = new BlockBrownOut(Material.rock).setBlockName("BlockBrownSolid").setCreativeTab(Houseblocks.tabHouseblocks);
		blockBrownCorner = new BlockBrownCorner(Material.rock).setBlockName("BrownCorner").setCreativeTab(Houseblocks.tabHBCorner);
		
		// Yellow
		blockYellowOut = new BlockYellowOut(Material.rock).setBlockName("BlockYellowSolid").setCreativeTab(Houseblocks.tabHouseblocks);
		blockYellowCorner = new BlockYellowCorner(Material.rock).setBlockName("YellowCorner").setCreativeTab(Houseblocks.tabHBCorner);
		
		// Grey
		blockGreyOut = new BlockGreyOut(Material.rock).setBlockName("BlockGreySolid").setCreativeTab(Houseblocks.tabHouseblocks);
		blockGreyCorner = new BlockGreyCorner(Material.rock).setBlockName("GreyCorner").setCreativeTab(Houseblocks.tabHBCorner);
		
		//L Grey
		blockLGreyOut = new BlockLGreyOut(Material.rock).setBlockName("BlockLGreySolid").setCreativeTab(Houseblocks.tabHouseblocks);
		blockLGreyCorner = new BlockLGreyCorner(Material.rock).setBlockName("LGreyCorner").setCreativeTab(Houseblocks.tabHBCorner);
		
		//Orange
		blockOrangeOut = new BlockOrangeOut(Material.rock).setBlockName("BlockOrangeSolid").setCreativeTab(Houseblocks.tabHouseblocks);
		blockOrangeCorner = new BlockOrangeCorner(Material.rock).setBlockName("OrangeCorner").setCreativeTab(Houseblocks.tabHBCorner);
		
		//Purple
		blockPurpleOut = new BlockPurpleOut(Material.rock).setBlockName("BlockPurpleSolid").setCreativeTab(Houseblocks.tabHouseblocks);
		blockPurpleCorner = new BlockPurpleCorner(Material.rock).setBlockName("PurpleCorner").setCreativeTab(Houseblocks.tabHBCorner);
		
		//Cyan
		blockCyanOut = new BlockCyanOut(Material.rock).setBlockName("BlockCyanSolid").setCreativeTab(Houseblocks.tabHouseblocks);
		blockCyanCorner = new BlockCyanCorner(Material.rock).setBlockName("CyanCorner").setCreativeTab(Houseblocks.tabHBCorner);
		
		//Magenta
		blockMagentaOut = new BlockMagentaOut(Material.rock).setBlockName("BlockMagentaSolid").setCreativeTab(Houseblocks.tabHouseblocks);
		blockMagentaCorner = new BlockMagentaCorner(Material.rock).setBlockName("MagentaCorner").setCreativeTab(Houseblocks.tabHBCorner);
		
		// Test Block
		testBlock = new TestBlock(Material.rock).setBlockName("testBlock");
	}
	
	public static void BlockRegistration() {
		// Game Registry - Blocks
		GameRegistry.registerBlock(blockDrywall, blockDrywall.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockRedOut, blockRedOut.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockRedCorner, blockRedCorner.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(testBlock, testBlock.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockWhiteOut, blockWhiteOut.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockWhiteCorner, blockWhiteCorner.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockGreenOut, blockGreenOut.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockGreenCorner, blockGreenCorner.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockBlueOut, blockBlueOut.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockBlueCorner, blockBlueCorner.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockLBlueOut,  blockLBlueOut.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockLBlueCorner,  blockLBlueCorner.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockLimeOut, blockLimeOut.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockLimeCorner, blockLimeCorner.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockPinkOut, blockPinkOut.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockPinkCorner, blockPinkCorner.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockBrownOut, blockBrownOut.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockBrownCorner, blockBrownCorner.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockYellowOut, blockYellowOut.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockYellowCorner, blockYellowCorner.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockGreyOut, blockGreyOut.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockGreyCorner, blockGreyCorner.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockLGreyOut, blockLGreyOut.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockLGreyCorner, blockLGreyCorner.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockOrangeOut, blockOrangeOut.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockOrangeCorner, blockOrangeCorner.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockPurpleOut, blockPurpleOut.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockPurpleCorner, blockPurpleCorner.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockCyanOut, blockCyanOut.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockCyanCorner, blockCyanCorner.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockMagentaOut, blockMagentaOut.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockMagentaCorner, blockMagentaCorner.getUnlocalizedName().substring(5));

		
		// Register Creative Tab icon items
		GameRegistry.registerItem(iconItem, "house");
		GameRegistry.registerItem(iconItem2, "house2");
	}
	
	
	
}
