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
public class ThrowsExample {
     static void fun() throws IllegalAccessException
    {
        System.out.println("answer to question9 example for keyword throws: Pariveshita Thota");
        System.out.println("Inside fun(). ");
        throw new IllegalAccessException("demo");
    }
     public static void main(String args[])
    {
        try
        {
            fun();
        }
        catch(IllegalAccessException e)
        {
            System.out.println("caught in main.");
        }
    }
}
