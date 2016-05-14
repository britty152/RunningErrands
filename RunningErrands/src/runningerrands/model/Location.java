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
public class Location {
    
    private int row;
    private int column;
    private boolean visited;
    
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
   
   
    
}
