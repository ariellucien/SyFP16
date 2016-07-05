/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ariel
 */
public class Diccionario {
    private List<String> original = new ArrayList();
    private List<String> translated = new ArrayList();
         
    public String translate(String word)
    {
        int index = original.indexOf(word);
        if(index != -1)         
            return translated.get(index);        
        else
            return word;
    }
    
    public void add(String word, String translation)
    {
        original.add(word);
        translated.add(translation);
    }
}
