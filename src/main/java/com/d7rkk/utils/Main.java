package com.yourname.utils;

import org.bukkit.plugin.java.JavaPlugin;
import java.io.File;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("Utils plugin is enabled!");
        createConfig();
        registerCommands();
    }

    @Override
    public void onDisable() {
        getLogger().info("Utils plugin is disabled!");
    }

    private void createConfig() {
        // Create the Utils folder and config.yml if not present
        File configFile = new File(getDataFolder(), "config.yml");
        if (!configFile.exists()) {
            getConfig().options().copyDefaults(true);
            saveDefaultConfig();
            getLogger().info("Config file created in Utils folder.");
        }
    }

    private void registerCommands() {
        getCommand("dc").setExecutor(new CommandHandler(this));
        getCommand("discord").setExecutor(new CommandHandler(this));
        getCommand("store").setExecutor(new CommandHandler(this));
        getCommand("s").setExecutor(new CommandHandler(this));
    }
}
