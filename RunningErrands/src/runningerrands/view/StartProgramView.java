/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runningerrands.view;
import java.util.Scanner;
import runningerrands.controller.GameControl;
import runningerrands.model.Player;
/**
 *
 * @author brittanyhuntington
 */
public class StartProgramView {
   private String promptMessage; 
    
    public StartProgramView() {
        this.promptMessage = "Please enter your name: "; 
        
        this.displayBanner();
   }
    public void displayStartProgramView() {
        boolean done = false;
        do {
            String playersName = this.getPlayersName(); 
            if (playersName.toUpperCase().equals("Q")) {
                return; 
            }
            done = this.doAction(playersName);
        } while (!done);
      
            
    }
        
        //print banner page, get player's name, player object, display welcome message and main menu on success
       
   
    private void displayBanner() {
        System.out.println("*********************************************************************************\n"
                + "***********************          RUNNING ERRANDS          ***********************\n"
                + "*********************************************************************************\n"
                + "In this game, you play the part of a worker trying to make your way in life.\n"
                + "In your journey, you will find that every action has a concenquence.\n"
                + "You have bills to pay, books to return to the libary, and groceries to buy.\n"
                + "The challange will be to travel from place to place during your time away from\n"
                + "work without running out of gas.\n"
                + "Good luck running errands!! :)\n"
                +"*********************************************************************************\n"
        );
   
    }

    private String getPlayersName() {
       Scanner input = new Scanner(System.in);
       String value = "";
       boolean valid = false;
       while (!valid) {
           System.out.println("\n" + this.promptMessage);
           value = input.nextLine();
           value = value.trim();
           if (value.length() < 1) {
               System.out.println("\nInvalid Value: Value cannot be blank.");
               continue;
           }
           break;
       }
       return value;
    }

    private boolean doAction(String playersName) {
        if (playersName.length() < 2) {
            System.out.println("\nInvalid Players Name: Name must be greater than one character in length.");
            return false;
        }
        Player player = GameControl.createNewPlayer(playersName);
        if (player == null) {
            System.out.println("\nError creating the player.");
            return false;
        }
        this.displayNextView(player);
        return true; 
    }

    private void displayNextView(Player player) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
