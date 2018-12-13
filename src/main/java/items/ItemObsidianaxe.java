package items;

import java.util.Set;

import com.google.common.collect.Sets;

import me.luckycoder.test.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.util.ResourceLocation;

public class ItemObsidianaxe extends ItemTool {
	
	     
	    private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(new Block[] {Blocks.PLANKS, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN, Blocks.MELON_BLOCK, Blocks.LADDER, Blocks.WOODEN_BUTTON, Blocks.WOODEN_PRESSURE_PLATE});
	    private static final float[] ATTACK_DAMAGES = new float[] {6.0F, 8.0F, 8.0F, 8.0F, 6.0F};
	    private static final float[] ATTACK_SPEEDS = new float[] { -3.2F, -3.2F, -3.1F, -3.0F, -3.0F};
	     
	    public ItemObsidianaxe(ToolMaterial material, String unlocalizedName) {
	        super(material, EFFECTIVE_ON);
	        this.setUnlocalizedName(unlocalizedName);
	        this.setRegistryName(new ResourceLocation(Reference.MODID, unlocalizedName));
	    }
	     
	    public float getStrVsBlock(ItemStack stack, IBlockState state)
	    {
	        Material material = state.getMaterial();
	        return material != Material.WOOD && material != Material.PLANTS && material != Material.VINE ? super.getStrVsBlock(stack, state) : this.efficiencyOnProperMaterial;
	    }
	    
	    	
	    }
	 
	