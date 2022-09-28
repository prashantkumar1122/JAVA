package com.company;
import java.util.*;
// import java.util.Scanner;                //  * and java.util.Scanner are practically the same both import which includes the Scanner class and many others
public class User_input_1D_Array
{

    public static void main(String[] args)
    {
        int num, i;
        Scanner sc = new Scanner(System.in);

        System.out.println("How much Elements to store in Array : ");
        num = sc.nextInt();

        int[] arr = new int[num];

        System.out.print("Enter " + num + " elements: ");
        for(i=0; i<num; i++)
            arr[i] = sc.nextInt();

        System.out.println("The Array is :");
        for(i=0; i<num; i++)
            System.out.print(arr[i]+ " ");
    }
}
