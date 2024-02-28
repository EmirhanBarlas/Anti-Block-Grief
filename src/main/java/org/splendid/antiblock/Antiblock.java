package org.splendid.antiblock;

import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.List;

public final class Antiblock extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Antiblock enabled!");
        getConfig().options().copyDefaults(true);
        saveDefaultConfig();
    }

    @Override
    public void onDisable() {
        getLogger().info("Antiblock disabled!");
    }

    public List<String> getProtectedBlocks() {
        return getConfig().getStringList("protectedBlocks");
    }
}