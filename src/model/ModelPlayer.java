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
public class ModelPlayer {
    
    private int id;
    private int win;
    private int token;

    public ModelPlayer(int id, int token) {
        this.id = id;
        this.token = token;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int getToken() {
        return token;
    }

    public void setToken(int token) {
        this.token = token;
    }
    
    
}
