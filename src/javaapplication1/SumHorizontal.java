/*
 * Kevin Love  4/10/2016 Assignment
Chapter 8
 * 
 */
package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author Kevin
 */
public class SumDiagonal {
    
    public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[4][4];
        String num;
        System.out.print("Enter a 4-by4 matrix row by row:\n ");
        for(int i = 0; i < 4; i++){
            
        
            for(int j = 0; j <4; j++)
            {
                num = sc.next();
                arr[i][j] = Integer.parseInt(num);
            }
        }
        System.out.print("Sum of the major diagonal of the matrix is " + sumMajorDiagonal(arr));
    }
    
    public static double sumMajorDiagonal(int[][] m){
        
        double total =0;
        for(int i = 0; i<4; i++){
            for(int j = 0; j<4;j ++){
                if (i==j)
                    total += m[i][j];
            }
        }
        return total;
    }
}
