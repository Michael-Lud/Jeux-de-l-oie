package goosegame.cells;

import goosegame.Cell;

/**
 * class cellTeleport
 */
public class cellTeleport extends Cell {
    /** the index of the cell of destination */
    private int destination;
    /**
     * Build cellTeleport with given index and destination
     * @param index the index of the current cell
     * @param destination the index of the cell of destination
     */
    public cellTeleport(int index, int destination){
        super(index);
        this.destination = destination;
    }
    /**
     * the consequence of this cell
     */
    public int consequence(int d){

        return this.destination - this.index;
    }
    /**
     * the string of this cell
     */
    public String toString(){
        return " (teleport to " + this.destination + ") and jumps to cell " ;
    }
}
