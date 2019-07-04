package com.stackroute.pe3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExceptionCheckerTest {
    ExceptionChecker obj;
    @Before
    public void setup()
    {
        obj=new ExceptionChecker();
    }
    @Test
    public void ExampleforArrayIndexOutOfBound()
    {
        int arr[]={1,2,3,4,5};
        String result=obj.ArrayIndexOutOfBound(arr,6);
        assertEquals("ArrayIndexOutOfBound",result);

    }
    @Test
    public void ExampleforNullPointerException()
    {
        String str=null;
        String result=obj.NullPointerException(str);
        assertEquals("NullPointerException",result);

    }
    @Test
    public void ExampleforNegativeArraySizeException()
    {
        int arr[]={1,2,3,4,5};
        String result=obj.NegativeArraySizeException(arr,-1);
        assertEquals("NegativeArraySizeException",result);

    }
}