/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runningerrands.controller;

import runningerrands.model.Car;
import runningerrands.model.Location;

/**
 *
 * @author kburkart
 */
public class TravelControl {

    public TravelControl() {
    }
   
    private static final int NUM_OF_ROWS = 25;
    private static final int NUM_OF_COLUMNS = 25;
    
    public int calculateDistance (int row1, int col1, int row2, int col2) {
        int totalDistance = 0;
        if (row1 < 0 || row1 > NUM_OF_ROWS - 1) {
            totalDistance = -1;
        }
        else if (col1 < 0 || col1 > NUM_OF_COLUMNS - 1) {
            totalDistance = -1;
        }
        else if (row2 < 0 || row2 > NUM_OF_ROWS - 1) {
            totalDistance = -1;
        }
        else if (col2 < 0 || col2 > NUM_OF_COLUMNS - 1) {
            totalDistance = -1;
        }
        else {
            int rowDistance = Math.abs(row1 - row2);
            int columnDistance = Math.abs(col1 - col2);
            totalDistance = rowDistance + columnDistance;
        }
       return totalDistance; 
    }
    
    public double calculateFuelRequired (int distance, Car car) {
        return 0;
    }
    
    public boolean canTravel (Location location1, Location location2, double timeOfDay) {
        return false;
    }
    
    public double travelTime(double timeOfDay, int distance) {
        return 0;
    }
    
    public boolean isOpen (double timeOfDay, Location location) {
        return true;
    }
    
    
}
