package pkgCore;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

import pkgEnum.eGameType;

public class GameplayTest {

	@Test
	public void GamePlaytest() {
		GamePlay gp = new GamePlayBlackJack(eGameType.BLACKJACK);
		ArrayList<Player> player = new ArrayList<Player>();
		Player p1 = new Player("p1", 1);
		Player p2 = new Player("p2", 2);
		Player p3 = new Player("p3", 3);
		Player p4 = new Player("p4", 4);
		Player p5 = new Player("p5", 5);
		player.addAll(Arrays.asList(p1, p2, p3, p4, p5));
		gp.AddPlayersToGame(player);

		assertEquals(gp.GetPlayerInGame(p1), p1);
		assertEquals(gp.GetPlayerInGame(p3), p3);
		assertEquals(gp.GetPlayerInGame(p5), p5);

		gp.RemovePlayerFromGame(p2);
		gp.RemovePlayerFromGame(p4);
		
		assertNotEquals(gp.GetPlayerInGame(p2), p2);
		assertNotEquals(gp.GetPlayerInGame(p4), p4);
		

	}

}
