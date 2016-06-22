/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kevin
 */
//A problem program
public class Program {
public static void main(String[] args){
String firstName = "kevin";
String middleName = "dewayne";
String lastName = "Love";

int randomNumber = (int)(Math.random() * (100 + 1) + 1);
String userName = (String.valueOf(firstName.toUpperCase().charAt(0)) + middleName.toUpperCase().charAt(0) + lastName.toLowerCase() + randomNumber );
System.out.println(userName);
}
}




