/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Ramon
 */
public class ViewBoard {
    
    private String [][] board = {{"X", "O", "O"},
                                 {"X", "X", "O"},
                                 {"O", "X", "O"}};

    public String [][] ViewBoard() {

        
        return board;
        
    }

    public String[][] getBoard() {
        return board;
    }

    public void setBoard(String[][] board) {
        this.board = board;
    }
    
    
    
}
