package wihy.hideplugins;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class HidePlugins extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new SpigotListener(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
