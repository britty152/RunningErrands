/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runningerrands.view;

/**
 *
 * @author kburkart
 */
public class MainMenuView {
    
    private String menu;
    
    MainMenuView() {
        this.menu = "\n"
        + "*********************************************************************************\n"
        + "MAIN MENU\n"
        + "*********************************************************************************\n"
        + "N - Start new game\n"
        + "G - Get and start saved game\n"
        + "H - Get help on how to play the game\n"
        + "S - Save game\n"
        + "Q - Quit \n"    
        + "*********************************************************************************\n";
    }
    
    public void displayMainMenuView() {
        boolean done = false;
        
        do {
            String menuOption = this.getMenuOption();
            
            if (menuOption.toUpperCase().equals("Q"))
                return;
            
            done = this.doAction(menuOption);

        }while(!done);
    }

    private String getMenuOption() {
        System.out.println("Get Menu Option function called");
        return "N";
    }

    private boolean doAction(String menuOption) {
        System.out.println("Do Action Menu Option called");
        return true;
    }
    
}
