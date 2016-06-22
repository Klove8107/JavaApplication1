
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
public class AvgWithLoop {
    
    public static void main(String[] args){
      int num;
      int sum = 0;
      double average = 0;
      int positive = 0;
      int negative = 0;
      int count = 0;

        System.out.print("Enter an integer, the input ends if it is 0: ");
        
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        
        while (num != 0){
            sum += num;
            count++;
            if (num < 0){
                negative++;
            }
            else{
                positive++;
            }
            num = input.nextInt();
        }
        average = ((float)sum) / count;
        System.out.println("The number of positives is " + positive);
        System.out.println("The number of negatives is " + negative);
        System.out.println("The total is " + sum);
        System.out.println("The average is " + average);
    }
}
