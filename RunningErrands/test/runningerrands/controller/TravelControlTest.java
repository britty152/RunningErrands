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
    
    
    /**
     * Test of calculateDistance method, of class TravelControl.
     */
    @Test
    public void testCalculateFuelRequiredValid1() {
      
      
        double distance = 5.0;
        double fuelEfficency = 20.0;
        TravelControl instance = new TravelControl();
        double expResult = 0.25;
        double result;
        result = instance.calculateFuelRequired(distance, fuelEfficency);
        assertEquals (expResult, result, 0.25);
       System.out.println("calculateFuelRequired is " + result);
    }
    @Test
    public void testCalculateFuelRequiredValid2() {
      
      
        double distance = 30.0;
        double fuelEfficency = 25.0;
        TravelControl instance = new TravelControl();
        double expResult = 1.2;
        double result;
        result = instance.calculateFuelRequired(distance, fuelEfficency);
        assertEquals (expResult, result, 1.2);
       System.out.println("calculateFuelRequired is " + result);
    }@Test
    public void testCalculateFuelRequiredInvalid1() {
      
      
        double distance = 0.0;
        double fuelEfficency = 15.0;
        TravelControl instance = new TravelControl();
        double expResult = 0.0;
        double result;
        result = instance.calculateFuelRequired(distance, fuelEfficency);
        assertEquals (expResult, result, 0.0);
       System.out.println("calculateFuelRequired is " + result);
    }@Test
    public void testCalculateFuelRequiredInvalid2() {
      
      
        double distance = 0.0;
        double fuelEfficency = 30.0;
        TravelControl instance = new TravelControl();
        double expResult = 0.0;
        double result;
        result = instance.calculateFuelRequired(distance, fuelEfficency);
        assertEquals (expResult, result, 0.0);
       System.out.println("calculateFuelRequired is " + result);
    }@Test
    public void testCalculateFuelRequiredBoundary() {
      
      
        double distance = 5.0;
        double fuelEfficency = 10.0;
        TravelControl instance = new TravelControl();
        double expResult = 0.5;
        double result;
        result = instance.calculateFuelRequired(distance, fuelEfficency);
        assertEquals (expResult, result, 0.5);
       System.out.println("calculateFuelRequired is " + result);
    }
    /*
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
*/
    @Test
      public void testIsOpen() {
      
      
        double timeOfDay = 8.0;
        double location;
        location = 8.0;
        TravelControl instance = new TravelControl();
        boolean expResult = false;
        boolean result;       
        result = instance.isOpen(location, timeOfDay);
        assertEquals (expResult, result, false);
       System.out.println(result + "isOpen is ");
    }

    /**
     * Test of calculateDistance method, of class TravelControl.
     */
    @Test
    public void testCalculateDistance() {
        System.out.println("calculateDistance");
        int row1 = 0;
        int col1 = 0;
        int row2 = 0;
        int col2 = 0;
        TravelControl instance = new TravelControl();
        int expResult = 0;
        int result = instance.calculateDistance(row1, col1, row2, col2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateFuelRequired method, of class TravelControl.
     */
    @Test
    public void testCalculateFuelRequired() {
        System.out.println("calculateFuelRequired");
        double distance = 0.0;
        double fuelEfficency = 0.0;
        TravelControl instance = new TravelControl();
        double expResult = 0.0;
        double result = instance.calculateFuelRequired(distance, fuelEfficency);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isOpen method, of class TravelControl.
     */
    @Test
    public void testIsOpen() {
        System.out.println("isOpen");
        double timeOfDay = 17.04; 
        double location;
        location = 32.0;
        TravelControl instance = new TravelControl();
        boolean expResult = true;
        boolean result = instance.isOpen(timeOfDay, location);
        assertEquals(expResult, result, true);
        
    }

    /**
     * Test of canTravel method, of class TravelControl.
     */
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

    /**
     * Test of travelTime method, of class TravelControl.
     */
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

    private void assertEquals(boolean expResult, double result, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void assertEquals(boolean expResult, boolean result, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Test of calculateDistance method, of class TravelControl.
     */
   /* @Test
    public void testCalculateDistance() {
        System.out.println("calculateDistance");
        int row1 = 0;
        int col1 = 0;
        int row2 = 0;
        int col2 = 0;
        TravelControl instance = new TravelControl();
        int expResult = 0;
        int result = instance.calculateDistance(row1, col1, row2, col2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateFuelRequired method, of class TravelControl.
     
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

    /**
     * Test of canTravel method, of class TravelControl.
     
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

    /**
     * Test of travelTime method, of class TravelControl.
     
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

    /**
     * Test of isOpen method, of class TravelControl.
     
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