package com.leosavi25.mod.init;

import java.util.ArrayList;  
import java.util.List;
import java.util.Set;

import com.google.common.collect.Sets;
import com.leosavi25.mod.objects.ItemBase;
import com.leosavi25.mod.objects.tools.ToolAxe;
import com.leosavi25.mod.objects.tools.ToolHoe;

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
	
	public static final ToolMaterial TOOL_COPPER = EnumHelper.addToolMaterial("tool_copper", 2, 180, 5.0f, 0.0f, 5);
	
	public static final Item COPPER_INGOT = new ItemBase("copper_ingot", CreativeTabs.MATERIALS);
	public static final Item COPPER_NUGGET = new ItemBase("copper_nugget", CreativeTabs.MATERIALS);

	public static final Item COPPER_HOE = new ToolHoe("copper_hoe", TOOL_COPPER, CreativeTabs.TOOLS);
	public static final Item COPPER_AXE = new ToolAxe("copper_axe", TOOL_COPPER, 10, -3.1f, CreativeTabs.TOOLS);
	public static final Item COPPER_SHOVEL = new ToolHoe("copper_shovel", TOOL_COPPER, CreativeTabs.TOOLS);
	public static final Item COPPER_SWORD = new ToolHoe("copper_sword", TOOL_COPPER, CreativeTabs.COMBAT);
	public static final Item COPPER_PICKAXE = new ToolHoe("copper_pickaxe", TOOL_COPPER, CreativeTabs.TOOLS);

}
