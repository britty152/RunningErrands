/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runningerrands.controller;
import exceptions.GameControlException;
import exceptions.TravelControlException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import runningerrands.RunningErrands;
import runningerrands.model.Game;
import runningerrands.model.Map;
import runningerrands.model.Player;
import runningerrands.model.Scene;

/**
 *
 * @author kburkart
 */
public class GameControl {

    public static void startExistingGame(String filePath) 
        throws GameControlException {
        Game game = null;
        
        try( FileInputStream fips = new FileInputStream(filePath)) {
            ObjectInputStream input = new ObjectInputStream(fips);
            
            game = (Game) input.readObject();
        }
        catch (Exception e) {
            throw new GameControlException(e.getMessage());
        }
    }
  
    public static void saveGame (Game game, String filePath) {
        //TODO: This
    }
    
    public static void createNewGame(Player player)
        throws TravelControlException
    {
        Game game = new Game();
        RunningErrands.setCurrentGame(game);
        game.setPlayer(player);
        Map map = TravelControl.createMap();
        game.setMap(map);
        TravelControl.movePlayerToStartingPostion(map);

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
    
     static void assignScenesToLocations(Map map, Scene[] scenes) {
        System.out.println("*** Assign Scenes to Locations stub function called ***");
    } 
}
