/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Kevin
 */
public class Arrays {
    

    public static void main(String[] args) {
        
        int[] numbers = new int[10];
        //generate an array
        for (int i =1; i<=numbers.length; i++){
            numbers[i-1] = i;
        }
        for (int i=0;i<numbers.length;i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        //shuffle array
        for (int i=0;i< numbers.length;i++) {
            int index = (int) (Math.random() * numbers.length);
            
            int temp = numbers[i];
            numbers[i] = numbers[index];
            numbers[index] = temp;
        }
        for (int i=0;i<numbers.length;i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
