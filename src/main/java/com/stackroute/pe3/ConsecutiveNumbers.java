package com.stackroute.pe3;
import java.awt.*;
import java.io.*;
import java.util.*;

public class ConsecutiveNumbers {
   public String Checkconsecutiveornot(String arr)
    {
     //System.out.println(numbers);
     String numbers[]=arr.split(",");
     int arr2[]=new int[numbers.length];
     for(int i=0;i<numbers.length;i++)
     {
         arr2[i]=Integer.parseInt(numbers[i]);
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
             return "consecutive numbers";
         }
     else
     {
         return "Not consecutive numbers";
     }

     }

    }
