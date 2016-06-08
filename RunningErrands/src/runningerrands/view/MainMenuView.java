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
public class MainMenuView {
    
    private String menu;
    
    MainMenuView() {
        this.menu = "\n"
        + "*********************************************************************************\n"
        + "MAIN MENU\n"
        + "*********************************************************************************\n"
        + "N - Start new game\n"
        + "G - Get and start saved game\n"
        + "H - Get help on how to play the game\n"
        + "S - Save game\n"
        + "Q - Quit \n"    
        + "*********************************************************************************\n";
    }
    
    public void displayMainMenuView() {
        boolean done = false;
        
        do {
            String menuOption = this.getMenuOption();
            
            if (menuOption.toUpperCase().equals("Q"))
                return;
            
            done = this.doAction(menuOption);

        }while(!done);
    }

    private String getMenuOption() {
        Scanner input = new Scanner(System.in);
       String menuOption = "";
       boolean valid = false;
       
       while(!valid) {
           System.out.println("\n" + this.menu);
           menuOption = input.nextLine();
           menuOption = menuOption.trim();
           
           if (menuOption.length() < 1) {
               System.out.println("\nInvalid Value: Value cannot be blank.");
               continue;
            }
           if (menuOption.length() != 1) {
               System.out.println("\nInvalid Value: Value must be a single character.");
               continue;
           }
          break;        
       }
        return menuOption;
    }

    private boolean doAction(String choice) {
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
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    } 

    private void startExistingGame() {
        System.out.println("Start existing game stub function called");
    }

    private void displayHelpMenu() {
       HelpMenuView helpMenu = new HelpMenuView();
       helpMenu.displayMenu();
    }

    private void saveGame() {
        System.out.println("Save game stub function called");
    }
    
}
