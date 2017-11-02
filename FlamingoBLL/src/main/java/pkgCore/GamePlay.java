package pkgCore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

import pkgEnum.eGameType;

public abstract class GamePlay {

	private eGameType eGameType;
	private HashMap<UUID, Player> hmGameMap = new HashMap<UUID, Player>();

	public GamePlay(eGameType eGameType) {
		super();
		this.eGameType = eGameType;
	}

	protected void AddPlayersToGame(ArrayList<Player> Players) {
		for (Player p : Players) {
			hmGameMap.put(p.getPlayerID(), p);
		}
	}

	protected void RemovePlayerFromGame(Player p) {
		hmGameMap.remove(p.getPlayerID());
	}

	protected Player GetPlayerInGame(Player p) {
		return (Player) hmGameMap.get(p.getPlayerID());
	}
}
