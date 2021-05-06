/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question11;

/**
 *
 * @author Pariveshita Thota
 */
public class EqualsMethodExample2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s1 = "javatpoint";    
        String s2 = "javatpoint";    
        String s3 = "Javatpoint";  
        System.out.println("Answer to question 11 equals method example2: Pariveshita Thota");
        System.out.println(s1.equals(s2)); // True because content is same    
        if (s1.equals(s3)) {  
            System.out.println("both strings are equal");  
        }else System.out.println("both strings are unequal");     
    }  
}  
    
