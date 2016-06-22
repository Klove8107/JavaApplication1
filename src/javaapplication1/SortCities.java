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
public class SortCities {
     public static void main(String[] args) {
         
         String temp = "";
         Scanner input = new Scanner(System.in);
         System.out.print("Enter the first city: ");
         String cityOne = input.next();
         System.out.print("Enter the second city: ");
         String cityTwo = input.next();
         System.out.print("Enter the Third city: ");
         String cityThree = input.next();
         
         if (cityOne.compareTo(cityTwo) > 0) {
            temp = cityTwo;
            cityTwo = cityOne;
            cityOne = temp;

           }
          if (cityTwo.compareTo(cityThree) > 0) {
            temp = cityThree;
            cityThree = cityTwo;
            cityTwo = temp;

           }
          if (cityOne.compareTo(cityTwo) > 0) {
            temp = cityTwo;
            cityTwo = cityOne;
            cityOne = temp;
          }
             System.out.println("The three cities in alphabetical order are: " + cityOne + " " + cityTwo + " " + cityThree);
     }
}
