package com.leosavi25.mod;

import com.leosavi25.mod.gen.OreGen;
import com.leosavi25.mod.init.BlockInit;
import com.leosavi25.mod.init.ItemInit;
import com.leosavi25.mod.proxy.CommonProxy;
import com.leosavi25.mod.recipes.Smelting;
import com.leosavi25.mod.util.Reference;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, version = Reference.VERSION, name = Reference.NAME)
public class FactoryCraft {

	@Instance
	public FactoryCraft instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.COMMON_PROXY)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event){
		GameRegistry.registerWorldGenerator(new OreGen(), 3);
		Smelting.init();
		BlockInit.preInit();
	}
	@EventHandler
	public static void init(FMLInitializationEvent event){
		BlockInit.init();
	}
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event){}
}
