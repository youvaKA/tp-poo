package goosegame;
import goosegame.*;
import static org.junit.Assert.*;


import org.junit.Test;
import java.util.*;
import org.junit.Before;


public class TrapTest {
    
  private Board board; 
  private BaseCell b;
  private Player p;

  @Before
  public void before(){
    this.b = new Trap(14);
    this.board = new ClassicBoard(64);
    this.p = new Player("youva",board.getCell(0));

    this.p.setCell(b); // le joueur p va sur la cellule b (14)
  }
  @Test
    public void CanBeLeftTest(){
        assertFalse(this.b.CanbeLeft());
      }
      @Test
    public void handleMove(){
        assertEquals(14, this.b.handleMove(28));
    }
    
    // ---Pour permettre l'execution des tests ----------------------
    public static junit.framework.Test suite() {
      return new junit.framework.JUnit4TestAdapter(goosegame.TrapTest.class);
    }
}
