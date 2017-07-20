package trhod17.randomlyassorteditems.init;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import trhod17.randomlyassorteditems.RandomlyAssortedItems;
import trhod17.randomlyassorteditems.Reference;
import trhod17.randomlyassorteditems.blocks.BlockKitchenFloor;
import trhod17.randomlyassorteditems.blocks.BlockPepper;
import trhod17.randomlyassorteditems.blocks.BlockoreBlock;
import trhod17.randomlyassorteditems.util.Utils;

public class ModBlocks {
	
	public static Block kitchen_floor;
	public static Block pepper;

	public static void init() {
		kitchen_floor = new BlockKitchenFloor("kitchen_floor", "kitchen_floor");
		pepper = new BlockPepper("pepper");
	}
	
	public static void register() {
		registerBlock(kitchen_floor);
		GameRegistry.register(pepper);
	}
	
	public static void registerRenders() {
		registerRender(kitchen_floor);
		registerRender(pepper);
	}
	
	public static void registerBlock(Block block) {
		block.func_149647_a(RandomlyAssortedItems.blocks);
		GameRegistry.register(block);
		GameRegistry.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
		Utils.getLogger().info("Registered Block: " + block.func_149739_a().substring(5));
	}
	
	public static void registerRender(Block block) {
	
		ModelLoader.setCustomModelResourceLocation(Item.func_150898_a(block),  0, new ModelResourceLocation(new ResourceLocation(Reference.MODID, block.func_149739_a().substring(5)), "inventory"));
	    Utils.getLogger().info("Registered render for " + block.func_149739_a().substring(5));
	}
}
