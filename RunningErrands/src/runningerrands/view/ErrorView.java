/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runningerrands.view;

import java.io.PrintWriter;
import runningerrands.RunningErrands;

/**
 *
 * @author brittanyhuntington
 */
public class ErrorView {

    private static final PrintWriter errorFile = RunningErrands.getOutFile();

    public static void display(String className, String errorMessage) {

        errorFile.println(
                "--------------------------------------------------"
                + "\n--ERROR-- " + errorMessage
                + "\n--------------------------------------------------");

        errorFile.println(className + " - " + errorMessage);
    }
}
