/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question11;
import java.util.Scanner; 
/**
 *
 * @author Pariveshita Thota
 */
public class HashcodeMethodExample2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                  
        // input number from console  
        System.out.println("answer for question11 example2 for hashcode method: Pariveshita Thota");
        System.out.print("Enter The Desired Integer Value: ");  
        Scanner readInput = new Scanner(System.in);  
        int i = readInput.nextInt();  
        readInput.close();  
        Integer myValue = new Integer(i);  
        System.out.println("Integer Value is: " + myValue.intValue());  
        }  
}  
    
    

