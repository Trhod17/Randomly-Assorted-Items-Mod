package trhod17.randomlyassorteditems.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import trhod17.randomlyassorteditems.init.ModItems;

public class TabRaiItems extends CreativeTabs {
	
	public TabRaiItems() {
		super("raiitems");
	}
	
    @Override
    public ItemStack func_78016_d() {
    	return new ItemStack(ModItems.ChainLink);
    }
}
