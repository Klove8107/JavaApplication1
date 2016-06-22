/* written by Kevin Love
 * COSC 1336_48F_1-Programming Fund I 
 * Dr. Sujing Wang
 * REVEL Programming Assignment Chapter 6
 * Due Date 13 March
*/
package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author Kevin
 */
public class PentagonalNumber {
    

    public static void main(String[] args) {
        String endResult = "";
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an integer for the n pentagonal numbers you want displayed: ");
        int number = input.nextInt();
        for (int i = 1; i < number; i++){
            if (i % 10 == 0){
            endResult += Integer.toString(getPentagonalNumber(i))+"\n";
            }
            else{
                endResult += Integer.toString(getPentagonalNumber(i)) + " ";
            }
        }
        
        System.out.println(endResult);
        
        
    }
    public static int getPentagonalNumber(int n){
        int pNum = (n*((3 * n)-1))/2;
        return pNum;
    }
}
