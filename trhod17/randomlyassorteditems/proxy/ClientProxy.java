package trhod17.randomlyassorteditems.proxy;

import trhod17.randomlyassorteditems.init.ModBlocks;
import trhod17.randomlyassorteditems.init.ModItems;
import trhod17.randomlyassorteditems.init.ModTools;

public class ClientProxy extends CommonProxy {

	@Override
	public void registerRenders() {
		
		ModItems.registerRenders();
		ModBlocks.registerRenders();
		ModTools.registerRenders();
	}
	
}
