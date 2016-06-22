/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author Kevin
 */
public class LeapYears {
    
    public static void main(String[] args) {
  
        
  Scanner input = new Scanner(System.in);
  System.out.print("Enter a starting year: ");
  int startingYear = input.nextInt();
  System.out.print("Enter an ending year: ");
  int endingYear = input.nextInt();
  int leapYears = 0;
 
  for (int year = startingYear; year <= endingYear; year++) {
   boolean isLeapYear = (year % 4 == 0 && year % 100 != 0)
     || (year % 400 == 0);
 
   if (isLeapYear) {
    leapYears++;
    System.out.print(year + " ");
    if (leapYears % 10 == 0) {
     System.out.println();
    }
   }
  }
 
  System.out.println("\nThere were " +  leapYears + " leap years from " + startingYear + " until "
    + endingYear);
 
 }
}


