package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;                                    // it is a scanner class which is defined inside util folder inside the java folder

public class User_input_sum 
{
    public static void main(String[] args)
    {
        System.out.println("Taking Input From The User");
        Scanner sc = new Scanner(System.in);                 // sc is the scannner variable
        System.out.println("Enter the first number :");
      
        int a = sc.nextInt();                                // The nextInt() method of Java Scanner class is used to scan the next input as an int
        // float a = sc.nextFloat();
      
        System.out.println("Enter the Second number :");
      
        int b = sc.nextInt();
        // float b = sc.nextFloat();                        // // The nextInt() method of Java Scanner class is used to scan the next input as an float
      
        int sum = a+b;
        System.out.println("The Sum of these numbers is : \n"+ sum);
    }
