package goosegame;
import org.junit.jupiter.api.*;

import goosegame.cells.cellWaiting;

import static org.junit.jupiter.api.Assertions.*;

public class CellTest {

    private Player p1;
    private Player p2;
    
    @BeforeEach
    public void before(){
         this.p1 = new Player("Adama");
        this.p2 = new Player("Eliya");
    }


    @Test
    public void TestCellWaitingCanMoveMethode(){
        Cell c1 = new cellWaiting(6, 4);
        assertFalse(c1.canMove());
        assertFalse(c1.canMove());
        assertFalse(c1.canMove());
        assertFalse(c1.canMove());
        assertTrue(c1.canMove());    
    }

    @Test
    public void TestCellWaitingSetPlayer(){
        cellWaiting c2 = new cellWaiting(5, 6);
        c2.canMove();
        c2.canMove();
        c2.canMove();
        assertEquals(3, c2.getCpt());
        c2.setPlayer(p1);
        assertEquals(6, c2.getCpt());
    }


}

