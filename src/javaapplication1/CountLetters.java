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
public class CountLetters {
    
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a string of letters, numbers, spaces, and symbols: ");
    String aString = input.nextLine();
    int number = countLetters(aString);
    System.out.println("The number of letters in the string is: " + number);
    
    }
    public static int countLetters(String s){
        int count = 0;
        
        for (int i = 0; i < s.length();i++){
           
            if (realLetter(s.charAt(i))){
                count++;
            } 
            else {
            }
        } 
        return count;
    }
    public static boolean realLetter(char ch) {
 
         return ((ch >= 'a' && ch <= 'z' ) || (ch <= 'Z' && ch >= 'A'));
 
     }
}
