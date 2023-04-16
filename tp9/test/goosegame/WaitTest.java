package goosegame;
import goosegame.*;
import static org.junit.Assert.*;


import org.junit.Test;
import java.util.*;
import org.junit.Before;


public class WaitTest {
    private Board board; 
  private BaseCell b;
  private Player p;

  @Before
  public void before(){
    this.b = new Wait(20, 2);
    this.board = new ClassicBoard(64);
    this.p = new Player("youva",board.getCell(0));

    this.p.setCell(b); // le joueur p va sur la cellule b (14)
  }
  @Test
  public void CanBeLeftTest(){
    assertFalse(this.b.CanbeLeft());
    BaseCell b2= new Wait(20, 0);
    assertTrue(b2.CanbeLeft()); 

  }

  // ---Pour permettre l'execution des tests ----------------------
  public static junit.framework.Test suite() {
    return new junit.framework.JUnit4TestAdapter(goosegame.WaitTest.class);
  }

}
