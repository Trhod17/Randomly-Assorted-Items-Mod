package trhod17.randomlyassorteditems.items;

import net.minecraft.item.ItemSpade;
import net.minecraft.util.ResourceLocation;
import trhod17.randomlyassorteditems.Reference;

import net.minecraft.item.Item.ToolMaterial;

public class ItemModShovel extends ItemSpade {
	
public ItemModShovel(ToolMaterial material, String unlocalizedName) {
	  super(material);
	  this.func_77655_b(unlocalizedName);
	  this.setRegistryName(new ResourceLocation(Reference.MODID, unlocalizedName));
	  
	  
}
}
