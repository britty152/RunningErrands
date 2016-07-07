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
public class StartProgramView extends View{
    
    public StartProgramView() {
        super( "Please enter your name: ");
        this.displayBanner();
   }
    
   
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

    @Override
    public boolean doAction(String playersName) {
        
        if (playersName.length() < 2) {
            ErrorView.display(this.getClass().getName(),
                    "\nInvalid Players Name: Name must be greater than one character in length.");
            return false;
        }
        
        Player player = GameControl.createPlayer(playersName);
        
        if (player == null) {
            ErrorView.display(this.getClass().getName(),
                    "\nError creating the player.");
            return false;
        }
        
        this.displayNextView(player);
        
        return true; 
    }

    private void displayNextView(Player player) {
        System.out.println("\n\n*********************************************************************************\n"
        + "Welcome to the game " + player.getName() + "\n"
        + "We hope you have a lot of fun!!\n" 
        + "*********************************************************************************\n");
        
        MainMenuView mainMenuView = new MainMenuView();
        
        mainMenuView.display();
    }
}
