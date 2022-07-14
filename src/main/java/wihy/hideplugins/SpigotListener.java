package wihy.hideplugins;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class SpigotListener implements Listener {
    @EventHandler
    public void onCommand(PlayerCommandPreprocessEvent event) {
        String command = event.getMessage();
        if(command.equals("/plugins") || command.equals("/pl") || command.equals("/?") || command.equals("/help") || command.equals("/bukkit:plugins") || command.equals("/bukkit:pl") || command.equals("/bukkit:?") || command.equals("/bukkit:help") || command.equals("/ver") || command.equals("/version") || command.equals("/bukkit:ver") || command.equals("/bukkit:version") || command.equals("/bukkit:?") || command.equals("/about")) {
            if(!event.getPlayer().hasPermission("op")) {
                event.setCancelled(true);
                event.getPlayer().sendMessage(ChatColor.translateAlternateColorCodes('&', "&4[&cHidePL&4]&c You do not have permission to use this command."));
            }
        }
    }
}
