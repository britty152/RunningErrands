/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author brittanyhuntington
 */
public class runtimeErrors extends Exception{

    public runtimeErrors() {
    }

    public runtimeErrors(String message) {
        super("Invalid entry, please try again");
        
    }

    public runtimeErrors(String message, Throwable cause) {
        super("Invailid entry, input must be a single character.", cause);
    }

    public runtimeErrors(Throwable cause) {
        super(cause);
    }

    public runtimeErrors(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
