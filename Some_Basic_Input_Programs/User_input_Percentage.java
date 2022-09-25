package com.company;                  // Package is used to organize classes belonging to the same category or similar functionality

import java.util.Scanner;             // import the Scanner class which is defined inside util folder inside the java folder
public class User_input_Percentage
{
    public static void main(String[] args)
    {
        System.out.println("Taking input from the user \n");
        Scanner anshu = new Scanner(System.in);
      
        System.out.println("Enter the marks of first subject : ");
        int m1 = anshu.nextInt();
        System.out.println("Enter the marks of second subject : ");
        int m2 = anshu.nextInt();
        System.out.println("Enter the marks of third subject : ");
        int m3 = anshu.nextInt();
        System.out.println("Enter the marks of fourth subject : ");
        int m4 = anshu.nextInt();
        System.out.println("Enter the marks of fifth subject : ");
        int m5 = anshu.nextInt();
        System.out.println("Enter the marks of sixth subject : ");
        int m6 = anshu.nextInt();
      
        int sum = m1+m2+m3+m4+m5+m6;
        int result = sum*100/600;
      
        System.out.println("The total percentage is : "+ result);
    }

}
