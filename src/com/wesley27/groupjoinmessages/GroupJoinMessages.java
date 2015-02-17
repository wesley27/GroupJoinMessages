package com.wesley27.groupjoinmessages;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class GroupJoinMessages extends JavaPlugin implements Listener
{
	Logger logger = Logger.getLogger("Minecraft");
	
	public void onEnable()
	{
		logger.info("GroupJoinMessages Enabled.");
		getServer().getPluginManager().registerEvents(this, this);
		
		loadConfiguration();
	}
	
	public void onDisable()
	{
		logger.info("GroupJoinMessages Disabled.");
	}
	
	public void loadConfiguration()
	{
		getConfig().options().copyDefaults(true);
		saveDefaultConfig();
	}
	
	@EventHandler
	public void onPlayerJoin (PlayerJoinEvent event)
	{
		Player p = event.getPlayer();
		String pname = p.getName();
		
		if(getConfig().getBoolean("isEnabled"))
		{
			if(getConfig().getBoolean("allWorlds"))
			{
				if(p.hasPermission("gjm.group1") && (!getConfig().getString("messages.group1.join").equalsIgnoreCase("none")))
				{
					String joinmsg = ChatColor.translateAlternateColorCodes('&', getConfig().getString("messages.group1.join"));
					Bukkit.broadcastMessage(joinmsg.replace("%player", pname));
				}
				if(p.hasPermission("gjm.group2") && (!getConfig().getString("messages.group2.join").equalsIgnoreCase("none")))
				{
					String joinmsg = ChatColor.translateAlternateColorCodes('&', getConfig().getString("messages.group2.join"));
					Bukkit.broadcastMessage(joinmsg.replace("%player", pname));
				}
				if(p.hasPermission("gjm.group3") && (!getConfig().getString("messages.group3.join").equalsIgnoreCase("none")))
				{
					String joinmsg = ChatColor.translateAlternateColorCodes('&', getConfig().getString("messages.group3.join"));
					Bukkit.broadcastMessage(joinmsg.replace("%player", pname));
				}
				if(p.hasPermission("gjm.group4") && (!getConfig().getString("messages.group4.join").equalsIgnoreCase("none")))
				{
					String joinmsg = ChatColor.translateAlternateColorCodes('&', getConfig().getString("messages.group4.join"));
					Bukkit.broadcastMessage(joinmsg.replace("%player", pname));
				}
				if(p.hasPermission("gjm.group5") && (!getConfig().getString("messages.group5.join").equalsIgnoreCase("none")))
				{
					String joinmsg = ChatColor.translateAlternateColorCodes('&', getConfig().getString("messages.group5.join"));
					Bukkit.broadcastMessage(joinmsg.replace("%player", pname));
				}
				if(p.hasPermission("gjm.group6") && (!getConfig().getString("messages.group6.join").equalsIgnoreCase("none")))
				{
					String joinmsg = ChatColor.translateAlternateColorCodes('&', getConfig().getString("messages.group6.join"));
					Bukkit.broadcastMessage(joinmsg.replace("%player", pname));
				}
				if(p.hasPermission("gjm.group7") && (!getConfig().getString("messages.group7.join").equalsIgnoreCase("none")))
				{
					String joinmsg = ChatColor.translateAlternateColorCodes('&', getConfig().getString("messages.group7.join"));
					Bukkit.broadcastMessage(joinmsg.replace("%player", pname));
				}
				if(p.hasPermission("gjm.group8") && (!getConfig().getString("messages.group8.join").equalsIgnoreCase("none")))
				{
					String joinmsg = ChatColor.translateAlternateColorCodes('&', getConfig().getString("messages.group8.join"));
					Bukkit.broadcastMessage(joinmsg.replace("%player", pname));
				}
				if(p.hasPermission("gjm.group9") && (!getConfig().getString("messages.group9.join").equalsIgnoreCase("none")))
				{
					String joinmsg = ChatColor.translateAlternateColorCodes('&', getConfig().getString("messages.group9.join"));
					Bukkit.broadcastMessage(joinmsg.replace("%player", pname));
				}
				if(p.hasPermission("gjm.group10") && (!getConfig().getString("messages.group10.join").equalsIgnoreCase("none")))
				{
					String joinmsg = ChatColor.translateAlternateColorCodes('&', getConfig().getString("messages.group10.join"));
					Bukkit.broadcastMessage(joinmsg.replace("%player", pname));
				}
				if(p.hasPermission("gjm.group11") && (!getConfig().getString("messages.group12.join").equalsIgnoreCase("none")))
				{
					String joinmsg = ChatColor.translateAlternateColorCodes('&', getConfig().getString("messages.group12.join"));
					Bukkit.broadcastMessage(joinmsg.replace("%player", pname));
				}
				if(p.hasPermission("gjm.group12") && (!getConfig().getString("messages.group12.join").equalsIgnoreCase("none")))
				{
					String joinmsg = ChatColor.translateAlternateColorCodes('&', getConfig().getString("messages.group12.join"));
					Bukkit.broadcastMessage(joinmsg.replace("%player", pname));
				}
				if(p.hasPermission("gjm.group13") && (!getConfig().getString("messages.group13.join").equalsIgnoreCase("none")))
				{
					String joinmsg = ChatColor.translateAlternateColorCodes('&', getConfig().getString("messages.group13.join"));
					Bukkit.broadcastMessage(joinmsg.replace("%player", pname));
				}
				if(p.hasPermission("gjm.group14") && (!getConfig().getString("messages.group14.join").equalsIgnoreCase("none")))
				{
					String joinmsg = ChatColor.translateAlternateColorCodes('&', getConfig().getString("messages.group14.join"));
					Bukkit.broadcastMessage(joinmsg.replace("%player", pname));
				}
				if(p.hasPermission("gjm.group15") && (!getConfig().getString("messages.group15.join").equalsIgnoreCase("none")))
				{
					String joinmsg = ChatColor.translateAlternateColorCodes('&', getConfig().getString("messages.group15.join"));
					Bukkit.broadcastMessage(joinmsg.replace("%player", pname));
				}
			}
			else
			{
				for(Player player : getServer().getOnlinePlayers())
				{
					World w = player.getLocation().getWorld();
					if(getConfig().getStringList("onlyWorlds").contains(w.getName()))
					{
						String world = w.getName();
						if(player.getLocation().getWorld().getName() == world)
						{
							if(p.hasPermission("gjm.group1") && (!getConfig().getString("messages.group1.join").equalsIgnoreCase("none")))
							{
								String joinmsg = ChatColor.translateAlternateColorCodes('&', getConfig().getString("messages.group1.join"));
								player.sendMessage(joinmsg.replace("%player", pname));
							}
							if(p.hasPermission("gjm.group2") && (!getConfig().getString("messages.group2.join").equalsIgnoreCase("none")))
							{
								String joinmsg = ChatColor.translateAlternateColorCodes('&', getConfig().getString("messages.group2.join"));
								player.sendMessage(joinmsg.replace("%player", pname));
							}
							if(p.hasPermission("gjm.group3") && (!getConfig().getString("messages.group3.join").equalsIgnoreCase("none")))
							{
								String joinmsg = ChatColor.translateAlternateColorCodes('&', getConfig().getString("messages.group3.join"));
								player.sendMessage(joinmsg.replace("%player", pname));
							}
							if(p.hasPermission("gjm.group4") && (!getConfig().getString("messages.group4.join").equalsIgnoreCase("none")))
							{
								String joinmsg = ChatColor.translateAlternateColorCodes('&', getConfig().getString("messages.group4.join"));
								player.sendMessage(joinmsg.replace("%player", pname));
							}
							if(p.hasPermission("gjm.group5") && (!getConfig().getString("messages.group5.join").equalsIgnoreCase("none")))
							{
								String joinmsg = ChatColor.translateAlternateColorCodes('&', getConfig().getString("messages.group5.join"));
								player.sendMessage(joinmsg.replace("%player", pname));
							}
							if(p.hasPermission("gjm.group6") && (!getConfig().getString("messages.group6.join").equalsIgnoreCase("none")))
							{
								String joinmsg = ChatColor.translateAlternateColorCodes('&', getConfig().getString("messages.group6.join"));
								player.sendMessage(joinmsg.replace("%player", pname));
							}
							if(p.hasPermission("gjm.group7") && (!getConfig().getString("messages.group7.join").equalsIgnoreCase("none")))
							{
								String joinmsg = ChatColor.translateAlternateColorCodes('&', getConfig().getString("messages.group7.join"));
								player.sendMessage(joinmsg.replace("%player", pname));
							}
							if(p.hasPermission("gjm.group8") && (!getConfig().getString("messages.group8.join").equalsIgnoreCase("none")))
							{
								String joinmsg = ChatColor.translateAlternateColorCodes('&', getConfig().getString("messages.group8.join"));
								player.sendMessage(joinmsg.replace("%player", pname));
							}
							if(p.hasPermission("gjm.group9") && (!getConfig().getString("messages.group9.join").equalsIgnoreCase("none")))
							{
								String joinmsg = ChatColor.translateAlternateColorCodes('&', getConfig().getString("messages.group9.join"));
								player.sendMessage(joinmsg.replace("%player", pname));
							}
							if(p.hasPermission("gjm.group10") && (!getConfig().getString("messages.group10.join").equalsIgnoreCase("none")))
							{
								String joinmsg = ChatColor.translateAlternateColorCodes('&', getConfig().getString("messages.group10.join"));
								player.sendMessage(joinmsg.replace("%player", pname));
							}
							if(p.hasPermission("gjm.group11") && (!getConfig().getString("messages.group12.join").equalsIgnoreCase("none")))
							{
								String joinmsg = ChatColor.translateAlternateColorCodes('&', getConfig().getString("messages.group12.join"));
								player.sendMessage(joinmsg.replace("%player", pname));
							}
							if(p.hasPermission("gjm.group12") && (!getConfig().getString("messages.group12.join").equalsIgnoreCase("none")))
							{
								String joinmsg = ChatColor.translateAlternateColorCodes('&', getConfig().getString("messages.group12.join"));
								player.sendMessage(joinmsg.replace("%player", pname));
							}
							if(p.hasPermission("gjm.group13") && (!getConfig().getString("messages.group13.join").equalsIgnoreCase("none")))
							{
								String joinmsg = ChatColor.translateAlternateColorCodes('&', getConfig().getString("messages.group13.join"));
								player.sendMessage(joinmsg.replace("%player", pname));
							}
							if(p.hasPermission("gjm.group14") && (!getConfig().getString("messages.group14.join").equalsIgnoreCase("none")))
							{
								String joinmsg = ChatColor.translateAlternateColorCodes('&', getConfig().getString("messages.group14.join"));
								player.sendMessage(joinmsg.replace("%player", pname));
							}
							if(p.hasPermission("gjm.group15") && (!getConfig().getString("messages.group15.join").equalsIgnoreCase("none")))
							{
								String joinmsg = ChatColor.translateAlternateColorCodes('&', getConfig().getString("messages.group15.join"));
								player.sendMessage(joinmsg.replace("%player", pname));
							}
						}
					}
				}
			}
		}
		else
		{
			return;
		}	
	}
	
	@EventHandler
	public void onPlayerQuit (PlayerQuitEvent event)
	{
		Player p = event.getPlayer();
		String pname = p.getName();
		
		if(getConfig().getBoolean("isEnabled"))
		{
			if(getConfig().getBoolean("allWorlds"))
			{
				if(p.hasPermission("gjm.group1") && (!getConfig().getString("messages.group1.quit").equalsIgnoreCase("none")))
				{
					String quitmsg = ChatColor.translateAlternateColorCodes('&', getConfig().getString("messages.group1.quit"));
					Bukkit.broadcastMessage(quitmsg.replace("%player", pname));
				}
				if(p.hasPermission("gjm.group2") && (!getConfig().getString("messages.group2.quit").equalsIgnoreCase("none")))
				{
					String quitmsg = ChatColor.translateAlternateColorCodes('&', getConfig().getString("messages.group2.quit"));
					Bukkit.broadcastMessage(quitmsg.replace("%player", pname));
				}
				if(p.hasPermission("gjm.group3") && (!getConfig().getString("messages.group3.quit").equalsIgnoreCase("none")))
				{
					String quitmsg = ChatColor.translateAlternateColorCodes('&', getConfig().getString("messages.group3.quit"));
					Bukkit.broadcastMessage(quitmsg.replace("%player", pname));
				}
				if(p.hasPermission("gjm.group4") && (!getConfig().getString("messages.group4.quit").equalsIgnoreCase("none")))
				{
					String quitmsg = ChatColor.translateAlternateColorCodes('&', getConfig().getString("messages.group4.quit"));
					Bukkit.broadcastMessage(quitmsg.replace("%player", pname));
				}
				if(p.hasPermission("gjm.group5") && (!getConfig().getString("messages.group5.quit").equalsIgnoreCase("none")))
				{
					String quitmsg = ChatColor.translateAlternateColorCodes('&', getConfig().getString("messages.group5.quit"));
					Bukkit.broadcastMessage(quitmsg.replace("%player", pname));
				}
				if(p.hasPermission("gjm.group6") && (!getConfig().getString("messages.group6.quit").equalsIgnoreCase("none")))
				{
					String quitmsg = ChatColor.translateAlternateColorCodes('&', getConfig().getString("messages.group6.quit"));
					Bukkit.broadcastMessage(quitmsg.replace("%player", pname));
				}
				if(p.hasPermission("gjm.group7") && (!getConfig().getString("messages.group7.quit").equalsIgnoreCase("none")))
				{
					String quitmsg = ChatColor.translateAlternateColorCodes('&', getConfig().getString("messages.group7.quit"));
					Bukkit.broadcastMessage(quitmsg.replace("%player", pname));
				}
				if(p.hasPermission("gjm.group8") && (!getConfig().getString("messages.group8.quit").equalsIgnoreCase("none")))
				{
					String quitmsg = ChatColor.translateAlternateColorCodes('&', getConfig().getString("messages.group8.quit"));
					Bukkit.broadcastMessage(quitmsg.replace("%player", pname));
				}
				if(p.hasPermission("gjm.group9") && (!getConfig().getString("messages.group9.quit").equalsIgnoreCase("none")))
				{
					String quitmsg = ChatColor.translateAlternateColorCodes('&', getConfig().getString("messages.group9.quit"));
					Bukkit.broadcastMessage(quitmsg.replace("%player", pname));
				}
				if(p.hasPermission("gjm.group10") && (!getConfig().getString("messages.group10.quit").equalsIgnoreCase("none")))
				{
					String quitmsg = ChatColor.translateAlternateColorCodes('&', getConfig().getString("messages.group10.quit"));
					Bukkit.broadcastMessage(quitmsg.replace("%player", pname));
				}
				if(p.hasPermission("gjm.group11") && (!getConfig().getString("messages.group12.quit").equalsIgnoreCase("none")))
				{
					String quitmsg = ChatColor.translateAlternateColorCodes('&', getConfig().getString("messages.group12.quit"));
					Bukkit.broadcastMessage(quitmsg.replace("%player", pname));
				}
				if(p.hasPermission("gjm.group12") && (!getConfig().getString("messages.group12.quit").equalsIgnoreCase("none")))
				{
					String quitmsg = ChatColor.translateAlternateColorCodes('&', getConfig().getString("messages.group12.quit"));
					Bukkit.broadcastMessage(quitmsg.replace("%player", pname));
				}
				if(p.hasPermission("gjm.group13") && (!getConfig().getString("messages.group13.quit").equalsIgnoreCase("none")))
				{
					String quitmsg = ChatColor.translateAlternateColorCodes('&', getConfig().getString("messages.group13.quit"));
					Bukkit.broadcastMessage(quitmsg.replace("%player", pname));
				}
				if(p.hasPermission("gjm.group14") && (!getConfig().getString("messages.group14.quit").equalsIgnoreCase("none")))
				{
					String quitmsg = ChatColor.translateAlternateColorCodes('&', getConfig().getString("messages.group14.quit"));
					Bukkit.broadcastMessage(quitmsg.replace("%player", pname));
				}
				if(p.hasPermission("gjm.group15") && (!getConfig().getString("messages.group15.quit").equalsIgnoreCase("none")))
				{
					String quitmsg = ChatColor.translateAlternateColorCodes('&', getConfig().getString("messages.group15.quit"));
					Bukkit.broadcastMessage(quitmsg.replace("%player", pname));
				}
			}
			else
			{
				for(Player player : getServer().getOnlinePlayers())
				{
					World w = player.getLocation().getWorld();
					if(getConfig().getStringList("onlyWorlds").contains(w.getName()))
					{
						String world = w.getName();
						if(player.getLocation().getWorld().getName() == world)
						{
							if(p.hasPermission("gjm.group1") && (!getConfig().getString("messages.group1.join").equalsIgnoreCase("none")))
							{
								String quitmsg = ChatColor.translateAlternateColorCodes('&', getConfig().getString("messages.group1.join"));
								player.sendMessage(quitmsg.replace("%player", pname));
							}
							if(p.hasPermission("gjm.group2") && (!getConfig().getString("messages.group2.join").equalsIgnoreCase("none")))
							{
								String quitmsg = ChatColor.translateAlternateColorCodes('&', getConfig().getString("messages.group2.join"));
								player.sendMessage(quitmsg.replace("%player", pname));
							}
							if(p.hasPermission("gjm.group3") && (!getConfig().getString("messages.group3.join").equalsIgnoreCase("none")))
							{
								String quitmsg = ChatColor.translateAlternateColorCodes('&', getConfig().getString("messages.group3.join"));
								player.sendMessage(quitmsg.replace("%player", pname));
							}
							if(p.hasPermission("gjm.group4") && (!getConfig().getString("messages.group4.join").equalsIgnoreCase("none")))
							{
								String quitmsg = ChatColor.translateAlternateColorCodes('&', getConfig().getString("messages.group4.join"));
								player.sendMessage(quitmsg.replace("%player", pname));
							}
							if(p.hasPermission("gjm.group5") && (!getConfig().getString("messages.group5.join").equalsIgnoreCase("none")))
							{
								String quitmsg = ChatColor.translateAlternateColorCodes('&', getConfig().getString("messages.group5.join"));
								player.sendMessage(quitmsg.replace("%player", pname));
							}
							if(p.hasPermission("gjm.group6") && (!getConfig().getString("messages.group6.join").equalsIgnoreCase("none")))
							{
								String quitmsg = ChatColor.translateAlternateColorCodes('&', getConfig().getString("messages.group6.join"));
								player.sendMessage(quitmsg.replace("%player", pname));
							}
							if(p.hasPermission("gjm.group7") && (!getConfig().getString("messages.group7.join").equalsIgnoreCase("none")))
							{
								String quitmsg = ChatColor.translateAlternateColorCodes('&', getConfig().getString("messages.group7.join"));
								player.sendMessage(quitmsg.replace("%player", pname));
							}
							if(p.hasPermission("gjm.group8") && (!getConfig().getString("messages.group8.join").equalsIgnoreCase("none")))
							{
								String quitmsg = ChatColor.translateAlternateColorCodes('&', getConfig().getString("messages.group8.join"));
								player.sendMessage(quitmsg.replace("%player", pname));
							}
							if(p.hasPermission("gjm.group9") && (!getConfig().getString("messages.group9.join").equalsIgnoreCase("none")))
							{
								String quitmsg = ChatColor.translateAlternateColorCodes('&', getConfig().getString("messages.group9.join"));
								player.sendMessage(quitmsg.replace("%player", pname));
							}
							if(p.hasPermission("gjm.group10") && (!getConfig().getString("messages.group10.join").equalsIgnoreCase("none")))
							{
								String quitmsg = ChatColor.translateAlternateColorCodes('&', getConfig().getString("messages.group10.join"));
								player.sendMessage(quitmsg.replace("%player", pname));
							}
							if(p.hasPermission("gjm.group11") && (!getConfig().getString("messages.group12.join").equalsIgnoreCase("none")))
							{
								String quitmsg = ChatColor.translateAlternateColorCodes('&', getConfig().getString("messages.group12.join"));
								player.sendMessage(quitmsg.replace("%player", pname));
							}
							if(p.hasPermission("gjm.group12") && (!getConfig().getString("messages.group12.join").equalsIgnoreCase("none")))
							{
								String quitmsg = ChatColor.translateAlternateColorCodes('&', getConfig().getString("messages.group12.join"));
								player.sendMessage(quitmsg.replace("%player", pname));
							}
							if(p.hasPermission("gjm.group13") && (!getConfig().getString("messages.group13.join").equalsIgnoreCase("none")))
							{
								String quitmsg = ChatColor.translateAlternateColorCodes('&', getConfig().getString("messages.group13.join"));
								player.sendMessage(quitmsg.replace("%player", pname));
							}
							if(p.hasPermission("gjm.group14") && (!getConfig().getString("messages.group14.join").equalsIgnoreCase("none")))
							{
								String quitmsg = ChatColor.translateAlternateColorCodes('&', getConfig().getString("messages.group14.join"));
								player.sendMessage(quitmsg.replace("%player", pname));
							}
							if(p.hasPermission("gjm.group15") && (!getConfig().getString("messages.group15.join").equalsIgnoreCase("none")))
							{
								String quitmsg = ChatColor.translateAlternateColorCodes('&', getConfig().getString("messages.group15.join"));
								player.sendMessage(quitmsg.replace("%player", pname));
							}
						}
					}
				}
			}
		}
		else
		{
			return;
		}
	}
}

