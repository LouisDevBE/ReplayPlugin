package me.louisdev.replay.commands;

import me.louisdev.replay.Main;
import me.louisdev.replay.managers.Manager;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static me.louisdev.replay.Main.getMain;

public class test implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player) {
            Player player = (Player) sender;

            if(player.hasPermission("test.test"))
                Manager.messageTest(player, "Test", ChatColor.GREEN);


            Manager.messageTest(player, "No permission", ChatColor.RED);
        }
        getMain().getLogger().info("Je bent geen speler");
        return true;
    }
}
