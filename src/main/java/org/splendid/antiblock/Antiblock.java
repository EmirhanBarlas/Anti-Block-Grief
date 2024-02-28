package org.splendid.antiblock;

import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
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

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (label.equalsIgnoreCase("antiblockreload")) {
            if (sender.hasPermission("antiblock.reload")) {
                reloadConfig();
                sender.sendMessage("Antiblock config dosyası yenilendi!");
            } else {
                sender.sendMessage("Bu komutu kullanma izniniz yok!");
            }
            return true;
        }
        return false;
    }
    public List<String> getProtectedBlocks() {
        return getConfig().getStringList("protectedBlocks");
    }
}