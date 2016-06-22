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
public class CharCounter {
    public static int count(String str, char a){
   int count = 0;
    for (int i = 0; i < str.length(); i++){
        if (str.charAt(i) == a){
            count++;
        }
    }
    return count;
    }
     public static void main(String[] args){
        System.out.print("Enter a string:");
        Scanner input = new Scanner(System.in);
        String newString = input.next();
        System.out.print("Enter a character:") ;
         char newChar= input.next().charAt(0);
        System.out.println(newChar + " occurs " + count(newString, newChar) + " times in the string");               
     }
}