/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SolucionExamenFinal;

/**
 *
 * @author ariel
 */
public class Productos {
    protected String nombre;
    protected String tipo;

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }
    
    public void print()
    {
        System.out.println("nombre:"+ getNombre());
        System.out.println("tipo:"+ getTipo());
    }
}
