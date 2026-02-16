package goosegame.cells;

import goosegame.Cell;

/**
 * class cellTrap
 */
public class cellTrap extends Cell{
    /**
     * Build cellTrap with given index
     * @param index the index of the cell
     */
    public cellTrap(int index){
        super(index);
    }
    /**
     * avoid player to move on this cell
     * @return false
     */
    public boolean canMove(){
        return false;
    }
    /**
     * the string of this cell
     */
    public String toString(){
        return " (trap)";
    }
}
