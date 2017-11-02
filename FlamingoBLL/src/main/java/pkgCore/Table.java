package pkgCore;

import java.util.HashMap;
import java.util.UUID;

public class Table {

	private UUID TableID;
	private HashMap<UUID, Player> hashmTablePlayer = new HashMap<UUID, Player>();

	public Table() {
		super();
		this.TableID = UUID.randomUUID();
	}

	public void AddPlayerToTable(Player p) {
		hashmTablePlayer.put(p.getPlayerID(), p);
	}

	public void RemovePlayerFromTable(Player p) {
		hashmTablePlayer.remove(p.getPlayerID());
	}

	public Player GetPlayerFromTable(Player p) {
		return (Player) hashmTablePlayer.get(p.getPlayerID());
	}
}
