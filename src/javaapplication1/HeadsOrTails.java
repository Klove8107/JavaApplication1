/*
 * Kevin Love  4/10/2016 Assignment
Chapter 8
 */
package javaapplication1;
import java.util.Scanner;

/**
 *
 * @author Kevin
 */
public class HeadsOrTails {
    

    public static void main(String[] args){
        
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a number between 0 and 511");
        int number = scan.nextInt();
        int[] nums = decimalToBinary(number);
        HTOutput(nums);  
    }
    public static int[] decimalToBinary(int decimal)
  {

  int[] nums = new int[9];
  for (int i = nums.length-1;i>=0 && decimal >0;i--)
  {
    if ( decimal% 2 == 0)
      nums[i] = 0;
    else
      nums[i] = 1;
    decimal /= 2;
  }
  return nums;
  }
 
  public static void HTOutput(int[] nums)

  {

    for (int i =0; i<9;i++)

    {

      if (nums[i] == 0){
          System.out.print("H ");
      }

      else {
          System.out.print("T ");
      }

      if ((i+1) % 3 == 0){
          System.out.println();
      }
   
    }

  }

}
