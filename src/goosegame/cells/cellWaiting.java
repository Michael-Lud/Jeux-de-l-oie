package goosegame.cells;

import goosegame.Cell;
import goosegame.Player;

/**
 * class cellWaiting
 */
public class cellWaiting extends Cell{
    /** the default value of the time that player waiting */
    private final int DEFAULT_TIME;
    /** the counter of the time of player */
    private int cptTime;
    /**
     * Build cellWaiting with given index and time
     * @param index the index the cell
     * @param time the time of the cell
     */
    public cellWaiting(int index, int time){
        super(index);
        this.DEFAULT_TIME = time;
        this.cptTime = time;
    }
    /**
     * change the player of the cell
     * and set the counter to default time to the new player
     * @param p the new player
     */
    public void setPlayer(Player p){
        this.cptTime = this.DEFAULT_TIME;
        super.setPlayer(p);
    }
    /**
     * try player can move
     */
    public boolean canMove(){
        this.cptTime -= 1;
        return this.cptTime == -1;
    }
    /**
     * get the number of the counter time
     * @return the number of the counter time
     */
    public int getCpt(){
        return this.cptTime;
    }
    /**
     * the string of the cell
     */
    public String toString(){
        return " (waiting for " + this.getCpt() + " )"; 
    }
}
