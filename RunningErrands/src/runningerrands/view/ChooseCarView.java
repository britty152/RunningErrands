/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runningerrands.view;
import exceptions.runtimeErrors;
import runningerrands.RunningErrands;
import runningerrands.model.Car;
/**
 *
 * @author brittanyhuntington
 */
public class ChooseCarView {
   private final String menu;
      
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
        + "Q - Back to main menu\n"    
        + "*********************************************************************************\n";
    }
    public void displayView() throws runtimeErrors {
        boolean done = false;
        
        do {
            String menuOption = this.getMenuOption();
            
            if (menuOption.toUpperCase().equals("Q"))
                return;
            
            done = this.doAction(menuOption);

        }while(!done);
        
        this.displayGameMenuView();
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

    private boolean doAction(String choice) throws runtimeErrors {
        choice = choice.toUpperCase();
      Car car = new Car();
      RunningErrands.getPlayer().setCar(car);
        
        switch(choice) {
            
            case "S": 
                RunningErrands.getPlayer().getCar().setCarName("SUV");
                return true;
            case "C":
                RunningErrands.getPlayer().getCar().setCarName("compact");
                return true;
            case "V": 
                RunningErrands.getPlayer().getCar().setCarName("van");
                return true;
            case "T":
                RunningErrands.getPlayer().getCar().setCarName("truck");
                return true;
             case "H":
                RunningErrands.getPlayer().getCar().setCarName("hybrid");
                return true;
            default:
                throw new runtimeErrors("Invalid Selection. Try Again"
                        + "Entry can only be S, C, V, T, or H.");
        }
    }

    private void displayGameMenuView() {
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

   
}
     
