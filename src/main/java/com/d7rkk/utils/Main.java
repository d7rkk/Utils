package com.yourname.basicplugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("BasicPlugin is enabled!");
        registerCommands();
    }

    @Override
    public void onDisable() {
        getLogger().info("BasicPlugin is disabled!");
    }

    private void registerCommands() {
        getCommand("dc").setExecutor(new CommandHandler());
        getCommand("discord").setExecutor(new CommandHandler());
        getCommand("store").setExecutor(new CommandHandler());
        getCommand("s").setExecutor(new CommandHandler());
    }
}
