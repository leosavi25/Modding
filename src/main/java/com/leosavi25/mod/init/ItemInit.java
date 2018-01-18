package com.leosavi25.mod.init;

import java.util.ArrayList;  
import java.util.List;
import java.util.Set;

import com.google.common.collect.Sets;
import com.leosavi25.mod.objects.ItemBase;
import com.leosavi25.mod.objects.tools.ToolAxe;
import com.leosavi25.mod.objects.tools.ToolHoe;
import com.leosavi25.mod.objects.tools.ToolPickaxe;
import com.leosavi25.mod.objects.tools.ToolShovel;
import com.leosavi25.mod.objects.tools.ToolSword;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.common.util.EnumHelper;

public class ItemInit {

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static ToolMaterial TOOL_COPPER;
	
	public static Item COPPER_INGOT;
	public static Item COPPER_NUGGET;

	public static Item COPPER_HOE;
	public static Item COPPER_AXE;
	public static Item COPPER_SHOVEL;
	public static Item COPPER_SWORD;
	public static Item COPPER_PICKAXE;
	
	public static void init(){
		TOOL_COPPER = EnumHelper.addToolMaterial("tool_copper", 2, 180, 5.0f, 0.0f, 5);
		COPPER_INGOT = new ItemBase("copper_ingot", CreativeTabs.MATERIALS);
		COPPER_NUGGET = new ItemBase("copper_nugget", CreativeTabs.MATERIALS);
		COPPER_HOE = new ToolHoe("copper_hoe", TOOL_COPPER, CreativeTabs.TOOLS);
		COPPER_AXE = new ToolAxe("copper_axe", TOOL_COPPER, 10, -3.1f, CreativeTabs.TOOLS);
		COPPER_SWORD = new ToolSword("copper_sword", TOOL_COPPER, CreativeTabs.TOOLS);
		COPPER_SHOVEL = new ToolShovel("copper_shovel", TOOL_COPPER, CreativeTabs.TOOLS);
		COPPER_PICKAXE = new ToolPickaxe("copper_pickaxe", TOOL_COPPER, CreativeTabs.TOOLS);
		
	}

}
