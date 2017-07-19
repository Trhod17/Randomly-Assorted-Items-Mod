package trhod17.randomlyassorteditems;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import trhod17.randomlyassorteditems.util.Utils;
import trhod17.randomlyassorteditems.Reference;
import trhod17.randomlyassorteditems.creativetabs.TabRaiBlocks;
import trhod17.randomlyassorteditems.creativetabs.TabRaiItems;
import trhod17.randomlyassorteditems.handlers.RecipeHandler;
import trhod17.randomlyassorteditems.init.ModBlocks;
import trhod17.randomlyassorteditems.init.ModItems;
import trhod17.randomlyassorteditems.init.ModTools;
import trhod17.randomlyassorteditems.proxy.CommonProxy;
import org.apache.commons.lang3.SystemUtils;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.CustomProperty;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class RandomlyAssortedItems {


	
	public static final CreativeTabs blocks = new TabRaiBlocks();
	public static final CreativeTabs items = new TabRaiItems();
	
	
	
	@Mod.Instance(Reference.MODID)
	public static RandomlyAssortedItems instance;
	
	@SidedProxy(serverSide = Reference.SERVER_PROXY_CLASS, clientSide = Reference.CLIENT_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ModItems.init();
		ModTools.init();
		ModBlocks.init();
		ModItems.register();
		ModBlocks.register();
		ModTools.register();
		
		
		
		proxy.registerRenders();
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event) {
		
		RecipeHandler.registerCraftingRecipes();
		RecipeHandler.registerFurnaceRecipes();
		
		
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
		
	}
}
