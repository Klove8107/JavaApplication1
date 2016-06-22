package javaapplication1;
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class ColumnRowSums {

  
    
    
    public static void main(String[] args) {
        
        double[][] m = createArray();
     

        int i = 0;
        double sumA = sumColumn(m, i);
        double sumB = sumColumn(m, i);
        double sumC = sumColumn(m, i);
        double sumD = sumColumn(m, i);
         
        System.out.println("Sum of the elements at column " + i + " is " + sumA);
        System.out.println("Sum of the elements at column " + (i+1) + " is " + sumB);
        System.out.println("Sum of the elements at column " + (i+2) + " is " + sumC);
        System.out.println("Sum of the elements at column " + (i+3) + " is " + sumD);
    }
    public static double[][] createArray(){
      
        Scanner input = new Scanner(System.in);

         
        double[][] m = new double[3][4];
        System.out.println("Enter a " + m.length + "-by-" + m[0].length + " matrix row by row: ");
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[0].length; j++)
                m[i][j] = input.nextDouble();
         
        return m;
    }
     
    public static double sumColumn(double[][] m, int columnIndex){
         
        double total = 0;
        for (int row = 0; row < m.length; row++) {
                total += m[row][columnIndex];
            }
    return total;
   
    }
}
