package com.leosavi25.mod.objects.tools;

import com.leosavi25.mod.FactoryCraft;
import com.leosavi25.mod.init.ItemInit;
import com.leosavi25.mod.util.interfaces.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;

public class ToolHoe extends ItemHoe implements IHasModel {

	public ToolHoe(String name, ToolMaterial material, CreativeTabs tab) {
		super(material);
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
