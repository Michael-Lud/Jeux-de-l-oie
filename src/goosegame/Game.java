package goosegame;

/**
 * class Game
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Game {
    /** the list of player */
    private List<Player> thePlayers;
    /** the board of game */
    private Board board;

    /**
     * Build Game with given board
     * 
     * @param board
     */
    public Game(Board board) {
        this.board = board;
        this.thePlayers = new ArrayList<Player>();
    }

    /**
     * allow to add player to list player
     * 
     * @param p the player that add
     */
    public void addPlayer(Player p) {
        this.thePlayers.add(p);
    }

    /**
     * allow to play game
     */
    public void play() {
        int cpt = 0;
        while (!estGagnant()) {
            if (cpt == this.nbPlayer()) { // pour changer de joueur
                cpt = 0;
            }
            Player player = this.thePlayers.get(cpt);
            if (player.getCell().canMove()) {
                int des = player.twoDiceThrow();
                int index = player.getCell().index;
                // affiche le nombre joueur jouer par le joueur
                Cell cell = player.getCell();
                cell.setPlayer(null);

                // verifie si on depasse la derniere case
                Cell cellP1 = this.board.getCell(index + des); // résoud le problème de goose et de téléportation
                Cell cellP = this.board.getCell(cellP1.consequence(des) + cellP1.getIndex());
                String message = this.string(player, cell, cellP1, des);
                player.changeCell(cellP); // je change la case du joueur
                if (cellP1.getIndex() != cellP.getIndex()) {
                    message += cellP.getIndex();
                }
                message += tryIsOcuped(cell, cellP);  // vérifie si la case d'arriver est occupé ou pas
                cellP.setPlayer(player); // met à jour le joueur dans la case d'arriver

                System.out.println(message); // affiche message

            } else {
                System.out.println(player.toString() + " is in cell " + player.getCell().getIndex() + ", "
                        + player.toString() + " cannot play");
            }
            cpt += 1; // incrémentation du cpt pour changer de joueur
        }
        if (estGagnant()) {
            Player p = this.thePlayers.get(cpt - 1);
            System.out.println(p.toString() + " has won ");
        }
    }

    /**
     * try if player has won
     * 
     * @param p the player
     * @return true or false
     */
    public boolean estGagnant() {
        for (Player player : thePlayers) {
            if (player.getCell().getIndex() == this.board.nbOfcells) {
                return true;
            }
        }
        return false;
    }

    /**
     * allow to get the number of player
     * 
     * @return the number of player
     */
    public int nbPlayer() {
        int cpt = 0;
        Iterator it = this.thePlayers.iterator();
        while (it.hasNext()) {
            cpt += 1;
            it.next();
        }
        return cpt;
    }

    /**
     * build the string of game
     * 
     * @param p   the current player
     * @param cA  the last cell of this player
     * @param des the number of des who throw the player
     * @param Cb1 the temporary cell reach or he can be the last cell
     * @return
     */
    public String string(Player p, Cell cA, Cell Cb1, int des) {

        return p.toString() + " is in cell " + cA.getIndex() + ", " + p.toString() + " throws " + des
                + " and reaches cell " + Cb1.getIndex() + Cb1.toString();
    }

    public String tryIsOcuped(Cell c1, Cell c2) {
        String res = "";
        if (c2.isOccuped()) {
            Player player2 = c2.getPlayer(); 
            player2.changeCell(c1);
            c1.setPlayer(player2);
            res = res + " cell is busy " + player2.toString() + " is sent to cell " + c1.getIndex();
        }
        return res;
    }

}
