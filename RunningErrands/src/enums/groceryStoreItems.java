/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;

/**
 *
 * @author brittanyhuntington
 */
public enum groceryStoreItems {
    
        bread("B", "One whole loaf of bread.", 1.99,  "loaf"),
        milk("M", "One gallon of milk.", 1.65, "gallon"),
        eggs("E", "One dozen eggs.",2.80, "dozen"),
        pasta("P", "One pound of uncooked pasta.", 0.99, "pound"),
        meat("T", "One pound of raw meet.", 4.10, "pound"),
        cheese("C", "One block of cheese", 3.20, "block"),
        snacks("S", "One bag of snacks.", 2.25, "bag");
       
                
        private final String groceryItem;
        private final String description;
        private final double cost;
        private final String unitOfMeasure;
        
        private groceryStoreItems(String groceryItem, String description, double cost, String unitOfMeasure) {
            this.groceryItem = groceryItem;
            this.description = description;
            this.cost = cost;
            this.unitOfMeasure = unitOfMeasure;
        }
        public String getGroceryItem() {
            return groceryItem;
        }
        public String getDescription() {
            return description;
        }
         public double getCost() {
              return cost;
        }
          public String getUnitOfMeasure() {
            return unitOfMeasure;
        }
         
}
