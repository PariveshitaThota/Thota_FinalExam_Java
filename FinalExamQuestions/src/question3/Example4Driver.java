/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;

/**
 *
 * @author Pariveshita Thota
 */
public class Example4Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Example4Vehicle vehicle= new Example4Vehicle("honda","4wheeler",8000);
    System.out.println("Answer to question 3 Example 4: Pariveshita Thota");
    Car c=new Car("Black","2019","honda","4wheeler",8000);
    vehicle=c;
    c=(Car)vehicle;
    System.out.println(c);
    
     }
    
}
