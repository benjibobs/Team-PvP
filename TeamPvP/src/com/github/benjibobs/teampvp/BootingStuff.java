package com.github.benjibobs.teampvp;

import java.util.logging.Logger;

import org.bukkit.plugin.PluginDescriptionFile;

public class BootingStuff {

	public static Main plugin;
	
	public BootingStuff(Main instance){
		plugin = instance;
	}
	public final Logger logger = Logger.getLogger("Minecraft");	
	
	public void enabled(boolean enabled){
		if(enabled){
			PluginDescriptionFile pdfFile = plugin.getDescription();
			this.logger.info("[TeamPvP] " + pdfFile.getName() + " v." + pdfFile.getVersion() + " has been enabled");
			
		}else{
			PluginDescriptionFile pdfFile = plugin.getDescription();
			this.logger.info("[TeamPvP] " + pdfFile.getName() + " v." + pdfFile.getVersion() + " has been disabled");
		}
		
	}

}


