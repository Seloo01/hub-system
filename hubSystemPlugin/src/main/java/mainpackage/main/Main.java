package mainpackage.main;

import org.bukkit.*;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin implements CommandExecutor, Listener {

    @Override
    public void onEnable() {
        System.out.println("Eklenti Aktif!");
        getCommand("hub1").setExecutor(this);
        getCommand("hub2").setExecutor(this);
        getCommand("hub3").setExecutor(this);
        getCommand("hub").setExecutor(this);
    }

    @Override
    public void onDisable() {
        System.out.println("Eklenti Aktif değil!");
    }

    public void hub1(Player p) {
        WorldCreator worldCreator = new WorldCreator("hub1");
        worldCreator.environment(World.Environment.NORMAL);
        World hubWorld = worldCreator.createWorld();
        p.teleport(hubWorld.getSpawnLocation());
        p.sendMessage(ChatColor.GREEN + "Sunucu 1'e ışınlandınız!");
    }

    public void hub2(Player p) {
        WorldCreator worldCreator = new WorldCreator("hub2");
        worldCreator.environment(World.Environment.NORMAL);
        World hubWorld = worldCreator.createWorld();
        p.teleport(hubWorld.getSpawnLocation());
        p.sendMessage(ChatColor.GREEN + "Sunucu 2'ye ışınlandınız!");
    }

    public void hub3(Player p) {
        WorldCreator worldCreator = new WorldCreator("hub3");
        worldCreator.environment(World.Environment.NORMAL);
        World hubWorld = worldCreator.createWorld();
        p.teleport(hubWorld.getSpawnLocation());
        p.sendMessage(ChatColor.GREEN + "Sunucu 3'e ışınlandınız!");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (label.equals("hub1")) {
                hub1(player);
            }
            if (label.equals("hub2")) {
                hub1(player);
            }
            if (label.equals("hub3")) {
                hub3(player);
            }
            if (label.equals("hub")) {
                player.teleport(Bukkit.getWorld("world").getSpawnLocation());
            }
        }
        return false;
    }
}
