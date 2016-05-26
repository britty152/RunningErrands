/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runningerrands.model;

import java.io.Serializable;

/**
 *
 * @author kburkart
 */
public class Location implements Serializable {
    
    private int row;
    private int column;
    private boolean visited;

    public Location(int row, int column) {
        this.row = row;
        this.column = column;
        visited = false;
    }
   
   public int getRow() {
       return row;
   }
   
   public void setRow(int row) {
       this.row = row;
   }
   
   public int getColumn() {
       return column;
   }
   
   public void setColumn(int column) {
       this.column = column;
   }
   
   public boolean wasVisited() {
       return visited;
   }
   
   public void setVisited(boolean visited) {
       this.visited = visited;
   }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.row;
        hash = 59 * hash + this.column;
        hash = 59 * hash + (this.visited ? 1 : 0);
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
        final Location other = (Location) obj;
        if (this.row != other.row) {
            return false;
        }
        if (this.column != other.column) {
            return false;
        }
        if (this.visited != other.visited) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "row=" + row + ", column=" + column + ", visited=" + visited + '}';
    }
   
   
    
}
