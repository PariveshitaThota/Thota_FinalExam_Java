/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question10;

/**
 *
 * @author Pariveshita Thota
 */
public class RecursiveExample {
     static int arr[] = {12, 34, 54, 2, 3};
      
     /* Recursive Method to search x in arr[l..r] */
     static int recSearch(int arr[], int l, int r, int x)
     {
          if (r < l)
             return -1;
          if (arr[l] == x)
             return l;
          if (arr[r] == x)
             return r;
          return recSearch(arr, l+1, r-1, x);
     }
}
