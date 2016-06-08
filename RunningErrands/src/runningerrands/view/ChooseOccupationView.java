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
public class ChooseOccupationView {
     private String menu;
      
     ChooseOccupationView() {
        this.menu = "\n"
        + "*********************************************************************************\n"
        + "Choose your occupation.\n"
        + "*********************************************************************************\n"
        + "J - Janitor\n"
        + "M - Mail clerk\n"
        + "P - Pizza delivery driver\n"
        + "A - Mechanic\n"
        + "S - Secretary\n"
        + "N - Nurse\n"
        + "H - Hair Dresser\n"
        + "T - Teacher"
        + "B - Back to main menu\n"    
        + "*********************************************************************************\n";
    }
    public void displayChooseOccupationView() {
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
            
            case "J": 
                this.displayJanitor();
                break;
            case "M":
                this.displayMailClerk();
                break;
            case "P": 
                this.displayPizzaDeliveryDriver();
                break;
            case "A":
                this.displayMechanic();
                break;
             case "S":
                this.displaySecretary();
                break;
             case "N":
                this.displayNurse();
                break;
             case "H":
                this.displayHairDresser();
                break;
             case "T":
                this.displayTeacher();
                break;
            default:
                System.out.println("Invalid Selection. Try Again.");
                break;
        }
        
        return false;
    }

    private void displayJanitor() {
        System.out.println("Display Janitor stub function called");
    }

    private void displayMailClerk() {
        System.out.println("Display Mail Clerk stub function called");
    }

    private void displayPizzaDeliveryDriver() {
       System.out.println("Display Pizza Delivery Driver stub function called");
    }

    private void displayMechanic() {
        System.out.println("Display Mechanic stub function called");
    }

    private void displaySecretary() {
       System.out.println("Display Secretary  stub function called");  
    }

    private void displayNurse() {
        System.out.println("Display Nurse stub function called");
    }

    private void displayHairDresser() {
       System.out.println("Display Hair Dresser stub function called"); 
    }

    private void displayTeacher() {
      System.out.println("Display Teacher stub function called");
    }
}
