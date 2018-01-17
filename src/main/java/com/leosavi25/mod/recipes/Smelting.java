package com.leosavi25.mod.recipes;

import com.leosavi25.mod.init.BlockInit;
import com.leosavi25.mod.init.ItemInit;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Smelting {

	public static void init(){
		GameRegistry.addSmelting(BlockInit.ORE_COPPER_BLOCK, new ItemStack(ItemInit.COPPER_INGOT), 0.2f);
		
		GameRegistry.addSmelting(ItemInit.COPPER_HOE, new ItemStack(ItemInit.COPPER_NUGGET, 1), 0.2f);
		GameRegistry.addSmelting(ItemInit.COPPER_AXE, new ItemStack(ItemInit.COPPER_NUGGET, 1), 0.2f);
		GameRegistry.addSmelting(ItemInit.COPPER_PICKAXE, new ItemStack(ItemInit.COPPER_NUGGET, 1), 0.2f);
		GameRegistry.addSmelting(ItemInit.COPPER_SHOVEL, new ItemStack(ItemInit.COPPER_NUGGET, 1), 0.2f);
		GameRegistry.addSmelting(ItemInit.COPPER_SWORD, new ItemStack(ItemInit.COPPER_NUGGET, 1), 0.2f);
	}
}
