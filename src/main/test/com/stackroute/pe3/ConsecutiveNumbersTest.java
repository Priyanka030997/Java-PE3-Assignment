package com.stackroute.pe3;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class ConsecutiveNumbersTest{
    ConsecutiveNumbers obj;
    @Before
    public void setup()
    {
        obj=new ConsecutiveNumbers();
    }
    @Test
    public void Givenseriesisconsecutive()
    {
        int arr[]={54,53,52,51,50,49,48};
        String result=obj.Checkconsecutiveornot(arr);
        assertEquals("consecutive numbers",result);
    }
    @Test
    public void Givenseriesisnotconsecutive()
    {
        int arr[]={98,96,95,94,93};
        String result=obj.Checkconsecutiveornot(arr);
        assertEquals("Not consecutive numbers",result);
    }
    @Test
    public void Givenseriesisrepeatednumber()
    {
        int arr[]={1,2,3,4,5,6,6};
        String result=obj.Checkconsecutiveornot(arr);
        assertEquals("Not consecutive numbers",result);
    }


}