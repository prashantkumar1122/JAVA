package com.company;
import java.util.*;
public class Array_user_input 
{
     public static void main(String[] args)
     {
         System.out.println("Enter number of rows and column :");
         Scanner sc = new Scanner(System.in);
       
         int rows = sc.nextInt();
         int column = sc.nextInt();
         int [] [] numbers = new int[rows][column];
       
         System.out.println("Enter the values in rows and column :");
       
         for(int i=0;i<rows;i++)
         {
             for (int j=0;j<column;j++)
             {
                 numbers[i][j] = sc.nextInt();
             }
         }

         for(int i=0;i<rows;i++)
         {
             for(int j=0;j<column;j++)
             {
                 System.out.printf("%d ",numbers[i][j]);
             }
             System.out.println();
         }
     }
}
