package com.stackroute.pe3;
import java.io.*;
import java.util.*;

public class RemoveVowels {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int noofwords=sc.nextInt();
      String words[]=new String[noofwords];
      for(int i=0;i<noofwords;i++)
      {
          words[i]=sc.next();
      }
      for(int i=0;i<noofwords;i++)
      {
          words[i]=words[i].replaceAll("[aeiouAEIOU]","");
      }
      for(int i=0;i<noofwords;i++)
      {
          System.out.println(words[i]);
      }
    }
}
