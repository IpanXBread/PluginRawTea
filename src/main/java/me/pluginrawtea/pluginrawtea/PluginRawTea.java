package me.pluginrawtea.pluginrawtea;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class PluginRawTea extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Ipan said hello");
        getServer().getPluginManager().registerEvents(this, this);
        //test 22
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){
        System.out.println("ipan said welcome to you :)");
    }

}
