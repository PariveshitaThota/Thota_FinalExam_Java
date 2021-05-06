/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question7;
import java.util.Scanner;
/**
 *
 * @author Pariveshita Thota
 */
public class OutOfBound {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                System.out.println("Pariveshita Thota - Question 7");
        
        Scanner scan = new Scanner(System.in);

		
		int[] array_pari = getArray();

		
		System.out.print("Enter the index of the array: ");
		try {
		
			System.out.println("The corresponding element value is " + 
				array_pari[scan.nextInt()]);
		}
		catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Out of Bounds.");
		}
	}

	/** Returns an array with 100 randomly chosen integers */
	public static int[] getArray() {
		int[] array_pari = new int[100];
		for (int i = 0; i < array_pari.length; i++) {
			array_pari[i] = (int)(Math.random() * 100) + 1;
		}
		return array_pari;
	}
}
    

