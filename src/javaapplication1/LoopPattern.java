/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author klove8107
 */
public class LoopPattern {

    public static void main(String[] args){


        System.out.print("Enter an integer to be the limit of the pattern: ");

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println("Pattern A: ");
        for (int i = 1; i <= number; i++) {

            for(int j = 1; j <= i; j++){
            System.out.print(j);
       }
            System.out.println();
    }
        System.out.println("\nPattern B: ");

        for (int i = number; i > 0; i--) {

            for(int j = 1; j <= i; j++){
            System.out.print(j);
       }
            System.out.println();
    }
        System.out.println("\nPattern C: ");
        for (int i = 1; i <= number; i++) {
            
          for (int j = number - i; j >= 1; j--)
              
            System.out.print("");
          
            for (int j = i; j >= 1; j--)
                
                System.out.print(j);
                System.out.println();
        }

          
            
        
        System.out.println("\nPattern D: ");

        for (int i = number; i > 0; i--) {

            for(int j = 1; j <= i; j++){
            System.out.print(j);
       }
            System.out.println();
        }
    }

}