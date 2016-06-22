/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author Kevin Love
 */
public class BestStudent {
    
     public static void main(String[] args){
         int count = 1;
         double highest = 0;
         String highestName = "";
         
         System.out.print("Enter the number of students: ");
         Scanner input = new Scanner(System.in);
         int numberOfStudents = input.nextInt();
                      
         for(int i = 0; i < numberOfStudents; i++){
             System.out.println("Enter student's name: ");
             String name = input.next();
             System.out.println("Enter student'score: ");
             double studentScore = input.nextDouble();
             if (studentScore > highest){
                 highest = studentScore;
                 highestName = name;
             }
         }
         System.out.println("The highest score was " + highest + " " + highestName);
     }
    
}
