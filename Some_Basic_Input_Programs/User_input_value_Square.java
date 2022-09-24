package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;

public class User_input_value_Square 
{
    public static void main(String[] args)
    {
        System.out.println("Here we are Squaring the number by user input");
        Scanner sc = new Scanner(System.in);
      
        System.out.println("Enter the number :");
        int a = sc.nextInt();
        int result = a*a;
      
        System.out.println("The Square of this number is :"+ result);
    }
}
