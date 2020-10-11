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
public class ModelTurn {
    
    private ModelPlayer player1;
    private ModelPlayer player2;
    private ModelPlayer currentPlayer;

    public ModelTurn(ModelPlayer player1, ModelPlayer player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.currentPlayer = this.player1;
    }

    public ModelPlayer getPlayer1() {
        return player1;
    }

    public void setPlayer1(ModelPlayer player1) {
        this.player1 = player1;
    }

    public ModelPlayer getPlayer2() {
        return player2;
    }

    public void setPlayer2(ModelPlayer player2) {
        this.player2 = player2;
    }

    public ModelPlayer getCurrentPlayer() {
        return currentPlayer;
    }

    public void setCurrentPlayer(ModelPlayer currentPlayer) {
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
