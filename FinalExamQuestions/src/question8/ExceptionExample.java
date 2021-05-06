/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question8;

/**
 *
 * @author Pariveshita Thota
 */
public class ExceptionExample {

    /**
     * @param args the command line arguments
     */
     public static void main(String args[]) throws ArithmeticException, ArrayIndexOutOfBoundsException,Exception 
    {
      try{
         int arr[]=new int[5];
         arr[4]=10/0;
         
      }
      
      catch(ArithmeticException e){
          System.out.println("Answer to question8 Example:Pariveshita Thota");
         System.out.println("You should not divide a number by zero");
      }
      catch(ArrayIndexOutOfBoundsException e){
          System.out.println("Answer to question8 Example:Pariveshita Thota");
         System.out.println("Accessing array elements outside of the limit");
      }
      catch(Exception e){
          System.out.println("Answer to question8 Example1:Pariveshita Thota");
         System.out.println("Some Other Exception");
      }
      System.out.println("Out of the try-catch block");
   }
}
   
