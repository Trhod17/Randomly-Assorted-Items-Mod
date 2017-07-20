package trhod17.randomlyassorteditems.init;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import trhod17.randomlyassorteditems.RandomlyAssortedItems;
import trhod17.randomlyassorteditems.Reference;
import trhod17.randomlyassorteditems.items.ItemChainLink;
import trhod17.randomlyassorteditems.items.ItemModFood;
import trhod17.randomlyassorteditems.items.ItemModItems;
import trhod17.randomlyassorteditems.items.ItemSeasoning;
import trhod17.randomlyassorteditems.util.Utils;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.color.IItemColor;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class ModItems {

	  public static Item ChainLink;
	  public static Item Chain;
	  public static Item Cooked_Seasoned_pork;
	  public static Item Seasoned_Steak;
	  public static Item Cooked_Seasoned_Chicken;
	  public static Item Cooked_Seasoned_Mutton;
	  public static Item Cooked_Seasoned_Fish;
	  public static Item Cooked_Seasoned_Rabbit;
	  public static Item Seasoned_Beef;
	  public static Item Seasoned_Chicken;
	  public static Item Seasoned_Mutton;
	  public static Item Seasoned_Fish;
	  public static Item Seasoned_Rabbit;
	  public static Item Seasoned_Pork;
	  public static Item Salt;
	  public static Item pepper;
	  public static Item Cooked_Flesh;
	  
	  
	  
	public static void init() {
		
		ChainLink = new ItemChainLink("chain_link", "chain_link");
		Chain = new ItemChainLink("chain", "chain");
		Cooked_Seasoned_pork = new ItemModFood("cooked_seasoned_pork",12, 4, false);
		Seasoned_Steak = new ItemModFood("seasoned_steak",12, 4, false);
		Cooked_Seasoned_Chicken = new ItemModFood("cooked_seasoned_chicken",12, 4, false);
		Cooked_Seasoned_Mutton = new ItemModFood("cooked_seasoned_mutton",12, 4, false);
		Cooked_Seasoned_Rabbit = new ItemModFood("cooked_seasoned_rabbit",12, 4, false);
		Cooked_Seasoned_Fish = new ItemModFood("cooked_seasoned_fish",12, 4, false);
		Seasoned_Beef = new ItemModFood("seasoned_beef",2, 0, false);
		Seasoned_Chicken = new ItemModFood("seasoned_chicken",2, 0, false);
		Seasoned_Mutton = new ItemModFood("seasoned_mutton",2, 0, false);
		Seasoned_Rabbit = new ItemModFood("seasoned_rabbit",2, 0, false);
		Seasoned_Fish = new ItemModFood("seasoned_fish",2, 0, false);
		Seasoned_Pork = new ItemModFood("seasoned_pork",2, 0, false);
	    Salt = new ItemSeasoning("salt", "salt");
	    Cooked_Flesh = new ItemModItems("cooked_flesh", "cooked_flesh");
	    pepper = new ItemSeeds(ModBlocks.pepper, Blocks.field_150458_ak).func_77655_b("pepper").setRegistryName(new ResourceLocation(Reference.MODID, "pepper"));
	    
	}
	
	public static void register() {
		
		registerItem(ChainLink);
		registerItem(Chain);
		registerItem(Cooked_Seasoned_pork);
		registerItem(Seasoned_Steak);
		registerItem(Cooked_Seasoned_Chicken);
		registerItem(Cooked_Seasoned_Mutton);
		registerItem(Cooked_Seasoned_Rabbit);
		registerItem(Cooked_Seasoned_Fish);
	    registerItem(Seasoned_Beef);
	    registerItem(Seasoned_Chicken);
	    registerItem(Seasoned_Mutton);
	    registerItem(Seasoned_Rabbit);
	    registerItem(Seasoned_Fish);
	    registerItem(Seasoned_Pork);
	    registerItem(pepper);
	    registerItem(Salt);
	    registerItem(Cooked_Flesh);
	   
	    
	}
	
	public static void registerRenders() {
		
		registerRender(ChainLink);
        registerRender(Chain);
        registerRender(Cooked_Seasoned_pork);
        registerRender(Seasoned_Steak);
		registerRender(Cooked_Seasoned_Chicken);
		registerRender(Cooked_Seasoned_Mutton);
		registerRender(Cooked_Seasoned_Rabbit);
		registerRender(Cooked_Seasoned_Fish);
		registerRender(Seasoned_Beef);
	    registerRender(Seasoned_Chicken);
	    registerRender(Seasoned_Mutton);
	    registerRender(Seasoned_Rabbit);
	    registerRender(Seasoned_Fish);
	    registerRender(Seasoned_Pork);
	    registerRender(pepper);
	    registerRender(Salt);
		registerRender(Cooked_Flesh);
		
	    
	}
	
	public static void registerItem(Item item) {
		GameRegistry.register(item);
		Utils.getLogger().info("Registered Item " + item.func_77658_a().substring(5));
	}
	
	public static void registerRender(Item item) {
		item.func_77637_a(RandomlyAssortedItems.items);
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(Reference.MODID, item.func_77658_a().substring(5)), "inventory"));
		Utils.getLogger().info("Registered render for " + item.func_77658_a().substring(5));
	}
	
	public static void registerRender(Item item, int meta, String fileName) {
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(new ResourceLocation(Reference.MODID, fileName), "inventory"));
		Utils.getLogger().info("Registered render for " + item.func_77658_a().substring(5));
	}

}

