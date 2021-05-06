/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question10;

import java.util.Scanner;

/**
 *
 * @author Pariveshita Thota
 */
public class InfiniteRecursionExample {

    /**
     * @param args the command line arguments
     */
  
  
public static double harmonical(int n) {
    //if(n==0)
       // throw new ArithmeticException("hey n should not be zero");
       System.out.println("The valueof n is "+n);
        return harmonical(n-1) + 1.0/n;
    } 

    public static void main(String[] args) {
        System.out.println("answer to question10 example for infiniterecursion: Pariveshita Thota");
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int a=scan.nextInt();
        System.out.println(harmonical(a));
    }}
