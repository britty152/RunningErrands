/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runningerrands.model;

/**
 *
 * @author kburkart
 */
public class Item {
    
    private String type;
    private int quantityInStock;
    private int requiredAmount;
    
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
    
}
