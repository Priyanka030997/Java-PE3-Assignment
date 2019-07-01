package com.stackroute.pe3;
import java.awt.*;
import java.io.*;
import java.util.*;

public class ConsecutiveNumbers {
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
     String numbers=sc.next();
     //System.out.println(numbers);
     String arr[]=numbers.split(",");
     int arr2[]=new int[arr.length];
     for(int i=0;i<arr.length;i++)
     {
         arr2[i]=Integer.parseInt(arr[i]);
     }
     int temp;
     for(int i=0;i<arr2.length;i++)
     {
         for(int j=i+1;j<arr2.length;j++)
         {
         if(arr2[i]>arr2[j])
         {
             temp=arr2[i];
             arr2[i]=arr2[j];
             arr2[j]=temp;
         }

         }
     }
     int flag=0;
     for(int i=0;i<arr2.length-1;i++)
     {
         if((arr2[i]+1)!=arr2[i+1])
         {
           flag=1;
         }
     }
     if(flag==0)
     {
             System.out.println(numbers+" are consecutive numbers");
         }
     else
     {
         System.out.println(numbers+" are not consecutive numbers");
     }

     }

    }
