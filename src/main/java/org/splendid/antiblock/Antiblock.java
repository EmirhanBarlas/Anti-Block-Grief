package org.splendid.antiblock;

import org.bukkit.plugin.java.JavaPlugin;

public final class Antiblock extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Antiblock enabled!");

    }

    @Override
    public void onDisable() {
        getLogger().info("Antiblock disabled!");
    }
}
