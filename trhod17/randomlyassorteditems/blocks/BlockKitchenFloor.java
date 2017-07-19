package trhod17.randomlyassorteditems.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import scala.reflect.internal.Trees.Super;
import trhod17.randomlyassorteditems.Reference;

public class BlockKitchenFloor extends Block {
	
	public BlockKitchenFloor(String unloclaizedName, String registryName) {
		
	    super(Material.field_151576_e);
		this.func_149663_c(unloclaizedName);
		this.setRegistryName(new ResourceLocation(Reference.MODID, unloclaizedName));
		this.func_149711_c(2);
		this.func_149752_b(20);
		
	}
	
	@Override
	public Item func_180660_a(IBlockState state, Random rand, int fortune) {
		return Item.func_150898_a(this);
	}
	
}
