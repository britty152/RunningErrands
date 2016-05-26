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
public class Car implements Serializable {
        private String carName;
        private double fuelEfficency;
        private double fuelCapacity;
        private double fuelAmount;
        private int passengerCapacity;

    public Car(String carName, double fuelEfficency, double fuelCapacity, double fuelAmount, int passengerCapacity) {
        this.carName = carName;
        this.fuelEfficency = fuelEfficency;
        this.fuelCapacity = fuelCapacity;
        this.fuelAmount = fuelAmount;
        this.passengerCapacity = passengerCapacity;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public double getFuelEfficency() {
        return fuelEfficency;
    }

    public void setFuelEfficency(double fuelEfficency) {
        this.fuelEfficency = fuelEfficency;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public double getFuelAmount() {
        return fuelAmount;
    }

    public void setFuelAmount(double fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }


    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.carName);
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.fuelEfficency) ^ (Double.doubleToLongBits(this.fuelEfficency) >>> 32));
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.fuelCapacity) ^ (Double.doubleToLongBits(this.fuelCapacity) >>> 32));
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.fuelAmount) ^ (Double.doubleToLongBits(this.fuelAmount) >>> 32));
        hash = 37 * hash + this.passengerCapacity;
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
        final Car other = (Car) obj;
        if (Double.doubleToLongBits(this.fuelEfficency) != Double.doubleToLongBits(other.fuelEfficency)) {
            return false;
        }
        if (Double.doubleToLongBits(this.fuelCapacity) != Double.doubleToLongBits(other.fuelCapacity)) {
            return false;
        }
        if (Double.doubleToLongBits(this.fuelAmount) != Double.doubleToLongBits(other.fuelAmount)) {
            return false;
        }
        if (this.passengerCapacity != other.passengerCapacity) {
            return false;
        }
        if (!Objects.equals(this.carName, other.carName)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Car{" + "carName=" + carName + ", fuelEfficency=" + fuelEfficency + ", fuelCapacity=" + fuelCapacity + ", fuelAmount=" + fuelAmount + ", passengerCapacity=" + passengerCapacity + '}';
    }

            
}
