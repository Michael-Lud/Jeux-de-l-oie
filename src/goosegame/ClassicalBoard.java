package goosegame;
/**
 * class ClassicalBoard
 */
public class ClassicalBoard extends Board {
    /**
     * Build ClassicalBoard with given nbOfcells
     * @param nbOfcells
     */
    public ClassicalBoard(int nbOfcells){
        super(nbOfcells);
    }
    /**
     * initialisation of the table of cell of Classiboard
     */
    public void initBoard(){
        for (int i = 1; i < theCells.length; i++) {
            this.theCells[i] = new Cell(i);
        }
    }
}
