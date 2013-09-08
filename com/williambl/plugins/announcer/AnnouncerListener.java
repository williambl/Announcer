package com.williambl.plugins.announcer;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityTameEvent;

public class AnnouncerListener implements Listener{
	
	@EventHandler
	public void onEntityTame(EntityTameEvent event){
		if (event.getOwner() instanceof Player) {
		    
			//Get entitytype and playername and say message.
			EntityType e = event.getEntityType();
			Player p = (Player) event.getOwner();
		    Bukkit.broadcastMessage(ChatColor.BLUE + (p.getDisplayName () + " just tamed a/an " + e + "!"));		    
		    
		    /*  Get location of entity and play effect at that location for ONLY
		     *  the player taming it.
		     */
			Location loc = event.getEntity().getLocation();
		    p.playEffect(loc, Effect.MOBSPAWNER_FLAMES, 0);
		    p.playEffect(loc, Effect.ENDER_SIGNAL, 0);
			
		}
		
	    
	}

}
	