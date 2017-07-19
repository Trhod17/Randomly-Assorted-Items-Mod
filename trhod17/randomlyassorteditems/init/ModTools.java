package trhod17.randomlyassorteditems.init;

import java.util.TooManyListenersException;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import trhod17.randomlyassorteditems.RandomlyAssortedItems;
import trhod17.randomlyassorteditems.Reference;
import trhod17.randomlyassorteditems.items.ItemModAxe;
import trhod17.randomlyassorteditems.items.ItemModHoe;
import trhod17.randomlyassorteditems.items.ItemModPickaxe;
import trhod17.randomlyassorteditems.items.ItemModShovel;
import trhod17.randomlyassorteditems.items.ItemModSword;
import trhod17.randomlyassorteditems.util.Utils;

public class ModTools {

	 public static final ToolMaterial chainMaterial = EnumHelper.addToolMaterial(Reference.MODID + ":chain", 8, 2000, 5.0F, 2.0F, 12);
	 
	 public static ItemPickaxe chainPickaxe;
	 public static ItemModAxe chainAxe;
	 public static ItemHoe chainhoe;
	 public static ItemSpade chainshovel;
	 public static ItemSword chainsword;
	 
	public static void init() {
	    chainPickaxe = new ItemModPickaxe(chainMaterial, "chain_pickaxe");
		chainAxe = new ItemModAxe(chainMaterial, "chain_axe");
		chainhoe = new ItemModHoe(chainMaterial, "chain_hoe");
		chainshovel = new ItemModShovel(chainMaterial, "chain_shovel");
		chainsword = new ItemModSword(chainMaterial, "chain_sword");
		
	}
	
	public static void register() {
		registerItem(chainPickaxe);
		registerItem(chainAxe);
		registerItem(chainhoe);
		registerItem(chainshovel);
		registerItem(chainsword);
	}
	
	public static void registerRenders() {
		registerRender(chainPickaxe);
		registerRender(chainAxe);
		registerRender(chainhoe);
		registerRender(chainshovel);
		registerRender(chainsword);
	}
	
	public static void registerItem(Item item) {
		item.func_77637_a(RandomlyAssortedItems.items);
		GameRegistry.register(item);
		Utils.getLogger().info("Registered Item " + item.func_77658_a().substring(5));
	}
	
	public static void registerRender(Item item) {
		
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(Reference.MODID, item.func_77658_a().substring(5)), "inventory"));
		Utils.getLogger().info("Registered render for " + item.func_77658_a().substring(5));
	}
	
	public static void registerRender(Item item, int meta, String fileName) {
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(new ResourceLocation(Reference.MODID, fileName), "inventory"));
		Utils.getLogger().info("Registered render for " + item.func_77658_a().substring(5));
	}
}
