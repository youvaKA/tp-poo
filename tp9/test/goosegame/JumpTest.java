package goosegame;
import goosegame.*;
import static org.junit.Assert.*;


import org.junit.Test;
import java.util.*;
import org.junit.Before;

public class JumpTest {
    private Board board; 
    private BaseCell b;
    private Player p;
  
    @Before
    public void before(){
      this.b = new Jump(15, 28);
      this.board = new ClassicBoard(64);
      this.p = new Player("youva",board.getCell(0));
  
      this.p.setCell(b); // le joueur p va sur la cellule b (14)
    }

    // tests identique a BaseCell
    @Test
    public void isjumpCellTest(){
        assertTrue(this.b.isJumpCell());
    }
    @Test
    public void jumpTest(){
        assertEquals(28, this.b.jump(5));
    }

    // ---Pour permettre l'execution des tests ----------------------
    public static junit.framework.Test suite() {
        return new junit.framework.JUnit4TestAdapter(goosegame.JumpTest.class);
      }
}
