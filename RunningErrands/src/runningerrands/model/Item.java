/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runningerrands.model;

import java.util.Objects;
import java.io.Serializable;

/**
 *
 * @author kburkart
 */
public class Item implements Serializable {
    
    private String type;
    private int quantityInStock;
    private int requiredAmount;

    public Item(String type, int quantityInStock, int requiredAmount) {
        this.type = type;
        this.quantityInStock = quantityInStock;
        this.requiredAmount = requiredAmount;
    }
    
    public String getType() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public int getQuantityInStock() {
        return quantityInStock;
    }
    
    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }
    
    public int getRequiredAmount() {
        return requiredAmount;
    }
    
    public void setRequiredAmount(int requiredAmount){
        this.requiredAmount = requiredAmount;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.type);
        hash = 97 * hash + this.quantityInStock;
        hash = 97 * hash + this.requiredAmount;
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
        final Item other = (Item) obj;
        if (this.quantityInStock != other.quantityInStock) {
            return false;
        }
        if (this.requiredAmount != other.requiredAmount) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Item{" + "type=" + type + ", quantityInStock=" + quantityInStock + ", requiredAmount=" + requiredAmount + '}';
    }
    
}
