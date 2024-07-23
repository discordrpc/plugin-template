package org.discordrpc.plugin;

import org.bukkit.plugin.java.JavaPlugin;

public class PluginTemplate extends JavaPlugin {

        @Override
        public void onEnable() {
            getLogger().info("PluginTemplate has been enabled!");
        }

        @Override
        public void onDisable() {
            getLogger().info("PluginTemplate has been disabled!");
        }
}
