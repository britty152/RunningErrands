/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runningerrands.controller;

import org.junit.Test;
import static org.junit.Assert.*;
import runningerrands.model.Location;

/**
 *
 * @author brittanyhuntington
 */
public class TravelControlTest {
    
    public TravelControlTest() {
    }

    /**
     * Test of calculateDistance method, of class TravelControl.
     */
    @Test
    public void testCalculateDistance() {
        System.out.println("calculateDistance");
        int row1 = 3;
        int col1 = 2;
        int row2 = 5;
        int col2 = 7;
        TravelControl instance = new TravelControl();
        int expResult = 3;
        int result = instance.calculateDistance(row1, col1, row2, col2);
        assertEquals(expResult, result);
     
    }

    /**
     * Test of calculateFuelRequired method, of class TravelControl.
     */
    @Test
    public void testCalculateFuelRequired() {
        System.out.println("calculateFuelRequired");
        double distance = 9.0;
        double fuelEfficency = 30.0;
        TravelControl instance = new TravelControl();
        double expResult = 0.3;
        double result = instance.calculateFuelRequired(distance, fuelEfficency);
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of isOpen method, of class TravelControl.
     */
    @Test
    public void testIsOpen() {
        System.out.println("isOpen");
        double timeOfDay = 12.0;
        double location = 19.0;
        TravelControl instance = new TravelControl();
        boolean expResult = true;
        boolean result = instance.isOpen(timeOfDay, location);
        assertEquals(expResult, result);
    }

    /**
     * Test of travelTime method, of class TravelControl.
     */
    @Test
    public void testTravelTime() {
        System.out.println("travelTime");
        double timeOfDay = 15.0;
        int distance = 1;
        TravelControl instance = new TravelControl();
        double expResult = 16.0;
        double result = instance.travelTime(timeOfDay, distance);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of canTravel method, of class TravelControl.
     */
    @Test
    public void testCanTravel_3args_1() {
        System.out.println("canTravel");
        boolean isOpen = true;
        double travelTime = 16.0;
        double openHours = 19.0;
        TravelControl instance = new TravelControl();
        boolean expResult = true;
        boolean result = instance.canTravel(isOpen, travelTime, openHours);
        assertEquals(expResult, result);
    }

    /**
     * Test of canTravel method, of class TravelControl.
     */
    @Test
    public void testCanTravel_3args_2() {
        System.out.println("canTravel");
        Location location1 = null;
        Location location2 = null;
        double timeOfDay = 0.0;
        TravelControl instance = new TravelControl();
        boolean expResult = false;
        boolean result = false;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
