/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runningerrands.view;

import java.util.Scanner;
import runningerrands.RunningErrands;
import runningerrands.controller.GameControl;

/**
 *
 * @author kburkart
 */
public class MainMenuView extends View {
    
    public MainMenuView() {
        super( "\n"
        + "*********************************************************************************\n"
        + "MAIN MENU\n"
        + "*********************************************************************************\n"
        + "N - Start new game\n"
        + "G - Get and start saved game\n"
        + "H - Get help on how to play the game\n"
        + "S - Save game\n"
        + "Q - Quit \n"    
        + "*********************************************************************************\n");
    }
    

    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase();
        
        switch(choice) {
            
            case "N": 
                this.startNewGame();
                break;
            case "G":
                this.startExistingGame();
                break;
            case "H": 
                this.displayHelpMenu();
                break;
            case "S":
                this.saveGame();
                break;
            default:
                System.out.println("Invalid Selection. Try Again.");
                break;
        }
        
        return false;
    }

    private void startNewGame() {
        GameControl.createNewGame(RunningErrands.getPlayer());
        
        ChooseOccupationView chooseOccupation = new ChooseOccupationView();
        chooseOccupation.displayView();
    } 

    private void startExistingGame() {
        System.out.println("Start existing game stub function called");
    }

    private void displayHelpMenu() {
       HelpMenuView helpMenu = new HelpMenuView();
       helpMenu.display();
    }

    private void saveGame() {
        System.out.println("Save game stub function called");
    }
    
}
