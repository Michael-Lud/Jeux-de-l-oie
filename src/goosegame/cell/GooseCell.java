package goosegame.cell;
import goosegame.*;

public class GooseCell extends Cell{
    public GooseCell(int index){
        super(index);
    }
    @Override
    public int arrivalIndex(Game game,Player p, int diceSum){
        int d= super.arrivalIndex(game, p, diceSum);
        return d + diceSum;
    }
    public String toString(){
        return super.toString()+" (goose)";

    }
    
    
}
