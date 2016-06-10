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
import runningerrands.model.Player;

/**
 *
 * @author kburkart
 */
public class MoneyControlTest {
    
    public MoneyControlTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addToAccountBalance method, of class MoneyControl.
     */
    @Test
    public void testAddToAccountBalance() {
        System.out.println("addToAccountBalance");
        Location location = new Location (4, 3, 8.5, 17.5);
        Car car = new Car ("Toyota Camry", 35, 16, 3, 3);
        Player player =  new Player("Katelynn", 100, "nurse", location, car);
        double amount = 50.0;
        MoneyControl instance = new MoneyControl();
        instance.addToAccountBalance(player, amount);
        double expResult = 150.0;
        double result = player.getAccountBalance();
        assertEquals(result, expResult, 0);
    }

    /**
     * Test of subtractFromAccountBalance method, of class MoneyControl.
     */
    @Test
    public void testSubtractFromAccountBalance() {
        System.out.println("addToAccountBalance");
        Location location = new Location (4, 3, 8.5, 17.5);
        Car car = new Car ("Toyota Camry", 35, 16, 3, 3);
        Player player =  new Player("Katelynn", 100, "nurse", location, car);
        double amount = 50.0;
        MoneyControl instance = new MoneyControl();
        instance.subtractFromAccountBalance(player, amount);
        double expResult = 50.0;
        double result = player.getAccountBalance();
        assertEquals(result, expResult, 0);
    }

