/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runningerrands.view;

/**
 *
 * @author brittanyhuntington
 */
public class HighScoreMenu {
    public static void main(String[] args) throws Exception {
    printRow("A","Name", "Account Balance", "Blocks Traveled");
    printRow("A", "--------------", "--------------", "--------------");
    printRow("B", "Ross", 5000, 200);
}

private static void printRow(String c0, String c1, Object c2, Object c3 ) {
    System.out.printf("%s %-20s %-20s %-20s%n", c0, c1, String.valueOf(c2), c3 instanceof Integer ? "$" + c3 : c3);
            
}
}
