package goosegame;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class GameTest {
    
    private Game game;
    private Board board;
    private Player p1;
    private Player p2;
    private Player p3;


    @BeforeEach
    public void before(){
        this.board = new ClassicalBoard(63);
        this.game = new Game(this.board);
        this.p1 = new Player("AVLAH");
        this.p2 = new Player("Adama");
        this.p3 = new Player("Eliya");
    }

    @Test
    public void TestGameEstGagnantMethode(){
        Cell c1 = new Cell(63);
        Cell c2 = new Cell(12);
        Cell c3 = new Cell(50);
        this.p1.changeCell(c1);
        this.p2.changeCell(c2);
        this.p3.changeCell(c3);
        game.addPlayer(p1);
        game.addPlayer(p2);
        game.addPlayer(p3);
        assertTrue(game.estGagnant());
        Cell c4 = new Cell(45);
        this.p1.changeCell(c4);
        assertFalse(game.estGagnant());
    }

}
