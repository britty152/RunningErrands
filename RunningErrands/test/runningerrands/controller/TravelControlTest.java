/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runningerrands.controller;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import runningerrands.model.Car;
import runningerrands.model.Location;

/**
 *
 * @author kburkart
 */
public class TravelControlTest {
    
    public TravelControlTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calculateDistance method, of class TravelControl.
     */
    @Test
    public void testCalculateDistanceValid1() {
        System.out.println("calculateDistance");
        int row1 = 1;
        int col1 = 1;
        int row2 = 3;
        int col2 = 5;
        TravelControl instance = new TravelControl();
        int expResult = 6;
        int result = instance.calculateDistance(row1, col1, row2, col2);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCalculateDistanceValid2() {
        System.out.println("calculateDistance");
        int row1 = 3;
        int col1 = 1;
        int row2 = 1;
        int col2 = 4;
        TravelControl instance = new TravelControl();
        int expResult = 5;
        int result = instance.calculateDistance(row1, col1, row2, col2);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCalculateDistanceValid3() {
        System.out.println("calculateDistance");
        int row1 = 3;
        int col1 = 5;
        int row2 = 1;
        int col2 = 1;
        TravelControl instance = new TravelControl();
        int expResult = 6;
        int result = instance.calculateDistance(row1, col1, row2, col2);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCalculateDistanceInvalid1() {
        System.out.println("calculateDistance");
        int row1 = -1;
        int col1 = 3;
        int row2 = 6;
        int col2 = 25;
        TravelControl instance = new TravelControl();
        int expResult = -1;
        int result = instance.calculateDistance(row1, col1, row2, col2);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCalculateDistanceInvalid2() {
        System.out.println("calculateDistance");
        int row1 = 25;
        int col1 = 3;
        int row2 = 7;
        int col2 = 25;
        TravelControl instance = new TravelControl();
        int expResult = -1;
        int result = instance.calculateDistance(row1, col1, row2, col2);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCalculateDistanceBoundary() {
        System.out.println("calculateDistance");
        int row1 = 4;
        int col1 = 3;
        int row2 = 4;
        int col2 = 3;
        TravelControl instance = new TravelControl();
        int expResult = 0;
        int result = instance.calculateDistance(row1, col1, row2, col2);
        assertEquals(expResult, result);
    }
    
    /*
    
    @Test
    public void testCalculateFuelRequired() {
        System.out.println("calculateFuelRequired");
        int distance = 0;
        Car car = null;
        TravelControl instance = new TravelControl();
        double expResult = 0.0;
        double result = instance.calculateFuelRequired(distance, car);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    @Test
    public void testCanTravel() {
        System.out.println("canTravel");
        Location location1 = null;
        Location location2 = null;
        double timeOfDay = 0.0;
        TravelControl instance = new TravelControl();
        boolean expResult = false;
        boolean result = instance.canTravel(location1, location2, timeOfDay);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testTravelTime() {
        System.out.println("travelTime");
        double timeOfDay = 0.0;
        int distance = 0;
        TravelControl instance = new TravelControl();
        double expResult = 0.0;
        double result = instance.travelTime(timeOfDay, distance);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testIsOpen() {
        System.out.println("isOpen");
        double timeOfDay = 0.0;
        Location location = null;
        TravelControl instance = new TravelControl();
        boolean expResult = false;
        boolean result = instance.isOpen(timeOfDay, location);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    */
    
}
