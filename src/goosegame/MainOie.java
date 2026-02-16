package goosegame;

import java.util.Scanner;

import goosegame.cells.cellGoose;
import goosegame.cells.cellTeleport;
import goosegame.cells.cellTrap;
import goosegame.cells.cellWaiting;
/**
 * class MainOie
 */


public class MainOie {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\n\n\t\t\t BIENVENUE AU JEU DE L'OIE\n");
        System.out.print("Veuillez entrer le nombre de joueur : ");
        int x = input.nextInt();
        

        ClassicalBoard board = new ClassicalBoard(63);
        board.setCell(new cellTeleport(6, 12));
        board.setCell(new cellGoose(9));    
        board.setCell(new cellGoose(18));
        board.setCell(new cellWaiting(19, 2));
        board.setCell(new cellTrap(31));
        board.setCell(new cellTeleport(58, 1));
        Game game = new Game(board);
        
        for (int i = 0; i < x; i++) {
            System.out.print("Entrer le nom de du joueur " + (i + 1) + " : ");
            String name = input.next();
            Player p = new Player(name);
            p.changeCell(new Cell(0));
            game.addPlayer(p);
        }
        System.out.println("\n\t\t\tDEBUT DE LA PARTIE \n");
        game.play();
    
    }
}
