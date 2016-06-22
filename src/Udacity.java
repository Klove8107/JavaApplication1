/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kevin
 */
public class Udacity 
{
    public static void main(String[] args)
{
 String str = "Udacity";
 boolean found = false;
 @SuppressWarnings("UnusedAssignment")
 String ch = "?";
 int position = 0;
 while (!found&&position<str.length())
 {
     ch = str.substring(position, position + 1);
     if(ch.equals(' '))
     {
         found = true;
     }
     else
     {
             position++;
             }
             }
 System.out.println(position);
     }
 }

