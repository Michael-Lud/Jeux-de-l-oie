package goosegame;
/**
 * abstract class Board
 */
public abstract class Board {
    /** the number of cell */
    protected final int nbOfcells;
    /** table of cell */
    protected Cell[] theCells;
    /**
     * Build Board with given nbOfcells
     * @param nbOfcells the number of cell
     */
    public Board(int nbOfcells){
        this.nbOfcells = nbOfcells;
        this.theCells = new Cell[this.nbOfcells + 1];
        this.initBoard();
    }
    /** the abstract methode initBoard */
    public abstract void initBoard();
    /**
     * get the cell on index
     * @param index the index of cell
     * @return the cell on index
     */
    public Cell getCell(int index){
        Cell c = new Cell(0);
        try {
            c = this.theCells[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            c = this.theCells[2*this.nbOfcells - index];
        }
        return c;
    }
    /**
     * set the cell on the table of cell
     * @param newC the new cell that set
     */
    public void setCell(Cell newC){
        this.theCells[newC.getIndex()] = newC;
    }


    /**
     * get the number of cell
     * @return the number of cell
     */
    public int getNbOfCells(){
        return this.nbOfcells;
    }
}
