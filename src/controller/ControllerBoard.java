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
    private String Cell;
    
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

    public String getCell() {        
        return Cell;        
    }

    public void setCell(String Cell) {        
        this.Cell = Cell;        
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
    
    public void convetBackward(int x, int y, String a){
        
           
        switch(a){
                    
            case "X":
                mb.setCell(x, y, 1);
                break;
            case "O":
                mb.setCell(x, y, -1);
                break;
            default:
            System.out.println("erro ao converte back");
                        
        }
        
    }
    
}
