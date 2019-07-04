package com.stackroute.pe3;

public class ExceptionChecker {
    public static void main(String args[])
    {
        ExceptionChecker obj=new ExceptionChecker();
      //obj.ArrayIndexOutOfBound();
     // obj.NullPointerException();
      //obj.NegativeArraySizeException();
    }
    public String ArrayIndexOutOfBound(int arr[],int index)
    {
        String result="";
        try {
            arr[index] = 20;
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            result="ArrayIndexOutOfBound";

    }
        return  result;
    }
    public String NullPointerException(String str)
    {
        String result="";
        try {
               str=null;
          // System.out.println(str.length());
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            result="NullPointerException";

        }
        return result;
    }

    public String NegativeArraySizeException(int arr[],int index)
    {
        String result="";
        try {
            //int arr[]=new int[-10];
            arr[index]=10;
        }
        catch(NegativeArraySizeException e)
        {
            result="NegativeArraySizeException";

        }
        return result;
    }
}
