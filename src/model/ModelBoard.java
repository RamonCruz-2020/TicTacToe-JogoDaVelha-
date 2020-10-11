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
    
    private ModelTurn turn;
    
    public ModelBoard(int sizeBoard, ModelTurn turn){
        
        this.board = new int [sizeBoard][sizeBoard];
        this.turn = turn;
    }

    public int[][] getBoard() {        
        return board;
    }

    public void setBoard(int[][] board) {
        this.board = board;        
    }
    
    public int getCell (int x, int y){
        
        return this.board[x][y];
        
    }
    
    public void setCell(int x, int y, int a){
        
        if(this.board [x][y] == 0){
            
            this.board [x][y] = a;
            this.turn.Turn();
            
        }
        
    }
    
    public boolean emptyCell(int x, int y){
        
        return this.board [x][y] == 0;
        
    }
    
}
