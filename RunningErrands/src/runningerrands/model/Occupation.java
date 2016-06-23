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
 * @author kburkart
 */
public enum Occupation implements Serializable {

    Janitor("Works at the high school. Makes $7.75 and hour."),
    MailClerk("Works at the post office. Makes $10.75 an hour."),
    PizzaDeliverer("Works at the Pizza Parlor. Makes $7.50 an hour."),
    AutoMechanic("Works at the mechanic shop. Makes $12.50 an hour."),
    Secretary("Works at the office building. Makes $11.00 an hour."),
    Nurse("Works at the hospital. Makes $20.25 an hour."),
    HairDresser("Works at the hair salon. Makes $13.50 an hour."),
    Teacher("Works at the elementary school. Makes $17.75 an hour.");
    
    private final String description; 
   
    Occupation(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
    
}
