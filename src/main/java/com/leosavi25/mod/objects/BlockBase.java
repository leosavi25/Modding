package com.leosavi25.mod.objects;

import com.leosavi25.mod.FactoryCraft;
import com.leosavi25.mod.FactoryCraft;
import com.leosavi25.mod.init.BlockInit;
import com.leosavi25.mod.init.ItemInit;
import com.leosavi25.mod.util.interfaces.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel{

	public BlockBase(String name, Material material, float hardness, CreativeTabs tab){
		super (material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
		setHardness(hardness);
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels() {
		FactoryCraft.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}
