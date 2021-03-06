package com.GODZmum.letsModReboot;

import net.minecraft.creativetab.CreativeTabs;

import com.GODZmum.letsModReboot.handler.ConfigurationHandler;
import com.GODZmum.letsModReboot.init.ModBlocks;
import com.GODZmum.letsModReboot.init.ModItems;
import com.GODZmum.letsModReboot.proxy.IProxy;
import com.GODZmum.letsModReboot.reference.Reference;
import com.GODZmum.letsModReboot.utilities.LogHelper;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class LetsModReboot {

	@Mod.Instance(Reference.MOD_ID)
	public static LetsModReboot instance;

	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static IProxy proxy;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {

		ConfigurationHandler.init(event.getSuggestedConfigurationFile());
		ModItems.init();
		ModBlocks.init();
		LogHelper.info("Pre Initialization Complete!");
	}

	@Mod.EventHandler
	public void Init(FMLInitializationEvent event) {
		LogHelper.info("Initialization Complete!");

	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		LogHelper.info("Post Initialization Complete!");

	}
}
