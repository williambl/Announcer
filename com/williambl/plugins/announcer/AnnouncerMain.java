package com.williambl.plugins.announcer;

import org.bukkit.plugin.java.JavaPlugin;



public class AnnouncerMain extends JavaPlugin{
	public void onEnable(){
		getServer().getPluginManager().registerEvents(new AnnouncerListener(), this);
	}

}
