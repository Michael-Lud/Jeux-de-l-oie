package goosegame.cell;
import goosegame.*;
public class WaitingCell extends Cell{
    //number of turns to wait
    private int turns; 
    private int remaning;
    //construct a new waiting Cell
    public WaitingCell(int index, int turns){
        super(index);
        this.turns = turns;
        this.remaning = 0;
    }
    public boolean canLeave(Player player){
        return this.remaning == 0;
    }
    /**
     * @return number of turn to wait before playing
     */
    public int getTurns(){
        return this.turns;
    }

    public int arrivalIndex(Game game,Player player, int diceSum){
        this.remaning = turns;
        return super.arrivalIndex(game, player, diceSum);
    }
    /**
     * decrement  waiting turns till 0
     *  remaing  waiting turnsturn
     */
    public void decrement(){
        if(this.remaning >0){
            this.remaning -= 1;
        }
        
    }
    public String ToString(){
        return super.toString()+" (waiting for "+this.turns+" turns)";
    }




}