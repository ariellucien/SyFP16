/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E7;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ariel
 */
public class WriteFile {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("example.txt", true));
            bw.write("Alfred");
            bw.write("\n");
            bw.write("Garza");
            bw.close();
        } 
        catch (IOException ex) {
            
        }
            
    }
}
