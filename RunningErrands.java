/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runningerrands;

/**
 *
 * @author brittanyhuntington
 */
public class Player implements Serializable {
     private String name;
     private double bestScore;
     
     public String getName(){
         return name;
     }
     public void setName(String name) {
         this.name = name;
     }
     public double getBestScore(){
         return bestScore;
     }
     public void setBestScore(double bestScore) {
         this.bestScore = bestScore; 
         
}

    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
