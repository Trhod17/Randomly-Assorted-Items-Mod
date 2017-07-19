package trhod17.randomlyassorteditems.items;

import java.util.List;
import java.util.Set;

import com.google.common.collect.Sets;
import trhod17.randomlyassorteditems.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Item.ToolMaterial;

/**
 * This class acts as a tool as in 1.10.2 ItemAxe was not fully functional
 * @author CJMinecraft
 *
 */
public class ItemModAxe extends ItemTool {
	
    private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(new Block[] {Blocks.field_150344_f, Blocks.field_150342_X, Blocks.field_150364_r, Blocks.field_150363_s, Blocks.field_150486_ae, Blocks.field_150423_aK, Blocks.field_150428_aP, Blocks.field_150440_ba, Blocks.field_150468_ap, Blocks.field_150471_bO, Blocks.field_150452_aw});
    private static final float[] ATTACK_DAMAGES = new float[] {6.0F, 8.0F, 8.0F, 8.0F, 6.0F};
    private static final float[] ATTACK_SPEEDS = new float[] { -3.2F, -3.2F, -3.1F, -3.0F, -3.0F};
	
	public ItemModAxe(ToolMaterial material, String unlocalizedName) {
		super(material, EFFECTIVE_ON);
		this.func_77655_b(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MODID, unlocalizedName));
	}
	
    public float func_150893_a(ItemStack stack, IBlockState state)
    {
        Material material = state.func_185904_a();
        return material != Material.field_151575_d && material != Material.field_151585_k && material != Material.field_151582_l ? super.func_150893_a(stack, state) : this.field_77864_a;
    }

}
