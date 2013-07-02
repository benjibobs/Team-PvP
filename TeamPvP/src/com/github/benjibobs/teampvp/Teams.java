package com.github.benjibobs.teampvp;

import org.bukkit.ChatColor;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityShootBowEvent;

public class Teams implements Listener{

	public static Main plugin;
	
	public Teams(Main instance){
	
		
		plugin = instance;
		
	}
	
	@EventHandler
	public void onPlayerAttack(EntityDamageByEntityEvent event)
	{
	  if(event.getEntity() instanceof Player && event.getDamager() instanceof Player)
	    {
		  Player atker = (Player)event.getDamager();
		  Player defend = (Player)event.getEntity();
	      if(atker.hasPermission("team.naqar") && defend.hasPermission("team.naqar")){
	    	
	    	  event.setCancelled(true);
	    	  atker.sendMessage(ChatColor.DARK_RED + "You cannot attack members of your own kingdom!");
	    	  
	      }else if(atker.hasPermission("team.white") && defend.hasPermission("team.white")){
	    	
	    	  event.setCancelled(true);
	    	  atker.sendMessage(ChatColor.DARK_RED + "You cannot attack members of your own kingdom!");
	    	  
	      }else if(atker.hasPermission("team.wellwood") && defend.hasPermission("team.wellwood")){
	    	
	    	  event.setCancelled(true);
	    	  atker.sendMessage(ChatColor.DARK_RED + "You cannot attack members of your own kingdom!");
	    	  
	      }else if(atker.hasPermission("team.crystal") && defend.hasPermission("team.crystal")){
	    	
	    	  event.setCancelled(true);
	    	  atker.sendMessage(ChatColor.DARK_RED + "You cannot attack members of your own kingdom!");
	    	  
	      }else if(atker.hasPermission("team.noihara") && defend.hasPermission("team.noihara")){
	    	
	    	  event.setCancelled(true);
	    	  atker.sendMessage(ChatColor.DARK_RED + "You cannot attack members of your own kingdom!");
	    	  
	      }else if(atker.hasPermission("team.vesperia") && defend.hasPermission("team.vesperia")){
	    	
	    	  event.setCancelled(true);
	    	  atker.sendMessage(ChatColor.DARK_RED + "You cannot attack members of your own kingdom!");
	    	  
	      }else if(atker.hasPermission("team.appa") && defend.hasPermission("team.appa")){
	    	
	    	  event.setCancelled(true);
	    	  atker.sendMessage(ChatColor.DARK_RED + "You cannot attack members of your own kingdom!");
	    	  
	      }else if(atker.hasPermission("team.stryke") && defend.hasPermission("team.stryke")){
	    	
	    	  event.setCancelled(true);
	    	  atker.sendMessage(ChatColor.DARK_RED + "You cannot attack members of your own kingdom!");
	    	  
	      }
	    }
            
	}	
	



	
	
}
