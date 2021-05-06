/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question10;

import static question10.RecursiveExample.arr;
import static question10.RecursiveExample.recSearch;

/**
 *
 * @author Pariveshita Thota
 */
public class RecursiveExampleDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 3;
         
        //Method call to find x
        System.out.println("answer to question10 for recursionexample using search element: Pariveshita Thota");
        int index = recSearch(arr, 0, arr.length-1, x);
        if (index != -1)
           System.out.println("Element " + x + " is present at index " +
                                                    index);
        else
            System.out.println("Element " + x + " is not present");
        }
 }
    
    

