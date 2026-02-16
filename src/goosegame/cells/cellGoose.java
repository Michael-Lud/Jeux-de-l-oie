package goosegame.cells;

import goosegame.Cell;

/**
 * class cellGoose
 */
public class cellGoose extends Cell {
    /**
     * Buidl cellGoose with given index
     * @param index
     */
    public cellGoose(int index){
        super(index);
    }
    /**
     * the consequence of this cell
     */
    public int consequence(int d){
        return d;
    }
    /**
     * the string of this cell
     */
    public String toString(){
        return " (goose) and jumps to cell " ;
    }
}
