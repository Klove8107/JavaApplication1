/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Arrays;

/**
 *
 * @author Kevin
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */

   
    public static void main(String[] args) {
       int counter = 0;
      
        int[] intArray = new int[5];
    intArray[0] = 27;
    intArray[1] = 36;
    intArray[2] = 52;
    intArray[3] = 19;
    intArray[4] = 89;

    for (int i = 0; i < intArray.length; i++)
    { 
        while (intArray.length > 30)
        {
           counter = counter + 1;
        }
         System.out.println("These are the numbers higher than 30: " + Arrays.toString(intArray));
         System.out.println("There are: " + counter + " numbers above 30");
    }
           
            
}
}
