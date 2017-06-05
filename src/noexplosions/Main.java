package noexplosions;

import cn.nukkit.plugin.*;
import cn.nukkit.event.*;
import cn.nukkit.event.entity.*;

public class Main extends PluginBase implements Listener{
	public void onEnable() {
		getServer().getPluginManager().registerEvents(this, this);
	}
	@EventHandler
	public void onExplode(EntityExplosionPrimeEvent event) {
		event.setCancelled();
	}
}
