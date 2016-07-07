/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runningerrands.view;
import runningerrands.RunningErrands;
import runningerrands.model.Occupation;
/**
 *
 * @author brittanyhuntington
 */
public class ChooseOccupationView {
     private final String menu;
      
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
       String menuOption = "";
       boolean valid = false;
       
       while(!valid) {
           System.out.println("\n" + this.menu);
           menuOption = this.keyboard.readLine();
           menuOption = menuOption.trim();
           
           if (menuOption.length() < 1) {
               ErrorView.display(this.getClass().getName(),
                       "\nInvalid Value: Value cannot be blank.");
               continue;
            }
           else if (menuOption.length() != 1) {
               ErrorView.display(this.getClass().getName(),
                       "\nInvalid Value: Value must be a single character.");
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
                RunningErrands.getPlayer().setJob(Occupation.Janitor);
                return true;
            case "M":
                RunningErrands.getPlayer().setJob(Occupation.MailClerk);
                return true;
            case "P": 
                RunningErrands.getPlayer().setJob(Occupation.PizzaDeliverer);
                return true;
            case "A":
                RunningErrands.getPlayer().setJob(Occupation.AutoMechanic);
                return true;
             case "S":
                RunningErrands.getPlayer().setJob(Occupation.Secretary);
                return true;
             case "N":
                RunningErrands.getPlayer().setJob(Occupation.Nurse);
                return true;
             case "H":
                RunningErrands.getPlayer().setJob(Occupation.HairDresser);
                return true;
             case "T":
                RunningErrands.getPlayer().setJob(Occupation.Teacher);
                return true;
            default:
                ErrorView.display(this.getClass().getName(),
                        "Invalid Selection. Try Again.");
                return false;
        }
        
    }

    private void displayChooseCarView() {
        ChooseCarView chooseCar = new ChooseCarView();
        chooseCar.displayView();
    }
}
