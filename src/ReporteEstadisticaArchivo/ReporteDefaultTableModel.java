/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReporteEstadisticaArchivo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ariel
 */
public class ReporteDefaultTableModel extends DefaultTableModel {
    private String fileName;
    
    public ReporteDefaultTableModel(String fileName) {
        this.fileName = fileName;
        readFile();
    }
    public void readFile()
    {
        try(BufferedReader br = new BufferedReader(new FileReader(fileName)))
        {
            
        }
        catch (IOException ex) { 
        
        }
    }
}
