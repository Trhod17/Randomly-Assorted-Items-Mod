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
		GameRegistry.addShapedRecipe(new ItemStack(ModTools.chainPickaxe), new Object[] {"CCC","XSX","XSX",'C',ModItems.Chain, 'S', Items.field_151055_y});
		GameRegistry.addShapedRecipe(new ItemStack(ModTools.chainAxe), new Object[] {"CCX","CSX","XSX",'C',ModItems.Chain, 'S', Items.field_151055_y});
		GameRegistry.addShapedRecipe(new ItemStack(ModTools.chainshovel), new Object[] {"XCX","XSX","XSX",'C',ModItems.Chain, 'S', Items.field_151055_y});
		GameRegistry.addShapedRecipe(new ItemStack(ModTools.chainhoe), new Object[] {"XCC","XSX","XSX",'C',ModItems.Chain, 'S', Items.field_151055_y});
		GameRegistry.addShapedRecipe(new ItemStack(ModTools.chainsword), new Object[] {"XCX","XCX","XSX",'C',ModItems.Chain, 'S', Items.field_151055_y});
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.Seasoned_Beef), new Object[] { Items.field_151082_bd, ModItems.pepper, ModItems.Salt });
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.Seasoned_Fish), new Object[] { Items.field_151115_aP, ModItems.pepper, ModItems.Salt });
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.Seasoned_Mutton), new Object[] { Items.field_179561_bm, ModItems.pepper, ModItems.Salt });
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.Seasoned_Chicken), new Object[] { Items.field_151076_bf, ModItems.pepper, ModItems.Salt });
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.Seasoned_Rabbit), new Object[] { Items.field_179558_bo, ModItems.pepper, ModItems.Salt });
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.Seasoned_Pork), new Object[] { Items.field_151147_al, ModItems.pepper, ModItems.Salt });
		GameRegistry.addShapedRecipe(new ItemStack(Items.field_151116_aA, 2), new Object[] {"XWX","SFS","XXX",'S',Items.field_151055_y,'F',ModItems.Cooked_Flesh,'W',Items.field_151040_l.func_77642_a(Items.field_151040_l)});
		GameRegistry.addShapedRecipe(new ItemStack(Items.field_151023_V), new Object[] {"CXC","CCC","CCC",'C',ModItems.Chain});
		GameRegistry.addShapedRecipe(new ItemStack(Items.field_151029_X), new Object[] {"XXX","CXC","CXC",'C',ModItems.Chain});
		GameRegistry.addShapedRecipe(new ItemStack(Items.field_151022_W), new Object[] {"CCC","CXC","CXC",'C',ModItems.Chain});
		GameRegistry.addShapedRecipe(new ItemStack(Items.field_151020_U), new Object[] {"CCC","CXC","XXX",'C',ModItems.Chain});
		
		
		
		
		
		
		
	}  
	
	public static void registerFurnaceRecipes() {
	
	GameRegistry.addSmelting(new ItemStack(ModItems.Seasoned_Mutton), new ItemStack(ModItems.Cooked_Seasoned_Mutton), 10);
	GameRegistry.addSmelting(new ItemStack(ModItems.Seasoned_Fish), new ItemStack(ModItems.Cooked_Seasoned_Fish), 10);
	GameRegistry.addSmelting(new ItemStack(ModItems.Seasoned_Chicken), new ItemStack(ModItems.Cooked_Seasoned_Chicken), 10);
	GameRegistry.addSmelting(new ItemStack(ModItems.Seasoned_Pork), new ItemStack(ModItems.Cooked_Seasoned_pork), 10);
	GameRegistry.addSmelting(new ItemStack(ModItems.Seasoned_Beef), new ItemStack(ModItems.Seasoned_Steak), 10);
	GameRegistry.addSmelting(new ItemStack(ModItems.Seasoned_Rabbit), new ItemStack(ModItems.Cooked_Seasoned_Rabbit), 10);
	GameRegistry.addSmelting(new ItemStack(Items.field_151131_as), new ItemStack(ModItems.Salt, 4) , 10);
	GameRegistry.addSmelting(new ItemStack(Items.field_151078_bh), new ItemStack(ModItems.Cooked_Flesh, 4), 10);
	GameRegistry.addSmelting(new ItemStack(Items.field_151014_N), new ItemStack(ModItems.pepper, 1), 10);
	
		
		
		
		
		
	}
	
	

}
