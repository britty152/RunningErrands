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
public abstract class View implements ViewInterface {
    
    protected String displayMessage;
    
    public View(String message) {
        this.displayMessage = message;
    }

    @Override
    public void display() {
        boolean done = false;
        
        do {
            String value = this.getInput();
            
            if (value.toUpperCase().equals("Q"))
                return;
            
            done = this.doAction(value);

        }while(!done);
    }

    @Override
    public String getInput() {
       Scanner input = new Scanner(System.in);
       String value = null;
       boolean valid = false;
       
       while(!valid) {
           System.out.println("\n" + this.displayMessage);
           value = input.nextLine();
           value = value.trim();
           
           if (value.length() < 1) {
               System.out.println("\nInvalid Value: Value cannot be blank.");
               continue;
            }
          break;        
       }
        return value;
    }

    @Override
    public boolean doAction(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
