package pkgCore;

import static org.junit.Assert.*;

import org.junit.Test;

public class TableTest {

	@Test
	public void Addplayertest() {
		Table t = new Table();
		Player pone = new Player("p1", 1);
		Player ptwo = new Player("p2", 2);
		Player pthree = new Player("p3", 3);
		Player pfour = new Player("p4", 4);
		Player pfive = new Player("p5", 5);

		t.AddPlayerToTable(pone);
		t.AddPlayerToTable(ptwo);
		t.AddPlayerToTable(pthree);
		t.AddPlayerToTable(pfour);
		t.AddPlayerToTable(pfive);

		assertEquals(t.GetPlayerFromTable(pone), pone);
		assertEquals(t.GetPlayerFromTable(ptwo), ptwo);
		assertEquals(t.GetPlayerFromTable(pthree), pthree);

		t.RemovePlayerFromTable(pfour);
		t.RemovePlayerFromTable(pfive);

		assertNotEquals(t.GetPlayerFromTable(pfour), pfour);
		assertNotEquals(t.GetPlayerFromTable(pfive), pfive);

	}

}
