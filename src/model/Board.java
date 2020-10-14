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
public class Board {
    
    private int[][] board;
    private int pt;
    private int step;
    
    private final Turn turn;
    
    public Board(int sizeBoard, Turn turn){
        
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
    
    public void setCell(int x, int y){
        
        if(this.board [x][y] == 0){
            
            this.board [x][y] = this.turn.getCurrentPlayer().getToken();
            this.scoreSystem(); 
            this.turn.Turn();
            
        }
        
    }
    
    private void scoreSystem (){
        
        for(int i = 0; i < this.board.length; ++i){
            
            for(int j = 0; j < this.board.length; j++){
            
                this.pt = this.pt + this.board[i][j];
                
            }
        
            this.winSystem();
            
        }
        
        for(int i = 0; i < this.board.length; ++i){
            
            for(int j = 0; j < this.board.length; j++){
            
                this.pt = this.pt + this.board[j][i];
                
            }
        
            this.winSystem();

        }
        
        for(int i = 0; i < this.board.length; ++i){
            
            this.pt = this.pt + this.board[i][i];
            
            
        }
        
        this.winSystem();
        
        for(int i = 0; i < this.board.length; ++i){
            
            this.pt = this.pt + this.board[i][2-i];
            
            
        } 
        
        this.winSystem();
        
        for(int i = 0; i < this.board.length; ++i){
            
            for(int j = 0; j < this.board.length; j++){
            
                if(this.board[i][j] != 0){
                    
                    this.step = this.step + 1;
                    
                }
                
            }
            
        }
        this.winSystem();
    }
    
    private void winSystem(){
        
        if(this.pt == 3 || this.pt == -3){
            
            this.turn.getCurrentPlayer().setWin(this.turn.getCurrentPlayer().getWin() + 1);
            this.board = new int [this.board.length][this.board.length];

        }
        
        if(this.step == 9){
            
            this.board = new int [this.board.length][this.board.length];
            
        }
        
        this.step = 0;
        this.pt = 0;
        
    }
    
}
