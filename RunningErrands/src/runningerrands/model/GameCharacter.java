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
public class GameCharacter implements Serializable {
    private String gameCharacterName;
    private String gender;
    private String job;
    private double coordinates; 

    public GameCharacter() {
    }

    
    
    public String getGameCharacterName() {
        return gameCharacterName;
    }

    public void setGameCharacterName(String gameCharacterName) {
        this.gameCharacterName = gameCharacterName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public double getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(double coordinates) {
        this.coordinates = coordinates;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.gameCharacterName);
        hash = 53 * hash + Objects.hashCode(this.gender);
        hash = 53 * hash + Objects.hashCode(this.job);
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.coordinates) ^ (Double.doubleToLongBits(this.coordinates) >>> 32));
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
        final GameCharacter other = (GameCharacter) obj;
        if (Double.doubleToLongBits(this.coordinates) != Double.doubleToLongBits(other.coordinates)) {
            return false;
        }
        if (!Objects.equals(this.gameCharacterName, other.gameCharacterName)) {
            return false;
        }
        if (!Objects.equals(this.gender, other.gender)) {
            return false;
        }
        if (!Objects.equals(this.job, other.job)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gameCharacter{" + "gameCharacterName=" + gameCharacterName + ", gender=" + gender + ", job=" + job + ", coordinates=" + coordinates + '}';
    }
    
    
}
