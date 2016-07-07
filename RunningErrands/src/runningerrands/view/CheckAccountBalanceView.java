/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runningerrands.view;

import runningerrands.RunningErrands;

/**
 *
 * @author kburkart
 */
public class CheckAccountBalanceView extends View {
    
    
    
    public CheckAccountBalanceView() {
        super("\n"
        + "*********************************************************************************\n"
        + "CHECK ACCOUNT BALANCE\n"
        + "*********************************************************************************\n"
        + "Enter \"A\" to check your account balance\n"
        + "Press \"Q\" to go back to Game Menu \n"    
        + "*********************************************************************************\n");
        
    }
    
    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase();
        
        switch(choice) {
            
            case "A": 
                this.displayAccountBalance();
                break;
            default:
                ErrorView.display(this.getClass().getName(),
                        "Invalid Selection. Try Again.");
                break;
        }
        
        return false;
    }

    private void displayAccountBalance() {
        
        System.out.print("\n\nYour account balance is : $");
        System.out.println( String.format( "%.2f", RunningErrands.getPlayer().getAccountBalance()) + "\n" );
    }
    
}
