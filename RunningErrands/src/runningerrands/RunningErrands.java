/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runningerrands;

import runningerrands.model.Game;
import runningerrands.model.Player;
import runningerrands.view.StartProgramView;

/**
 *
 * @author brittanyhuntington
 */

        
public class RunningErrands {
    
    private static Game currentGame = null;
    private static Player player = null;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        RunningErrands.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        RunningErrands.player = player;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       StartProgramView object = new StartProgramView(); 
       object.displayStartProgramView();
    }
    
}

