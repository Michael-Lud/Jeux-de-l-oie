package goosegame;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class BoardTest {
    

    @Test
    public void TestCreateClassicalBoard(){
        ClassicalBoard board = new ClassicalBoard(63);
        assertEquals(63, board.nbOfcells);
        board.initBoard();
        assertEquals(null, board.getCell(0));
        Cell c1 = board.getCell(7);
        assertEquals(7, c1.getIndex());
        Cell c2 = board.getCell(63);
        assertEquals(63, c2.getIndex());
    }



}
