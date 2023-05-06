package me.louisdev.replay;

import me.louisdev.replay.commands.test;
import me.louisdev.replay.managers.Manager;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import static org.bukkit.Bukkit.getPluginCommand;

public final class Main extends JavaPlugin {

    private static Main main;

    private static Manager manager;

    @Override
    public void onEnable() {
        main = this;

        //Welcome message
        getLogger().info(getDescription().getName() + " For Version "+ getDescription().getAPIVersion() +" | Made by " + getDescription().getAuthors());

        //Load config
        loadConfig();

        //Load Commands and events
        loadCommands();
        loadEvents();

    }

    @Override
    public void onDisable() {
        main = null;
    }

    // All Commands
    private static void loadCommands() {
        getPluginCommand("test").setExecutor(new test());
    }

    // All Events
    private static void loadEvents() {

    }

    private void loadConfig() {
        getConfig().options().copyDefaults(true);
        saveConfig();
    }

    public static Main getMain(){
        return main;
    }

    public static Manager getManager() {
        return manager;
    }
}
