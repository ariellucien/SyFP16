/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E7;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author ariel
 */
public class ReadFile {
    public static void main(String[] args) {
        try
        {
            BufferedReader br = new BufferedReader(new FileReader("example.txt"));
            String linea;
            linea = br.readLine();  
            while (linea != null) 
            {
                System.out.println(linea);
                linea = br.readLine();                
            }
        }
        catch(Exception e)
        {
            System.out.println("file not found");
        }               
    }
}
