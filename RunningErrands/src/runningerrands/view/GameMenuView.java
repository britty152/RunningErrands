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
public class GameMenuView extends View{

    
    GameMenuView() {
        super( "\n"
        + "*********************************************************************************\n"
        + "GAME MENU\n"
        + "*********************************************************************************\n"
        + "E - Display errands\n"
        + "A - Check account balance\n"
        + "G - Check gas tank\n"
        + "M - Go to map\n"
        + "Q - Back to main menu \n"    
        + "*********************************************************************************\n");
    }

    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase();
        
        switch(choice) {
            
            case "E": 
                this.displayErrands();
                break;
            case "A":
                this.checkAccountBalance();
                break;
            case "G": 
                this.checkGasTank();
                break;
            case "M":
                this.displayMapMenu();
                break;
            default:
                System.out.println("Invalid Selection. Try Again.");
                break;
        }
        
        return false;
    }

    private void displayErrands() {
        System.out.println("Display errands stub function called");
    }

    private void checkAccountBalance() {
        CheckAccountBalanceView checkAccountBalance = new CheckAccountBalanceView();
        checkAccountBalance.display();
    }

    private void checkGasTank() {
        CheckGasTankView checkGasTank = new CheckGasTankView();
        checkGasTank.display();
    }

    private void displayMapMenu() {
       MapMenuView mapMenu = new MapMenuView();
       mapMenu.display();
    }
    
}
