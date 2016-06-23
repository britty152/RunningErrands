/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runningerrands.controller;

import java.util.Set;
import runningerrands.model.Player;

/**
 *
 * @author kburkart
 */
public class MoneyControl {
    //TODO change to have enum store wage
    private static final double JANITOR_WAGE = 7.75;
    private static final double MAIL_CLERK_WAGE = 10.75;
    private static final double PIZZA_DELIVERER_WAGE = 7.5;
    private static final double AUTO_MECHANIC_WAGE = 12.5;
    private static final double SECRETARY_WAGE = 11;
    private static final double NURSE_WAGE = 20.25;
    private static final double HAIR_DRESSER_WAGE = 13.5;
    private static final double TEACHER_WAGE = 17.75;
    
    
    public void addToAccountBalance(Player player, double amount) {
        player.setAccountBalance(player.getAccountBalance() + amount);
        
    }
    
    public void subtractFromAccountBalance (Player player, double amount){
        player.setAccountBalance(player.getAccountBalance() - amount);
    }
    
    public double calculatePaycheck (Player player, double hoursWorked){
        double paycheckAmount = 0;
        
        if (hoursWorked < 0 | hoursWorked > 40) {
            paycheckAmount = 0;
        }
        else {
             if (player.getJob().equals("janitor")) {
                paycheckAmount = hoursWorked * JANITOR_WAGE;
            }
            else if (player.getJob().equals("mail clerk")) {
                paycheckAmount = hoursWorked * MAIL_CLERK_WAGE;
            }
            else if (player.getJob().equals("pizza deliverer")) {
                paycheckAmount = hoursWorked * PIZZA_DELIVERER_WAGE;
            }
            else if (player.getJob().equals("auto mechanic")) {
                paycheckAmount = hoursWorked * AUTO_MECHANIC_WAGE;
            }
            else if (player.getJob().equals("secretary")) {
                paycheckAmount = hoursWorked * SECRETARY_WAGE;
            }
            else if (player.getJob().equals("nurse")) {
                paycheckAmount = hoursWorked * NURSE_WAGE;
            }
            else if (player.getJob().equals("hair dresser")) {
                paycheckAmount = hoursWorked * HAIR_DRESSER_WAGE;
            }
            else if (player.getJob().equals("teacher")) {
                paycheckAmount = hoursWorked * TEACHER_WAGE;
            }
        }    
        return paycheckAmount;
    }
    
}
