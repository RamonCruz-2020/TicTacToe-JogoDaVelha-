/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Ramon
 */
public class ModelBoard {
    
    private int[][] board;
    private int currentPlayer;
    
    public ModelBoard(int sizeBoard){
        
        this.board = new int [sizeBoard][sizeBoard];
        
    }

    public int[][] getBoard() {
        
        return board;
    }

    public void setBoard(int[][] board) {
        
        this.board = board;
        
    }

    public int getCurrentPlayer() {
        
        return currentPlayer;
    }

    public void setCurrentPlayer(int currentPlayer) {
        
        this.currentPlayer = currentPlayer;
        
    }
    
    public void setCell(int x, int y, int a){
        
        if(this.board [x][y] == 0){
            
            this.board [x][y] = a;
            
        }
        
    }
    
    
    
}
