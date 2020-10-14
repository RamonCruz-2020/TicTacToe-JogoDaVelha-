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
public class Turn {
    
    private Player player1;
    private Player player2;
    private Player currentPlayer;

    public Turn(Player player1, Player player2) {
        
        this.player1 = player1;
        this.player2 = player2;
        this.currentPlayer = this.player1;
        
    }

    public Player getPlayer1() {
        return player1;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public void setCurrentPlayer(Player currentPlayer) {
        this.currentPlayer = currentPlayer;
    }
 
    public void Turn (){
    
       
            if(this.currentPlayer == this.player1){

                this.currentPlayer = this.player2;

            }else{

                this.currentPlayer = this.player1;
            
        }
            
    }
    
}
