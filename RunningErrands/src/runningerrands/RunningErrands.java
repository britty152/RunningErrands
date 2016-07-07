/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runningerrands;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import runningerrands.model.Game;
import runningerrands.model.Player;
import runningerrands.view.StartProgramView;




        
public class RunningErrands {
   
    private static Game currentGame = null;
    private static Player player = null;
    
    private static PrintWriter outFile = null;
     private static BuffedReader inFile = null; 
     
     private static PrintWriter logFile = null;

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        RunningErrands.logFile = logFile;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        RunningErrands.outFile = outFile;
    }

    public static BuffedReader getInfile() {
        return inFile;
    }

    public static void setInfile(BuffedReader inFile) {
        RunningErrands.inFile = inFile;
    }
   

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        RunningErrands.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        RunningErrands.player = player;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            RunningErrands.inFile =
                   new BuffedReader(New InputStreamReader(System.in));
            RunningErrands.outFile = new PrintWriter(System.out, true);
             String filePath = "log.txt";
                RunningErrands.logFile = new PrintWriter(filePath);
       StartProgramView object = new StartProgramView(); 
       object.display();
       return;
    }
        catch (Throwable e) {
            System.out.println("Exception: " + e.toString() +
                                "\nCause: " + e.getCause() +
                                 "\nMessage: " + e.getMessage());
            e.printStackTrace();;
        }
        finally {
            try {
                if (RunningErrands.inFile !=null)
                    RunningErrands.inFile.close();
                
                if (RunningErrands.outFile !=null)
                    RunningErrands.outFile.close();
                
                if (RunningErrands.logFile !=null)
                    RunningErrands.logFile.close();
            }
            catch (IOException ex) {
                System.out.println("Error closing files");
                return; 
            }
           
        } 
    }

    public static BufferedReader getInFile() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
    private static class BuffedReader {

        public BuffedReader() {
        }
    }
    
}

