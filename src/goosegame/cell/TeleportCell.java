package goosegame.cell;
import goosegame.*;

public class TeleportCell extends Cell{
    private int destination;
    public TeleportCell(int index, int destination){
        super(index);
        this.destination= destination;
    }
    public int arrivalIndex(Game game,Player P,int diceSum){
        return this.destination;
    }
    public String toString(){
        return super.toString()+" (teleport to "+this.destination+")";
    }
    
}
