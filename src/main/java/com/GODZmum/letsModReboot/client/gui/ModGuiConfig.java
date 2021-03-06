package com.GODZmum.letsModReboot.client.gui;

import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

import com.GODZmum.letsModReboot.handler.ConfigurationHandler;
import com.GODZmum.letsModReboot.reference.Reference;

import cpw.mods.fml.client.config.GuiConfig;

public class ModGuiConfig extends GuiConfig {

	public ModGuiConfig(GuiScreen guiScreen){
		super(guiScreen,
				new ConfigElement(ConfigurationHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
				Reference.MOD_ID,
				//world restart required?
				false,
				//minecraft restart required?
				false,
				GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString())); 
	}
	


}
