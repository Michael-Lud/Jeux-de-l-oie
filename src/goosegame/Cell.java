package goosegame;

/**
 * class Cell
 */

public class Cell {
    /** the player */
    protected Player player;
    /** the index of cell */
    protected int index;
    /**
     * Build Cell with given index
     * @param index
     */
    public Cell(int index){
        this.index = index;
        this.player = null;
    }
    /**
     * get the player of cell
     * @return the player of cell
     */
    public Player getPlayer(){
        return this.player;
    }
    /**
     * get the index of cell
     * @return the index of cell
     */
    public int getIndex(){
        return this.index;
    }
    /**
     * set the player of cell
     * @param p the new player of cell
     */
    public void setPlayer(Player p){
        this.player = p;
    }
    /**
     * try if the cell is occuped
     * @return true or false
     */
    public boolean isOccuped(){
        return this.player != null;
    }
    
    /**
     * the consequence on this cell
     * @param d the number of dés that throw the player 
     * @return the distance of rebound
     */
    public int consequence(int d){
        return 0;
    }
    /**
     * try if player can move on this cell
     * @return true or false
     */
    public boolean canMove(){
        return true;
    }
    /**
     * the string of this cell
     */
    public String toString(){
        return "";
    }

}
