package me.maffew.utils;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

public final class Message {

    public String translateChatColor(String msg) {
        return ChatColor.translateAlternateColorCodes('&', msg);
    }

    public void send(CommandSender sender, String message) {
        sender.sendMessage(translateChatColor(message));
    }
}