    /**
     * Test of calculatePaycheck method, of class MoneyControl.
     */
    @Test
    public void testCalculatePaycheckJanitor() {
        System.out.println("calculatePaycheck");
        Location location = new Location (4, 3, 8.5, 17.5);
        Car car = new Car ("Toyota Camry", 35, 16, 3, 3);
        Player player =  new Player("Katelynn", 100, "janitor", location, car);
        double hoursWorked = 20.0;
        MoneyControl instance = new MoneyControl();
        double expResult = 155;
        double result = instance.calculatePaycheck(player, hoursWorked);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testCalculatePaycheckMailClerk() {
        System.out.println("calculatePaycheck");
        Location location = new Location (4, 3, 8.5, 17.5);
        Car car = new Car ("Toyota Camry", 35, 16, 3, 3);
        Player player =  new Player("Katelynn", 100, "mail clerk", location, car);
        double hoursWorked = 20.0;
        MoneyControl instance = new MoneyControl();
        double expResult = 215;
        double result = instance.calculatePaycheck(player, hoursWorked);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testCalculatePaycheckPizzaDeliverer() {
        System.out.println("calculatePaycheck");
        Location location = new Location (4, 3, 8.5, 17.5);
        Car car = new Car ("Toyota Camry", 35, 16, 3, 3);
        Player player =  new Player("Katelynn", 100, "pizza deliverer", location, car);
        double hoursWorked = 20.0;
        MoneyControl instance = new MoneyControl();
        double expResult = 150;
        double result = instance.calculatePaycheck(player, hoursWorked);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testCalculatePaycheckAutoMechanic() {
        System.out.println("calculatePaycheck");
        Location location = new Location (4, 3, 8.5, 17.5);
        Car car = new Car ("Toyota Camry", 35, 16, 3, 3);
        Player player =  new Player("Katelynn", 100, "auto mechanic", location, car);
        double hoursWorked = 20.0;
        MoneyControl instance = new MoneyControl();
        double expResult = 250;
        double result = instance.calculatePaycheck(player, hoursWorked);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testCalculatePaycheckSecretary() {
        System.out.println("calculatePaycheck");
        Location location = new Location (4, 3, 8.5, 17.5);
        Car car = new Car ("Toyota Camry", 35, 16, 3, 3);
        Player player =  new Player("Katelynn", 100, "secretary", location, car);
        double hoursWorked = 20.0;
        MoneyControl instance = new MoneyControl();
        double expResult = 220;
        double result = instance.calculatePaycheck(player, hoursWorked);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testCalculatePaycheckNurse() {
        System.out.println("calculatePaycheck");
        Location location = new Location (4, 3, 8.5, 17.5);
        Car car = new Car ("Toyota Camry", 35, 16, 3, 3);
        Player player =  new Player("Katelynn", 100, "nurse", location, car);
        double hoursWorked = 20.0;
        MoneyControl instance = new MoneyControl();
        double expResult = 405;
        double result = instance.calculatePaycheck(player, hoursWorked);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testCalculatePaycheckHairDresser() {
        System.out.println("calculatePaycheck");
        Location location = new Location (4, 3, 8.5, 17.5);
        Car car = new Car ("Toyota Camry", 35, 16, 3, 3);
        Player player =  new Player("Katelynn", 100, "hair dresser", location, car);
        double hoursWorked = 20.0;
        MoneyControl instance = new MoneyControl();
        double expResult = 270;
        double result = instance.calculatePaycheck(player, hoursWorked);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testCalculatePaycheckTeacher() {
        System.out.println("calculatePaycheck");
        Location location = new Location (4, 3, 8.5, 17.5);
        Car car = new Car ("Toyota Camry", 35, 16, 3, 3);
        Player player =  new Player("Katelynn", 100, "teacher", location, car);
        double hoursWorked = 20.0;
        MoneyControl instance = new MoneyControl();
        double expResult = 355;
        double result = instance.calculatePaycheck(player, hoursWorked);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testCalculatePaycheckOvertime() {
        System.out.println("calculatePaycheck");
        Location location = new Location (4, 3, 8.5, 17.5);
        Car car = new Car ("Toyota Camry", 35, 16, 3, 3);
        Player player =  new Player("Katelynn", 100, "secretary", location, car);
        double hoursWorked = 55.0;
        MoneyControl instance = new MoneyControl();
        double expResult = 0.0;
        double result = instance.calculatePaycheck(player, hoursWorked);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testCalculatePaycheckNegativeHoursWorked() {
        System.out.println("calculatePaycheck");
        Location location = new Location (4, 3, 8.5, 17.5);
        Car car = new Car ("Toyota Camry", 35, 16, 3, 3);
        Player player =  new Player("Katelynn", 100, "secretary", location, car);
        double hoursWorked = -3.0;
        MoneyControl instance = new MoneyControl();
        double expResult = 0.0;
        double result = instance.calculatePaycheck(player, hoursWorked);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testCalculatePaycheckInvalidJob() {
        System.out.println("calculatePaycheck");
        Location location = new Location (4, 3, 8.5, 17.5);
        Car car = new Car ("Toyota Camry", 35, 16, 3, 3);
        Player player =  new Player("Katelynn", 100, "dog walker", location, car);
        double hoursWorked = 20.0;
        MoneyControl instance = new MoneyControl();
        double expResult = 0.0;
        double result = instance.calculatePaycheck(player, hoursWorked);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testCalculatePaycheckLowerBoundary() {
        System.out.println("calculatePaycheck");
        Location location = new Location (4, 3, 8.5, 17.5);
        Car car = new Car ("Toyota Camry", 35, 16, 3, 3);
        Player player =  new Player("Katelynn", 100, "secretary", location, car);
        double hoursWorked = 0;
        MoneyControl instance = new MoneyControl();
        double expResult = 0.0;
        double result = instance.calculatePaycheck(player, hoursWorked);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testCalculatePaycheckUpperBoundary() {
        System.out.println("calculatePaycheck");
        Location location = new Location (4, 3, 8.5, 17.5);
        Car car = new Car ("Toyota Camry", 35, 16, 3, 3);
        Player player =  new Player("Katelynn", 100, "secretary", location, car);
        double hoursWorked = 40.0;
        MoneyControl instance = new MoneyControl();
        double expResult = 440;
        double result = instance.calculatePaycheck(player, hoursWorked);
        assertEquals(expResult, result, 0.0);
    }
    
}