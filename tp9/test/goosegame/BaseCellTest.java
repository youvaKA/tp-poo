package goosegame;
import goosegame.*;
import static org.junit.Assert.*;

import org.junit.Test;
import java.util.*;
import org.junit.Before;

public class BaseCellTest {

  private Board board;
  private BaseCell b;
  private Player p;

  @Before
  public void before(){
    this.b = new BaseCell(14);
    this.board = new ClassicBoard(64);
    this.p = new Player("youva",board.getCell(0));

    this.p.setCell(b); // le joueur p va sur la cellule b (14)
    this.b.welcomeplayer(p);
  }

  @Test
  public void CanBeLeftTest(){
    assertTrue(this.b.CanbeLeft());
  }


  @Test
  public void isJumpCellTest(){
    assertFalse(this.b.isJumpCell());
  }
  @Test
  public void getIndexTest(){
    assertEquals(14, this.b.getIndex());
  }
  @Test
  public void getPlayerTest(){
    assertEquals(this.p, this.b.getPlayer());
  }

  @Test
  public void jumpTest(){
    assertEquals(14, this.b.jump(5));
  }
  @Test
  public void isBusyTest(){
    BaseCell b2 = new BaseCell(10);
    Player player1 = new Player("chacher",this.board.getCell(0));
    assertFalse(b2.isBusy());
    player1.setCell(b2);
    b2.welcomeplayer(player1);
    assertTrue(b2.isBusy());
  }
  @Test
  public void welcomePlayerTest(){
    Player player2 = new Player("youva",this.board.getCell(0));
   this.b.welcomeplayer(player2);
   assertEquals(player2, this.b.getPlayer());
  }

  @Test
  public void leaveTest(){
    assertTrue(this.b.isBusy());
    this.b.leave();
    assertFalse(this.b.isBusy());
  }
  @Test
  public void handleMove(){
    assertEquals(14+28, this.b.handleMove(28));
  }


     // ---Pour permettre l'execution des tests ----------------------
     public static junit.framework.Test suite() {
      return new junit.framework.JUnit4TestAdapter(goosegame.BaseCellTest.class);
    }
}
