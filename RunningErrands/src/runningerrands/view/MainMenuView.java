/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runningerrands.view;

import exceptions.GameControlException;
import exceptions.TravelControlException;
import exceptions.runtimeErrors;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Path;
import java.util.Scanner;
import runningerrands.RunningErrands;
import runningerrands.controller.GameControl;
import runningerrands.model.Game;

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
               ErrorView.display(this.getClass().getName(),
                       "Invalid Selection. Try Again.");
                break;
        }
        
        return false;
    }

    private void startNewGame() {
        this.console.println("Creating new game...");
        //No idea what is happening with this. When you hit "N" it goes on a loop forever
        //saying that the entry cannot be blank.
        /*try{
        GameControl.createNewGame(RunningErrands.getPlayer());
        
        ChooseOccupationView chooseOccupation = new ChooseOccupationView();
        chooseOccupation.displayView();}
        catch (TravelControlException | runtimeErrors ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        } */
    } 

    private void startExistingGame() {
        this.console.println("\n\nEnter the file path for file where the game is to be saved.");
        
        String filePath = this.getInput();
        
        try {
            GameControl.startExistingGame(filePath);
        }
        catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
    }

    private void displayHelpMenu() {
       HelpMenuView helpMenu = new HelpMenuView();
       helpMenu.display();
    }

    private void saveGame() {
       this.console.println("\n\nEnter the file path for fole where the game "
                            + "is to be saved.");
    String filePath = this.getInput();
        
    try {
            GameControl.saveGame(RunningErrands.getCurrentGame(), filePath);
        }
    catch (Exception ex) {
        ErrorView.display("MainMenuView", ex.getMessage());
        }
    }
    public static void saveGame (Game game, String filepath)
            throws GameControlException {
        
    
        try( FileOutputStream fops = new FileOutputStream(filepath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            output.writeObject(game);
        }
        catch(Exception ex) {
               ErrorView.display("MainMenuView", ex.getMessage());
        }
    }
}
