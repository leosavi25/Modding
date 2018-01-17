package com.leosavi25.mod.objects;

import com.leosavi25.mod.FactoryCraft;
import com.leosavi25.mod.init.BlockInit;
import com.leosavi25.mod.init.ItemInit;
import com.leosavi25.mod.util.interfaces.IHasModel;

import net.minecraft.block.BlockOre;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;

public class Ore extends BlockOre implements IHasModel{
	
	public Ore(String name){
		setRegistryName(name);
		setUnlocalizedName(name);
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	@Override
	public void registerModels() {
		FactoryCraft.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}
