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
	
	public static void init() {
		
		ChainLink = new ItemChainLink("chain_link", "chain_link");
		Chain = new ItemChainLink("chain", "chain");
		Cooked_Seasoned_pork = new ItemModFood("cooked_seasoned_pork",12, 4, false);
		Seasoned_Steak = new ItemModFood("seasoned_steak",12, 4, false);
		Cooked_Seasoned_Chicken = new ItemModFood("cooked_seasoned_chicken",12, 4, false);
		Cooked_Seasoned_Mutton = new ItemModFood("cooked_seasoned_mutton",12, 4, false);
		Cooked_Seasoned_Rabbit = new ItemModFood("cooked_seasoned_rabbit",12, 4, false);
		Cooked_Seasoned_Fish = new ItemModFood("cooked_seasoned_fish",12, 4, false);
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

