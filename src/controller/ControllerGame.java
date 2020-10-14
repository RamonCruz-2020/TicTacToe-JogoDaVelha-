/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Board;
import model.Player;
import model.Turn;

/**
 *
 * @author Ramon
 */
public class ControllerGame {
    
    private final int SIZEBOARD = 3;
    
    Player p1 = new Player(1,1);
    Player p2 = new Player(2,-1);
    Turn turn = new Turn(p1, p2);
    Board mb = new Board(SIZEBOARD, turn);

    public ControllerGame() { 
        
    }
    
    public String[][] convertForward(){
        
        String [][] board = new String [SIZEBOARD][SIZEBOARD];
        
        for(int i = 0; i < board.length; ++i){
            for(int j = 0; j < board.length; j++){
            
                
                switch(mb.getBoard()[i][j]){
                    
                    case 1:
                        board[i][j] = "X";
                        break;
                    case -1:
                        board[i][j] = "O";
                        break;
                    case 0:
                        board[i][j] = "";
                        break;
                    default:
                        System.out.println("erro ao converte forw");
                    
                }
            
            }
        
        }
    
        return board;
        
    }
    
    public void setCell(int x, int y){
        
        this.mb.setCell(x, y);
        
    }
    
    public int getPlayerTurn(){
        
        return this.turn.getCurrentPlayer().getId();
        
    }
    
    public int [] getScoreBoard(){
        
        int [] sb = new int [] {this.p1.getWin(),this.p2.getWin()};
        
        return sb;
        
    }
    
}
