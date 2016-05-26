/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runningerrandsgame;
import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author brittanyhuntington
 */
public class Car implements Serializable {
        private String description;
        private double fuelEfficency;
        private double maxCapacity;

    public Car() {
    }

        
        
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getFuelEfficency() {
        return fuelEfficency;
    }

    public void setFuelEfficency(double fuelEfficency) {
        this.fuelEfficency = fuelEfficency;
    }

    public double getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(double maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.description);
        hash = 11 * hash + (int) (Double.doubleToLongBits(this.fuelEfficency) ^ (Double.doubleToLongBits(this.fuelEfficency) >>> 32));
        hash = 11 * hash + (int) (Double.doubleToLongBits(this.maxCapacity) ^ (Double.doubleToLongBits(this.maxCapacity) >>> 32));
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
        if (Double.doubleToLongBits(this.maxCapacity) != Double.doubleToLongBits(other.maxCapacity)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Car{" + "description=" + description + ", fuelEfficency=" + fuelEfficency + ", maxCapacity=" + maxCapacity + '}';
    }
     
    
    
        
}
