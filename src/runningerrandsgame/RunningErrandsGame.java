/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runningerrandsgame;
/**
 *
 * @author brittanyhuntington
 */
public class RunningErrandsGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Player playerOne = new Player();
       
       playerOne.setName("Leonardo Turtle");
       playerOne.setBestScore(900);
       
       String playerInfo = playerOne.toString();
       System.out.println(playerInfo);
       
       
    }
    
}