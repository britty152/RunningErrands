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
public class Game implements Serializable {
    
    private int totalTime; //game time is in minutes
    private GameCharacter gameCharacter;

    public Game(int totalTime, GameCharacter gameCharacter) {
        this.totalTime = totalTime;
        this.gameCharacter = gameCharacter;
    }
    
    public int getTotalTime() {
        return totalTime;
    }
    
    public void setTotalTime(int totalTime) {
        this.totalTime = totalTime;
    }
    
    //Need function that creates character? aka Calls gameCharacter constructor
    
    public GameCharacter getGameCharacter() {
        return gameCharacter;
    }
    
    public void setGameCharacter (GameCharacter gameCharacter) {
        this.gameCharacter = gameCharacter;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + this.totalTime;
        hash = 83 * hash + Objects.hashCode(this.gameCharacter);
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
        final Game other = (Game) obj;
        if (this.totalTime != other.totalTime) {
            return false;
        }
        if (!Objects.equals(this.gameCharacter, other.gameCharacter)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "totalTime=" + totalTime + ", gameCharacter=" + gameCharacter + '}';
    }
    
    
    
}
