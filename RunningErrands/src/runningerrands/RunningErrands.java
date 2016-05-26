/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runningerrands;

import runningerrands.controller.TravelControl;

/**
 *
 * @author brittanyhuntington
 */

        
public class RunningErrands {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       TravelControl travelControl = new TravelControl();
       System.out.println(travelControl.calculateDistance(4, 3, 4, 3));
    }
    
}

