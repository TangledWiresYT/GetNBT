package xyz.tangledwires.GetNBT;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class GetNBT extends JavaPlugin {
	@Override
    public void onEnable() {
		Bukkit.getServer().getLogger().info("Loaded GetNBT by xWires.");
		Bukkit.getServer().getLogger().info("Found an bug? Open an issue at https://github.com/TangledWiresYT/GetNBT");
    }
    
    @Override
    public void onDisable() {
        Bukkit.getServer().getLogger().info("GetNBT Disabled, bye!");
    }
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
    	if (cmd.getName().equalsIgnoreCase("getnbt")) { 
			if(sender instanceof Player) {
            	Player p = (Player) sender;
				if (p.getInventory().getItemInMainHand() != null) {
					String meta = p.getInventory().getItemInMainHand().getItemMeta().getAsString();
					p.sendMessage("");
					p.sendMessage(meta);
					p.sendMessage("");
				}
			}
			return true;
		}	
    	return false; 
	}
}