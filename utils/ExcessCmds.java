package me.maffew.utils;

import me.maffew.practice.Main;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ExcessCmds {

    Main plugin;

    public ExcessCmds(Main p) {
        this.plugin = p;
    }

    public void helpCommand(CommandSender p, String[] args) {
        Message.send(p, "&8&m-----------------------------------------------------");
        Message.send(p, this.plugin.getConfig().getString("Messages.Help.Information"));
        Message.send(p, "&8&m-----------------------------------------------------");
        Message.send(p, this.plugin.getConfig().getString("Messages.Help.Season"));
        Message.send(p, this.plugin.getConfig().getString("Messages.Help.AvailableKits"));
        Message.send(p, "");
        Message.send(p, this.plugin.getConfig().getString("Messages.Help.HelpfulCommands"));
        Message.send(p, this.plugin.getConfig().getString("Messages.Help.DuelCmd"));
        Message.send(p, this.plugin.getConfig().getString("Messages.Help.Leaderboard"));
    }

}
