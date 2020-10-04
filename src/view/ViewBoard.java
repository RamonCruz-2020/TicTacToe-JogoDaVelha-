/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ControllerBoard;

/**
 *
 * @author Ramon
 */
public class ViewBoard {
    
    private String [][] board;
    
    ControllerBoard cb = new ControllerBoard();

    public String [][] ViewBoard() {

        return board;
        
    }

    public String[][] getBoard() {
        this.board = cb.getBoard();
        return board;
    }

    public void setBoard(String[][] board) {
        this.board = board;
    }
    
    
    
}
