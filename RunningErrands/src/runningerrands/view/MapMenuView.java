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
public class MapMenuView {
    
    private String menu;
    
    MapMenuView() {
        this.menu = "\n"
        + "*********************************************************************************\n"
        + "MAP MENU\n"
        + "*********************************************************************************\n"
        + "E - Display errands\n"
        + "A - Check account balance\n"
        + "G - Check gas tank\n"
        + "M - Go to map\n"
        + "B - Back to main menu \n"    
        + "*********************************************************************************\n";
    }
    
    public void displayMenu() {
        
      boolean done = false;
        
        do {
            String menuOption = this.getMenuOption();
            
            if (menuOption.toUpperCase().equals("B"))
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
           else if (menuOption.length() != 1) {
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
