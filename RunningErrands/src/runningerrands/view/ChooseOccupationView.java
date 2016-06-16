/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runningerrands.view;
import java.util.Scanner;
import runningerrands.RunningErrands;
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
        + "T - Teacher\n"
        + "Q - Back to main menu\n"    
        + "*********************************************************************************\n";
    }
    public void displayView() {
        boolean done = false;

        do {
            String menuOption = this.getMenuOption();
            
            if (menuOption.toUpperCase().equals("Q"))
                return;
            
            done = this.doAction(menuOption);

        }while(!done);
        
        this.displayChooseCarView();
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
            
            case "J": 
                RunningErrands.getPlayer().setJob("janitor");
                return true;
            case "M":
                RunningErrands.getPlayer().setJob("mail clerk");
                return true;
            case "P": 
                RunningErrands.getPlayer().setJob("pizza deliverer");
                return true;
            case "A":
                RunningErrands.getPlayer().setJob("auto mechanic");
                return true;
             case "S":
                RunningErrands.getPlayer().setJob("secretary");
                return true;
             case "N":
                RunningErrands.getPlayer().setJob("nurse");
                return true;
             case "H":
                RunningErrands.getPlayer().setJob("hair dresser");
                return true;
             case "T":
                RunningErrands.getPlayer().setJob("teacher");
                return true;
            default:
                System.out.println("Invalid Selection. Try Again.");
                return false;
        }

    }

    private void displayChooseCarView() {
        ChooseCarView chooseCar = new ChooseCarView();
        chooseCar.displayView();
    }
}
