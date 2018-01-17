package com.leosavi25.mod.objects.tools;

import java.util.Set;

import com.google.common.collect.Sets;
import com.leosavi25.mod.FactoryCraft;
import com.leosavi25.mod.init.ItemInit;
import com.leosavi25.mod.util.interfaces.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.item.Item.ToolMaterial;

public class ToolAxe extends ItemTool implements IHasModel{

	private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(Blocks.PLANKS, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN, Blocks.MELON_BLOCK, Blocks.LADDER, Blocks.WOODEN_BUTTON, Blocks.WOODEN_PRESSURE_PLATE);
	private static final float[] ATTACK_DAMAGES = new float[] {6.0F, 8.0F, 8.0F, 8.0F, 6.0F};
    private static final float[] ATTACK_SPEEDS = new float[] { -3.2F, -3.2F, -3.1F, -3.0F, -3.0F};
    
    public ToolAxe(ToolMaterial material)
    {
        super(material, EFFECTIVE_ON);
        this.attackDamage = ATTACK_DAMAGES[material.ordinal()];
        this.attackSpeed = ATTACK_SPEEDS[material.ordinal()];
    }

    public ToolAxe(String name, ToolMaterial material, float damage, float speed, CreativeTabs tab)
    {
        super(material, EFFECTIVE_ON);
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(tab);
        
        this.attackDamage = damage;
        this.attackSpeed = speed;
        
        ItemInit.ITEMS.add(this);
    }

    @Override
	public float getDestroySpeed(ItemStack stack, IBlockState state){
		Material material = state.getMaterial();
		return material != Material.WOOD && material != Material.PLANTS && material != Material.VINE ? super.getDestroySpeed(stack, state) : this.efficiency;
	}
	@Override
	public void registerModels() {
		FactoryCraft.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
