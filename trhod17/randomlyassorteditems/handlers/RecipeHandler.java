package trhod17.randomlyassorteditems.handlers;

import net.minecraftforge.fml.common.registry.GameRegistry;
import trhod17.randomlyassorteditems.init.ModItems;
import trhod17.randomlyassorteditems.init.ModTools;
import trhod17.randomlyassorteditems.util.Utils;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Block;
import net.minecraft.init.Items;
public class RecipeHandler {
	
	public static void registerCraftingRecipes() {
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.ChainLink), new Object[]{ "III","IXI","III",'I',Items.field_151042_j});
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.Chain), new Object[]{ "IXX","XIX","XXI",'I',ModItems.ChainLink});
		GameRegistry.addShapedRecipe(new ItemStack(ModTools.chainPickaxe), new Object[] {"CCC","XSX","XSX",'C', ModItems.Chain, 's', Items.field_151055_y});
		//GameRegistry.addShapedRecipe(new ItemStack(ModItems.ChainLink), new Object[]{ "IXX","XIX","XXI",'I',Items.IRON_INGOT});
		//GameRegistry.addShapedRecipe(new ItemStack(ModItems.ChainLink), new Object[]{ "IXX","XIX","XXI",'I',Items.IRON_INGOT});
		//GameRegistry.addShapedRecipe(new ItemStack(ModItems.ChainLink), new Object[]{ "IXX","XIX","XXI",'I',Items.IRON_INGOT});
		//GameRegistry.addShapedRecipe(new ItemStack(ModItems.ChainLink), new Object[]{ "IXX","XIX","XXI",'I',Items.IRON_INGOT});
		//GameRegistry.addShapedRecipe(new ItemStack(ModItems.ChainLink), new Object[]{ "IXX","XIX","XXI",'I',Items.IRON_INGOT});
		//GameRegistry.addShapedRecipe(new ItemStack(ModItems.ChainLink), new Object[]{ "IXX","XIX","XXI",'I',Items.IRON_INGOT});
		//GameRegistry.addShapedRecipe(new ItemStack(ModItems.ChainLink), new Object[]{ "IXX","XIX","XXI",'I',Items.IRON_INGOT});
		
		
		
		
		Utils.getLogger().info("Registered Crafting Recipes!");;
	}  
	
	public static void registerFurnaceRecipes() {
		
		
		
		
		Utils.getLogger().info("Registered Furnace Recipes!");
	}
	
	

}
