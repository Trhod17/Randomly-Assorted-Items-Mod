package trhod17.randomlyassorteditems.blocks;

import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import trhod17.randomlyassorteditems.Reference;
import trhod17.randomlyassorteditems.init.ModItems;

public class BlockPepper extends BlockCrops {

	
	public BlockPepper(String unlocalizedName) {
		this.func_149663_c(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MODID, unlocalizedName));
	}
	
	
	protected Item GetSeed() {
		return ModItems.pepper;
	}
	@Override
     protected Item func_149865_P() {
    	 return ModItems.pepper;
}
}
