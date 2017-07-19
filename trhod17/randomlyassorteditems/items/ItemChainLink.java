package trhod17.randomlyassorteditems.items;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import trhod17.randomlyassorteditems.Reference;

public class ItemChainLink extends Item {
	
	public ItemChainLink(String UnlocalizedName, String registryName) {
		 this.func_77655_b(UnlocalizedName);
		 this.setRegistryName(new ResourceLocation(Reference.MODID, registryName));
	}

}
