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
public class KilogramsToPounds {
    public static void main(String[] args){
    
    int kilos = 1;
    
    
    System.out.println("-----------------------");
    System.out.println("Kilgrams       Pounds  ");
    System.out.println("-----------------------");
    
    for(kilos = 1; kilos < 200; kilos++){
        
        if(kilos == 1 || kilos == 3 || kilos == 5){
            double lbs = (kilos * 2.2);
            lbs = Math.round(lbs * 100.00) / 100.00;
            System.out.println(kilos + "              " + lbs);
            System.out.println();
        }
        else if(kilos == 197 || kilos == 199){
            double lbs = (kilos * 2.2);
            lbs = Math.round(lbs * 100.00) / 100.00;
            System.out.println(kilos + "            " + lbs);
            System.out.println();
        } 
    }
    System.out.println("-----------------------");
    }
}
