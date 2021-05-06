/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Pariveshita Thota
 */
public class ExceptionExample2 {
public static void main(String args[]) throws FileNotFoundException, IOException 
   { 
       try{
	FileInputStream f = null;
	
        f = new FileInputStream("input.txt"); 
   
	int n; 

	/* Method read() of FileInputStream class also throws 
	 * a checked exception: IOException
         */
	while(( n = f.read() ) != -1) 
	{ 
		System.out.print((char)n); 
	} 
       
	/*The method close() closes the file input stream
	 * It throws IOException*/
	f.close(); 	
   }
       catch(FileNotFoundException e)
       {
           System.out.println("Answer to question 8 Example2 :Pariveshita Thota");
           System.out.println("File Not found Exception");
       }
       catch(IOException i)
       {
           System.out.println("IOException");
       }
   }
}