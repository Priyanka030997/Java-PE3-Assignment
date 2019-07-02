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
        String result=obj.Checkconsecutiveornot("54,53,52,51,50,49,48");
        assertEquals("consecutive numbers",result);
    }
    @Test
    public void Givenseriesisnotconsecutive()
    {
        String result=obj.Checkconsecutiveornot("98,96,95,94,93");
        assertEquals("Not consecutive numbers",result);
    }
    @Test
    public void Givenseriesisrepeatednumber()
    {
        String result=obj.Checkconsecutiveornot("1,2,3,4,5,6,6");
        assertEquals("Not consecutive numbers",result);
    }


}