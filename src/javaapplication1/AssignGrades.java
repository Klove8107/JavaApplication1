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
public class AssignGrades {
    
    public static void main (String[] args) {
        int count = 0;
        System.out.println("Enter the number of students: ");
        Scanner input = new Scanner(System.in);
        int studentNum = input.nextInt();
        System.out.println("Enter " + studentNum + " scores: ");
        int scores = input.nextInt();
        for (int i = 0; i < studentNum; i++){
            count++;
            int[] score = new int[studentNum];
            
            System.out.println("Student " + count + " score is " + score + " and grade is " + grade);
        }
        
        System.out.println("");
    }
}