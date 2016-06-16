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
public class MapMenuView extends View {
    
    MapMenuView() {
        super("\n"
        + "*********************************************************************************\n"
        + "MAP\n"
        + "*********************************************************************************\n\n"
        + "- - - - - - - - - - - - - - - - - - - S - - - - -\n"
        + "- - - - - - - - - - - - - - - - - - - - - - - - -\n"
        + "- - - - - - - - - - - - - - M - - - - - - - - - -\n"
        + "- - - - - - - - - - - - - - - - - - - - - - - - -\n"
        + "- - - - E - - - - - - - - - - - - - - - - - - - -\n"
        + "- - - - - - - - - - - - - - - - - - - - - - - - -\n"
        + "- - - - - - - - - - - - - - - - - - - - - - - - -\n"
        + "- - - - - - - - - - - - - - - - - - - - - - - - -\n"
        + "- - - - - - - - - - - - - - - - - - - - - - - - -\n"
        + "- - - - - - - - - - - - - - - - - - - - - - - - -\n"
        + "- L - - - - - - - - - - - - - - - - H - - - - - -\n"
        + "- - - - - - - - - - - - - - - - - - - - - - - - -\n"
        + "- - - - - - - - - - - - - - - - - - - - - - - - -\n"
        + "- - - - - - - - - - - - - - - - - - - - - - - - -\n"
        + "- - - - - - - - - P - - - - - - - - - - - - - - -\n"
        + "- - - - - - - - - - - - - - - - - - - - - - - - -\n\n"
        + "*********************************************************************************\n"
        + "KEY\n"
        + "*********************************************************************************\n"
        + "E - Elementary School\n"
        + "H - Home\n"
        + "L - Library\n"
        + "M - Mechanic\n"
        + "P - Pizza Parlor\n"
        + "S - Middle School\n"
        + "Q - Back to Game Menu\n"
        + "*********************************************************************************\n");
    }
  
    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase();
        
        switch(choice) {
            
            case "E": 
                //this.displayErrands();
                break;
            case "A":
                //this.checkAccountBalance();
                break;
            case "G": 
                //this.checkGasTank();
                break;
            case "M":
                //this.displayMapMenu();
                break;
            default:
                System.out.println("Invalid Selection. Try Again.");
                break;
        }
        
        return false;
    }
    
}
