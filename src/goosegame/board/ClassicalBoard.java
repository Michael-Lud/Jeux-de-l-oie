package goosegame.board;
import goosegame.*;
import goosegame.cell.GooseCell;
import goosegame.cell.StartingCell;
import goosegame.cell.TeleportCell;
import goosegame.cell.TrapCell;
import goosegame.cell.WaitingCell;

public class ClassicalBoard extends Board {
    /**
     * build a new classical Board
     * @param nbOfCell the number of cell
     */
    public ClassicalBoard(){
        super(63);
    }
    public void initBoard(){
        for(int i=0; i<=this.nbOfCells;i++){
            this.theCell[i]= new Cell(i);
        }
        this.theCell[0]= new StartingCell();
        this.theCell[6]= new TeleportCell(6, 12);
        this.theCell[42]= new TeleportCell(42, 30);
        this.theCell[58]= new TeleportCell(58, 1);
        this.theCell[19]= new WaitingCell(19, 2);
        int[]goosse= {9,18,27,36,45,54};
        
        int[]trap = {31,52};
        for(int i: goosse){
            this.theCell[i] = new GooseCell(i);
        }
        for(int i: trap){
            this.theCell[i] = new TrapCell(i);
        }
        
        

    }
    
    
}
