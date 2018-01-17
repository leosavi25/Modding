package com.leosavi25.mod.objects;

import com.leosavi25.mod.FactoryCraft;
import com.leosavi25.mod.init.BlockInit;
import com.leosavi25.mod.init.ItemInit;
import com.leosavi25.mod.util.interfaces.IHasModel;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class ItemBase extends Item implements IHasModel{
	
	public ItemBase(String name, CreativeTabs tab){
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
		
		ItemInit.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		FactoryCraft.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
