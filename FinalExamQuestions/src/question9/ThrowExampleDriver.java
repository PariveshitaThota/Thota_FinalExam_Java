/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question9;

import static question9.ThrowExample.fun;

/**
 *
 * @author Pariveshita Thota
 */
public class ThrowExampleDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          try
        {
            fun();
        }
        catch(NullPointerException e)
        {
            System.out.println("Caught in main.");
            
        }
    }
}
    
    

