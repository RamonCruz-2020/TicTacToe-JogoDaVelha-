/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.ModelBoard;

/**
 *
 * @author Ramon
 */
public class ControllerBoard {
    
    private int sizeBoard = 3;
    private String [][] board ;
    
    ModelBoard mb = new ModelBoard(sizeBoard);

    public ControllerBoard() {
        
        this.board = new String [sizeBoard][sizeBoard];
        
    }
    
    public int getSizeBoard() {
        
        return sizeBoard;
        
    }

    public void setSizeBoard(int sizeBoard) {
        
        this.sizeBoard = sizeBoard;
        
    }

    public String[][] getBoard() {
        
        return board;
    
    }

    public void setBoard(String[][] board) {
        
        this.board = board;
        
    }
    
    
    public void convert(){
        
        for(int i = 0; i<=2; ++i){
            for(int j = 0; j<=2; j++){
            
                
                switch(mb.getBoard()[i][j]){
                    
                    case 1:
                        this.board[i][j] = "X";
                        break;
                    case -1:
                        this.board[1][j] = "O";
                        break;
                    case 0:
                        this.board[i][j] = " ";
                        break;
                    default:
                        System.out.println("erro ao converte");
                    
                }
                
                System.out.println(mb.getBoard()[i][j] + " " + i);
            
            }
        
        }
    
    }
}
