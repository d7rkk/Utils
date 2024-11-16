package com.yourname.basicplugin;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CommandHandler implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("dc") || command.getName().equalsIgnoreCase("discord")) {
            sender.sendMessage(ChatColor.AQUA + "" + ChatColor.BOLD + "Voici le lien vers notre discord: " + ChatColor.RESET + "https://discord.gg/yourserver");
        } else if (command.getName().equalsIgnoreCase("store") || command.getName().equalsIgnoreCase("s")) {
            sender.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "Voici le lien vers notre boutique: " + ChatColor.RESET + "https://shop.yourserver.com");
        }
        return true;
    }
}
