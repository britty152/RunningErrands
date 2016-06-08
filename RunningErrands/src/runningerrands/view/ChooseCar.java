/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runningerrands.view;
import java.util.Scanner;
/**
 *
 * @author brittanyhuntington
 */
public class ChooseCarView {
   private String menu;
      
     ChooseCarView() {
        this.menu = "\n"
        + "*********************************************************************************\n"
        + "Choose your Car.\n"
        + "*********************************************************************************\n"
        + "S - SUV\n"
        + "C - Compact\n"
        + "V - Van\n"
        + "T - Truck\n"
        + "H - Hybrid\n"
        + "B - Back to main menu\n"    
        + "*********************************************************************************\n";
    }
    public void displayChooseCarView() {
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
            
            case "S": 
                this.displaySuv();
                break;
            case "C":
                this.displayCompact();
                break;
            case "V": 
                this.displayVan();
                break;
            case "T":
                this.displayTruck();
                break;
             case "H":
                this.displayHybrid();
                break;
            default:
                System.out.println("Invalid Selection. Try Again.");
                break;
        }
        
        return false;
    }

    private void displaySuv() {
         System.out.println("Display SUV stub function called");
    }

    private void displayCompact() {
        System.out.println("Display Compact stub function called");
    }

    private void displayVan() {
       System.out.println("Display Van stub function called");
    }

    private void displayTruck() {
        System.out.println("Display Truck stub function called");
    }

    private void displayHybrid() {
        System.out.println("Display Hybrid stub function called");
    }

   
    }
     