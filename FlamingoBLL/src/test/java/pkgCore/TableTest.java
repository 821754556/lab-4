package pkgCore;

import static org.junit.Assert.*;

import org.junit.Test;

public class TableTest {

	@Test
	public void Addplayertest() {
		Table t = new Table();
		Player p1 = new Player("p1", 1);
		Player p2 = new Player("p2", 2);
		Player p3 = new Player("p3", 3);
		Player p4 = new Player("p4", 4);
		Player p5 = new Player("p5", 5);

		t.AddPlayerToTable(p1);
		t.AddPlayerToTable(p2);
		t.AddPlayerToTable(p3);
		t.AddPlayerToTable(p4);
		t.AddPlayerToTable(p5);

		assertEquals(t.GetPlayerFromTable(p1), p1);
		assertEquals(t.GetPlayerFromTable(p2), p2);
		assertEquals(t.GetPlayerFromTable(p3), p3);

		t.RemovePlayerFromTable(p4);
		t.RemovePlayerFromTable(p5);

		assertNotEquals(t.GetPlayerFromTable(p4), p4);
		assertNotEquals(t.GetPlayerFromTable(p5), p5);

	}

}
