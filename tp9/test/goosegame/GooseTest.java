package goosegame;
import goosegame.*;
import static org.junit.Assert.*;


import org.junit.Test;
import java.util.*;
import org.junit.Before;


public class GooseTest {
    
    private Board board; 
  private BaseCell b;
  private Player p;

  @Before
  public void before(){
    this.b = new Goose(8);
    this.board = new ClassicBoard(64);
    this.p = new Player("youva",board.getCell(0));

    this.p.setCell(b); // le joueur p va sur la cellule b (8)
  }

  //les tests sont identiques à ceux de la classe BasicCell
  @Test
  public void jumpTest(){
    assertEquals((5+8), this.b.jump(5));
  }
  @Test
  public void isjumpCellTest(){
      assertTrue(this.b.isJumpCell());
  }
  
// ---Pour permettre l'execution des tests ----------------------
public static junit.framework.Test suite() {
  return new junit.framework.JUnit4TestAdapter(goosegame.GooseTest.class);
}
}
