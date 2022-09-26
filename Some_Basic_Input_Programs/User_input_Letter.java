package com.company;
import java.util.Scanner;
public class Use_input_Letter
{
    public static void main(String[] args)
    {
        System.out.println("Please enter your name : ");
      
        Scanner sc =new Scanner(System.in);
        String name = sc.next();
      
        System.out.println("Hello "+ name +" Welcome to Prashant's Github");
    }
}
