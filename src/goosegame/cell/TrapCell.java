package goosegame.cell;
import goosegame.*;
public class TrapCell extends Cell{
    public TrapCell(int index){
        super(index);
    }
    public boolean canLeave(Player player){
        return false;
    }
    public boolean isTrap(){
        return true;
    }
    public String toString(){
        
        return super.toString() + " (trap)";
    }
    

    
}