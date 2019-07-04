package com.stackroute.pe3;

public class ThrowsException {
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5};
        try
        {
            arr[8]=10;
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBoundException");
        }
        finally
        {
           System.out.println("This is Final block");
        }
    }
}
