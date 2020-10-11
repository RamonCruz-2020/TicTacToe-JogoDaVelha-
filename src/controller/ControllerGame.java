/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.ModelBoard;
import model.ModelPlayer;
import model.ModelTurn;

/**
 *
 * @author Ramon
 */
public class ControllerGame {
    
    private final int SIZEBOARD = 3;
    private String [][] board ;
    
        ModelPlayer p1 = new ModelPlayer(1,1);
        ModelPlayer p2 = new ModelPlayer(2,-1);
        ModelTurn turn = new ModelTurn(p1, p2);
        ModelBoard mb = new ModelBoard(SIZEBOARD, turn);

    public ControllerGame() { 
        
        this.board = new String [SIZEBOARD][SIZEBOARD];
        
    }

    public String[][] getBoard() {        
        return board;    
    }

    public void setBoard(String[][] board) {        
        this.board = board;        
    }
   
    public void convertForward(){
        
        for(int i = 0; i<=2; ++i){
            for(int j = 0; j<=2; j++){
            
                
                switch(mb.getBoard()[i][j]){
                    
                    case 1:
                        this.board[i][j] = "X";
                        break;
                    case -1:
                        this.board[i][j] = "O";
                        break;
                    case 0:
                        this.board[i][j] = "";
                        break;
                    default:
                        System.out.println("erro ao converte forw");
                    
                }
                
                System.out.println(mb.getBoard()[i][j] + " : " + i + "," + j);
            
            }
        
        }
    
    }
    
    public void setCell(int x, int y){
        
        this.mb.setCell(x, y, this.turn.getCurrentPlayer().getToken());
        
    }
    
    public boolean emptyCell(int x, int y){
        
        return this.mb.emptyCell(x, y);
        
    }
    
    public int getPlayerTurn(){
        
        return this.turn.getCurrentPlayer().getId();
        
    }
    
}
