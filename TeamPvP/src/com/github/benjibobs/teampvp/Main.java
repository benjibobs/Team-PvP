package com.github.benjibobs.teampvp;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{

	public final BootingStuff bs = new BootingStuff(this);
	public final Teams lit = new Teams(this);
	
	@Override
	public void onEnable() {
		bs.enabled(true);
		PluginManager pm = Bukkit.getPluginManager();
		pm.registerEvents(lit, this);
	}
	
	@Override
	public void onDisable() {
		bs.enabled(false);
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command command,
			String label, String[] args) {
			if(label.equalsIgnoreCase("teampvp")){
			
			sender.sendMessage("");
			sender.sendMessage(ChatColor.GOLD + "==== " + ChatColor.DARK_RED + "TeamPvP " + ChatColor.GOLD + "====");
			sender.sendMessage("");
			sender.sendMessage(ChatColor.GOLD + "Purpose: " + ChatColor.RED + "This plugin aims to keep PvP fair, but limits who you can attack. As of yet, the only people you can't attack are your kingdom members.");
			sender.sendMessage("");
			sender.sendMessage(ChatColor.GOLD + "Author: " + ChatColor.RED + "benjibobs");
			sender.sendMessage("");
			sender.sendMessage(ChatColor.GOLD + "Version: " + ChatColor.RED + "" + this.getDescription().getVersion());
			sender.sendMessage("");
			sender.sendMessage(ChatColor.GOLD + "=================");
			sender.sendMessage("");
	}
			return false;
	
	}
			
			}
	
	
	
