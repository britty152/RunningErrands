/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runningerrands.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import runningerrands.RunningErrands;

/**
 *
 * @author kburkart
 */
public abstract class View implements ViewInterface {
    
    protected String displayMessage;
    
    protected final BufferedReader keyboard = RunningErrands.getInFile();
    protected final PrintWriter console = RunningErrands.getOutFile();
    
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
      
       String value = null;
       boolean valid = false;
       
       while(!valid) {
           System.out.println("\n" + this.displayMessage);
           try {
               value = this.keyboard.readLine();
           } catch (IOException ex) {
               Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
           }
           value = value.trim();
           
           if (value.length() < 1) {
               ErrorView.display(this.getClass().getName(),
                       "\nInvalid Value: Value cannot be blank.");
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
