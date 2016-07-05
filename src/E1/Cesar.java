/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E1;

/**
 *
 * @author ariel
 */
public class Cesar {
    
    public void print(Texto t)
    {
        t.getText();
    }
    public String cypher(String text, int constant)
    {
        String res = "";
        for (int i = 0; i < text.length(); i++) {          
            if((int)text.charAt(i)==10)
                res = res + (char)(text.charAt(i));
            else
                res = res + (char)(text.charAt(i)+constant);
        }
        return res;
    }
}
