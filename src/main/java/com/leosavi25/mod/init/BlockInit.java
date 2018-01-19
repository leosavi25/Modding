package com.leosavi25.mod.init;

import java.util.ArrayList;  
import java.util.List;

import com.leosavi25.mod.objects.BlockBase;
import com.leosavi25.mod.objects.Ore;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class BlockInit {
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static Block ORE_COPPER_BLOCK;
	
	public static Block BLOCK_COPPER;
	
	public static void preInit() {
	      ORE_COPPER_BLOCK = new Ore("ore_copper");
	      BLOCK_COPPER = new BlockBase("block_copper", Material.IRON, 5.0f, CreativeTabs.BUILDING_BLOCKS);
	}
	
	public static void init() {
		OreDictionary.registerOre("ore_copper", new ItemStack(ORE_COPPER_BLOCK, 1, 0));
	}
}
