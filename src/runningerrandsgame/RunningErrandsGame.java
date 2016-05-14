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
       
       Car carOne = new Car();
       
       carOne.setDescription("Green");
       carOne.setFuelEfficency(32);
       carOne.setMaxCapacity(3);
       
       String carInfo = carOne.toString();
       System.out.println(carInfo);
       
    }
       gameCharacter characterOne = new gameCharacter();
       characterOne.setGameCharacterName("Linda Martin");
       characterOne.setGender("Female");
       characterOne.setJob("Nurse");
       characterOne.setCoordinates(34);
       
}
