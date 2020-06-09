package ravenholmzombie.houseblocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class HB_Crafting {
	
	// Put all recipes here
	public static void HBRecipes() {
		
		//Drywall
		GameRegistry.addRecipe(new ItemStack(HB_Blocks.blockDrywall), new Object[] {
				"WSW", 
				"SCS", 
				"WSW", 'W', Blocks.wool, 'S', Items.stick, 'C', Blocks.stone});
		
		//White Panel
		GameRegistry.addRecipe(new ItemStack(HB_Blocks.blockWhiteOut, 6), new Object[] {
				"DDB",
				"DDB",
				"DDB", 'D', HB_Blocks.blockDrywall, 'B', new ItemStack(Items.dye,1,15)});
		
		//White Corner
		GameRegistry.addRecipe(new ItemStack(HB_Blocks.blockWhiteCorner, 6), new Object[] {
				"PPW",
				"PPW",
				"PPW", 'P', HB_Blocks.blockWhiteOut, 'W', Blocks.wool});
		
		//Red Corner
		GameRegistry.addRecipe(new ItemStack(HB_Blocks.blockRedCorner, 6), new Object[] {
				"PPW",
				"PPW",
				"PPW", 'P', HB_Blocks.blockRedOut, 'W', Blocks.wool});
		
		//Red Panel - Shapeless
		GameRegistry.addShapelessRecipe(new ItemStack(HB_Blocks.blockRedOut), HB_Blocks.blockWhiteOut, new ItemStack(Items.dye,1,1));
		
		//Green Panel - Shapeless
		GameRegistry.addShapelessRecipe(new ItemStack(HB_Blocks.blockGreenOut), HB_Blocks.blockWhiteOut, new ItemStack(Items.dye,1,2));
		
		//Green Corner
		GameRegistry.addRecipe(new ItemStack(HB_Blocks.blockGreenCorner, 6), new Object[] {
				"PPW",
				"PPW",
				"PPW", 'P', HB_Blocks.blockGreenOut, 'W', Blocks.wool});
		
		//Blue Panel - Shapeless
		GameRegistry.addShapelessRecipe(new ItemStack(HB_Blocks.blockBlueOut), HB_Blocks.blockWhiteOut, new ItemStack(Items.dye,1,4));
		
		//Blue Corner
		GameRegistry.addRecipe(new ItemStack(HB_Blocks.blockBlueCorner, 6), new Object[] {
				"PPW",
				"PPW",
				"PPW", 'P', HB_Blocks.blockBlueOut, 'W', Blocks.wool});
		
		//L Blue Panel - Shapeless
		GameRegistry.addShapelessRecipe(new ItemStack(HB_Blocks.blockLBlueOut), HB_Blocks.blockWhiteOut, new ItemStack(Items.dye,1,12));
		
		//L Blue Corner
		GameRegistry.addRecipe(new ItemStack(HB_Blocks.blockLBlueCorner, 6), new Object[] {
				"PPW",
				"PPW",
				"PPW", 'P', HB_Blocks.blockLBlueOut, 'W', Blocks.wool});
		
		//Lime Panel - Shapeless
		GameRegistry.addShapelessRecipe(new ItemStack(HB_Blocks.blockLimeOut), HB_Blocks.blockWhiteOut, new ItemStack(Items.dye,1,10));
		
		//Lime Corner
		GameRegistry.addRecipe(new ItemStack(HB_Blocks.blockLimeCorner, 6), new Object[] {
				"PPW",
				"PPW",
				"PPW", 'P', HB_Blocks.blockLimeOut, 'W', Blocks.wool});
		
		//Pink Panel - Shapeless
		GameRegistry.addShapelessRecipe(new ItemStack(HB_Blocks.blockPinkOut), HB_Blocks.blockWhiteOut, new ItemStack(Items.dye,1,9));
		
		//Pink Corner
		GameRegistry.addRecipe(new ItemStack(HB_Blocks.blockPinkCorner, 6), new Object[] {
				"PPW",
				"PPW",
				"PPW", 'P', HB_Blocks.blockPinkOut, 'W', Blocks.wool});
		
		//Brown Panel - Shapeless
		GameRegistry.addShapelessRecipe(new ItemStack(HB_Blocks.blockBrownOut), HB_Blocks.blockWhiteOut, new ItemStack(Items.dye,1,3));
		
		//Brown Corner
		GameRegistry.addRecipe(new ItemStack(HB_Blocks.blockBrownCorner, 6), new Object[] {
				"PPW",
				"PPW",
				"PPW", 'P', HB_Blocks.blockBrownOut, 'W', Blocks.wool});
		
		//Yellow Panel - Shapeless
		GameRegistry.addShapelessRecipe(new ItemStack(HB_Blocks.blockYellowOut), HB_Blocks.blockWhiteOut, new ItemStack(Items.dye,1,11));
		
		//Yellow Corner
		GameRegistry.addRecipe(new ItemStack(HB_Blocks.blockYellowCorner, 6), new Object[] {
				"PPW",
				"PPW",
				"PPW", 'P', HB_Blocks.blockYellowOut, 'W', Blocks.wool});
		
		//Grey Panel - Shapeless
		GameRegistry.addShapelessRecipe(new ItemStack(HB_Blocks.blockGreyOut), HB_Blocks.blockWhiteOut, new ItemStack(Items.dye,1,8));
		
		//Grey Corner
		GameRegistry.addRecipe(new ItemStack(HB_Blocks.blockGreyCorner, 6), new Object[] {
				"PPW",
				"PPW",
				"PPW", 'P', HB_Blocks.blockGreyOut, 'W', Blocks.wool});
		
		//L Grey Panel - Shapeless
		GameRegistry.addShapelessRecipe(new ItemStack(HB_Blocks.blockLGreyOut), HB_Blocks.blockWhiteOut, new ItemStack(Items.dye,1,7));
		
		//L Grey Corner
		GameRegistry.addRecipe(new ItemStack(HB_Blocks.blockLGreyCorner, 6), new Object[] {
				"PPW",
				"PPW",
				"PPW", 'P', HB_Blocks.blockLGreyOut, 'W', Blocks.wool});
		
		//Orange Panel - Shapeless
		GameRegistry.addShapelessRecipe(new ItemStack(HB_Blocks.blockOrangeOut), HB_Blocks.blockWhiteOut, new ItemStack(Items.dye,1,14));
		
		//Orange Corner
		GameRegistry.addRecipe(new ItemStack(HB_Blocks.blockOrangeCorner, 6), new Object[] {
				"PPW",
				"PPW",
				"PPW", 'P', HB_Blocks.blockOrangeOut, 'W', Blocks.wool});
		
		//Purple Panel - Shapeless
		GameRegistry.addShapelessRecipe(new ItemStack(HB_Blocks.blockPurpleOut), HB_Blocks.blockWhiteOut, new ItemStack(Items.dye,1,5));
		
		//Purple Corner
		GameRegistry.addRecipe(new ItemStack(HB_Blocks.blockPurpleCorner, 6), new Object[] {
				"PPW",
				"PPW",
				"PPW", 'P', HB_Blocks.blockPurpleOut, 'W', Blocks.wool});
		
		//Cyan Panel - Shapeless
		GameRegistry.addShapelessRecipe(new ItemStack(HB_Blocks.blockCyanOut), HB_Blocks.blockWhiteOut, new ItemStack(Items.dye,1,5));
		
		//Cyan Corner
		GameRegistry.addRecipe(new ItemStack(HB_Blocks.blockCyanCorner, 6), new Object[] {
				"PPW",
				"PPW",
				"PPW", 'P', HB_Blocks.blockCyanOut, 'W', Blocks.wool});
		
		//Magenta Panel - Shapeless
		GameRegistry.addShapelessRecipe(new ItemStack(HB_Blocks.blockMagentaOut), HB_Blocks.blockWhiteOut, new ItemStack(Items.dye,1,5));
		
		//Magenta Corner
		GameRegistry.addRecipe(new ItemStack(HB_Blocks.blockMagentaCorner, 6), new Object[] {
				"PPW",
				"PPW",
				"PPW", 'P', HB_Blocks.blockMagentaOut, 'W', Blocks.wool});
	}
}
