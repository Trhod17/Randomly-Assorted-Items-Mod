package trhod17.randomlyassorteditems.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import trhod17.randomlyassorteditems.init.ModBlocks;

public class TabRaiBlocks extends CreativeTabs {
	
	public TabRaiBlocks() {
	    super("raiblocks");
	}

	@Override
	public ItemStack func_78016_d() {
		return new ItemStack(ModBlocks.kitchen_floor);
	}

}
