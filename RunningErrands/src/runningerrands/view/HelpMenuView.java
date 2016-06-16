/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runningerrands.view;

import java.util.Scanner;

/**
 *
 * @author kburkart
 */
public class HelpMenuView extends View {
    
    HelpMenuView() {
        super ("\n"
        + "*********************************************************************************\n"
        + "HELP MENU\n"
        + "*********************************************************************************\n"
        + "G - What is the goal of the game?\n"
        + "M - How to move\n"
        + "A - How do I manage my account balance\n"
        + "P - How do I purchase items and where can I purchase them\n"
        + "Q - Back to main menu\n"    
        + "*********************************************************************************\n");
    }
    
    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase();
        
        switch(choice) {
            
            case "G": 
                this.displayGameGoalHelp();
                break;
            case "M":
                this.displayGameMovementHelp();
                break;
            case "A": 
                this.displayAccountBalanceHelp();
                break;
            case "P":
                this.displayPurchaseHelp();
                break;
            default:
                System.out.println("Invalid Selection. Try Again.");
                break;
        }
        
        return false;
    }

    private void displayGameGoalHelp() {
        System.out.println("Display game goal help stub function called");
    } 

    private void displayGameMovementHelp() {
        System.out.println("Display game movement help stub function called");
    }

    private void displayAccountBalanceHelp() {
        System.out.println("Display account balance help stub function called");
    }

    private void displayPurchaseHelp() {
        System.out.println("Display purchase help stub function called");
    }
}
