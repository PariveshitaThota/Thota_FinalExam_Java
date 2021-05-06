/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question9;

/**
 *
 * @author Pariveshita Thota
 */
public class ThrowExample {
    static void fun()
    {
        try
        {
            throw new NullPointerException("demo");
        }
        catch(NullPointerException e)
        {
            System.out.println("answer to question 9 throw example: Pariveshita Thota");
            System.out.println("Caught inside fun().");
            throw e; // rethrowing the exception
        }
    }
}
