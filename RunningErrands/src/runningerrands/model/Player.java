/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runningerrands.model;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author brittanyhuntington
 */
public class Player implements Serializable {
    
    private String name;
    private double accountBalance;
    private Occupation job;
    private Location currentLocation;
    private Car car;
    
    public Player () {
        accountBalance = 50.00; //all players start out with $50
    }

    public Player(String name, double accountBalance, Occupation job, Location currentLocation, Car car) {
        this.name = name;
        this.accountBalance = accountBalance;
        this.job = job;
        this.currentLocation = currentLocation;
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public Occupation getJob() {
        return job;
    }

    public void setJob(Occupation job) {
        this.job = job;
    }

    public Location getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(Location currentLocation) {
        this.currentLocation = currentLocation;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.name);
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.accountBalance) ^ (Double.doubleToLongBits(this.accountBalance) >>> 32));
        hash = 53 * hash + Objects.hashCode(this.job);
        hash = 53 * hash + Objects.hashCode(this.currentLocation);
        hash = 53 * hash + Objects.hashCode(this.car);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Player other = (Player) obj;
        if (Double.doubleToLongBits(this.accountBalance) != Double.doubleToLongBits(other.accountBalance)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.job, other.job)) {
            return false;
        }
        if (!Objects.equals(this.currentLocation, other.currentLocation)) {
            return false;
        }
        if (!Objects.equals(this.car, other.car)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", accountBalance=" + accountBalance + ", job=" + job + ", currentLocation=" + currentLocation + ", car=" + car + '}';
    }
        
    
}
