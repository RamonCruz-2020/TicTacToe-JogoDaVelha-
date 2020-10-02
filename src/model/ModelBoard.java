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
    
    public void ModelBoard(int x, int y){
        
        board = new int [x][y];
        
    }
    
    
    
}
