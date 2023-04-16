package goosegame;
import goosegame.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import java.util.*;


public class GameTest {

    private Board b;
    private Player player1;
    private Player player2;
    private Game game;

    @Before
    public void before(){
        this.b = new ClassicBoard(64);
        this.player1 = new Player("youva",this.b.getCell(0));
        this.player2 = new Player("chacher",this.b.getCell(0));
        this.game = new Game(this.b);

        this.game.addPlayer(this.player1);
        this.game.addPlayer(this.player2);
    }

    @Test
    public void getAllPlayerTest(){
        ArrayList<Player> l = new ArrayList<Player>();
        l.add(this.player1);
        l.add(this.player2);
        assertEquals(l, this.game.getAllPlayer());
    }

    @Test
    public void addPlayerTest(){
        Player player3 = new Player("frank",this.b.getCell(0));
        this.game.addPlayer(player3);
        assertTrue(this.game.getAllPlayer().contains(player3));
    }

    @Test
    public void switcheTest(){
       Cell c1 = this.player1.getCell();
       Cell c2 = this.player2.getCell();
       this.game.switche(this.player1, this.player2);
       assertTrue(this.player2.getCell().equals(c1));
       assertTrue(this.player1.getCell().equals(c2));
    }



   // ---Pour permettre l'execution des tests ----------------------
	public static junit.framework.Test suite() {
		return new junit.framework.JUnit4TestAdapter(goosegame.GameTest.class);
	}

}
