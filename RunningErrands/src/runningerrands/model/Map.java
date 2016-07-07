/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runningerrands.model;

import java.io.Serializable;
import runningerrands.view.ErrorView;

/**
 *
 * @author kburkart
 */
public class Map implements Serializable {
    
    private int rowCount;
    private int columnCount;
    Location [][] locations;

    public Map(int numRows, int numColumns) {
        if(numRows < 1 || numColumns < 1) {
            ErrorView.display(this.getClass().getName(),
                    "Invalid selection.");
            return;
     
        this.rowCount = numRows;
        this.columnCount = numColumns;
        this.locations = new Location[numRows][numColumns];
        
        for (int row = 0; row < numRows; row ++) {
            for (int column = 0; column < numColumns; column++) {
                Location location = new Location();
                location.setColumn(column);
                location.setRow(row);
                location.setVisited(false);
                locations[row][column] = location;
            }
        }
           
    }
    
    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }
    
    public int getColumnCount() {
        return columnCount;
    }
    
    public void setColumnCount(int columnCount) {
        this.columnCount = columnCount;
    }
    
    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.rowCount;
        hash = 17 * hash + this.columnCount;
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
        final Map other = (Map) obj;
        if (this.rowCount != other.rowCount) {
            return false;
        }
        if (this.columnCount != other.columnCount) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "rowCount=" + rowCount + ", columnCount=" + columnCount + '}';
    }
    
    
}
