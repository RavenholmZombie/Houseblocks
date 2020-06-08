package ravenholmzombie.houseblocks;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

@Mod(modid = Reference.MODID, name = "House Blocks", version = Reference.VERSION)
public class Houseblocks {
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {	
		// Invoke block declaration class.
		HB_Blocks.BlockLibrary();
		
		// Register all blocks.
		HB_Blocks.BlockRegistration();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		// Crafting Recipes
		HB_Crafting.HBRecipes();	
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
		
	}
	
	
	// Siding Tab
	public static CreativeTabs tabHouseblocks = new CreativeTabs("tabHouseblocks") {
		
		@Override
		public Item getTabIconItem() {
			return new ItemStack(HB_Blocks.iconItem).getItem();
		}
	};
	
	// Corner tab
	public static CreativeTabs tabHBCorner = new CreativeTabs("tabHBCorner") {
		
		@Override
		public Item getTabIconItem() {
			return new ItemStack(HB_Blocks.iconItem2).getItem();
		}
	};
	
}
