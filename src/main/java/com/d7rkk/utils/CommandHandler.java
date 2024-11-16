package com.yourname.utils;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.ChatColor;

public class CommandHandler implements CommandExecutor {
    private final Main plugin;

    public CommandHandler(Main plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("dc") || command.getName().equalsIgnoreCase("discord")) {
            String discordMessage = ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("messages.discord"));
            sender.sendMessage(discordMessage);
        } else if (command.getName().equalsIgnoreCase("store") || command.getName().equalsIgnoreCase("s")) {
            String storeMessage = ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("messages.store"));
            sender.sendMessage(storeMessage);
        }
        return true;
    }
}
