/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runningerrands.controller;

//import runningerrands.model.Car;
//import runningerrands.model.Location;

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
        int totalDistance;
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
    
    public double calculateFuelRequired (double distance, double fuelEfficency) {
        double fuelRequired; 
        if (fuelEfficency <= 0) {
            fuelRequired = 0; 
        }
        else if (distance  <= 0) {
            fuelRequired = 0; 
        }
        else {
            fuelRequired =  distance / fuelEfficency; 
        }
        return fuelRequired;
    }
    
    /**
     *
     * @param timeOfDay
     * @param location
     * @return
     */
    public boolean isOpen (double timeOfDay, double location) {
      
        if (location > timeOfDay){
           return false; 
       }
       else {
           return true; 
       }
    }
    
   
    public double travelTime(double timeOfDay, int distance) {
        double time;  //rush hour will be from 1630 to 1800
        if (timeOfDay <= 16.0) {
            time = distance + timeOfDay;
            return time; 
        }
        else if (timeOfDay >= 16.5 && timeOfDay <= 18.0) {
            time = distance + timeOfDay + 15.0; //this is calculating the extra time it will take for rush hour
            return time; 
        }
        else {
            time = distance + timeOfDay; 
            return time; 
        }
        
    }
     public boolean canTravel (boolean isOpen, double travelTime, double openHours) { //this should use travelTime and isOpen to make sure player will get there in time for cloing
        
        if (travelTime <= openHours || isOpen == true) {
            return true;
        }
        else if (travelTime > openHours || isOpen == false){
            return false;
        }
        else {
            return false; 
        }
    }
}
