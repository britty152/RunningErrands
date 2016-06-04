/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runningerrands.controller;
import runningerrands.RunningErrands;
import runningerrands.model.Player;

/**
 *
 * @author kburkart
 */
public class GameControl {
    
    public void saveGame (Player player) {
    }
    
    public void startGame() {
    }
    
    public void initializeMap() {
    }
    
    public void retrieveSavedGame(Player player) {
    }
    
    public static Player createPlayer(String playersName) {
        if (playersName == null) {
            return null;
        }
        Player player = new Player();
        player.setName(playersName);
        
        RunningErrands.setPlayer(player);
        
        return player;
    }
    
    public void assignPlayerRole(String role, Player player) {
    }
    
}
