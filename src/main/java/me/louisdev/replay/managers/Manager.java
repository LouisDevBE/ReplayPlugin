package me.louisdev.replay.managers;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class Manager {
    public static void messageTest(Player player, String text, ChatColor color) {
        player.sendMessage(color + text);
    }
}
