package com.stackroute.pe3;
import java.io.*;
import java.util.*;

public class RemoveVowels {
   public String RemoveVowelsinString(String arr)
   {
      String words[]=arr.split(",");

      for(int i=0;i<words.length;i++)
      {
          words[i]=words[i].replaceAll("[aeiouAEIOU]","");
      }
      String result=Arrays.toString(words);
     return result;
    }
}
