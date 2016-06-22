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
 * @author Kevin Love
 */
public class CheckPassword {
    
    public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.print("Enter a password: ");
  String s = input.nextLine();
 
  if (passCheck(s)) {
   System.out.println("Valid Password");
  } else {
   System.out.println("Invalid Password");
  }
 
 }
 
 public static boolean passCheck(String password) {
  boolean good2go = true;
 
  // ■ A password must have at least eight characters.
  if (password.length() < 8) {
   good2go = false;
  } else { // ■ A password consists of only letters and digits.
   int digit = 0;
   for (int i = 0; i < password.length(); i++) {
    if (realNum(password.charAt(i)) || realLetter(password.charAt(i))) {
     if (realNum(password.charAt(i))) {
      digit++;
     }
 
    } else { // if a char in the password is not a letter or a
       // digit, set chkPswd to false and break of for loop
     good2go = false;
     break;
    }
   }
 
   if (digit < 2) { // ■ A password must contain at least two
          // digits.
    good2go = false;
   }
 
  }
 
  return good2go;
 
 }
 
 public static boolean realLetter(char ch) {
 
  return ((ch >= 'a' && ch <= 'z' ) || (ch <= 'Z' && ch >= 'A'));
 
 }
 
 public static boolean realNum(char ch) {
  return (ch <= '9' && ch >= '0');
 }
 
}