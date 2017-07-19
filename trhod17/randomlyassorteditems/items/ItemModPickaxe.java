package trhod17.randomlyassorteditems.items;

import net.minecraft.item.ItemPickaxe;
import net.minecraft.util.ResourceLocation;
import trhod17.randomlyassorteditems.Reference;

import net.minecraft.item.Item.ToolMaterial;

public class ItemModPickaxe extends ItemPickaxe {
	
	public ItemModPickaxe(ToolMaterial material, String unlocalizedName) {
	           super(material);
	           this.func_77655_b(unlocalizedName);
	           this.setRegistryName(new ResourceLocation(Reference.MODID, unlocalizedName));
	}

}
