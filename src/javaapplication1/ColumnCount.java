package javaapplication1;
import java.util.Scanner;

/*
 * Kevin Love  4/10/2016 Assignment
Chapter 8
 */
 

public class ColumnCount {

    public static void main(String[] args) {

         

        double[][] m = createArray();

         

        double sum = 0.0;

        for(int column = 0; column < m[0].length; column++) {

            sum = sumColumn(m, column);

            System.out.println("Sum of the elements at column " + (column+1) + " is " + sum);

        }
        

    }

 

    public static double[][] createArray(){

        Scanner input = new Scanner(System.in);

        double[][] arrayToReturn = new double[3][4];

        System.out.println("Enter a " + arrayToReturn.length + "-by-" + arrayToReturn[0].length + " matrix row by row: ");

        for (int i = 0; i < arrayToReturn.length; i++)

            for (int j = 0; j < arrayToReturn[0].length; j++)

                arrayToReturn[i][j] = input.nextDouble();

        input.close();

        return arrayToReturn;

    }

    public static double sumColumn(double[][] arrayPassedIn, int columnIndex){
         
        double total = 0.0;

        for (int row = 0; row < arrayPassedIn.length; row++) {

            total += arrayPassedIn[row][columnIndex];

        }

    return total;

    }

}
