package com.GODZmum.letsModReboot.handler;

import java.io.File;

import com.GODZmum.letsModReboot.reference.Reference;

import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.client.event.ConfigChangedEvent.OnConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class ConfigurationHandler {

	public static Configuration configuration;
	public static boolean testValue = false;

	public static void init(File configFile) {

		if (configuration == null) {

			// create the configuration object from config file
			Configuration configuration = new Configuration(configFile);
		}
	}

	@SubscribeEvent
	public void onConfigurationChangedEvent(
			ConfigChangedEvent.OnConfigChangedEvent event) {
		if (event.modID.equalsIgnoreCase(Reference.MOD_ID)) {
			// resync configs
			loadConfiguration();
		}
	}

	public void loadConfiguration() {
		testValue = configuration.getBoolean("configValue",
				Configuration.CATEGORY_GENERAL, false,
				"this is an example config file");
		if (configuration.hasChanged()) {
			configuration.save();
		}

	}
}
