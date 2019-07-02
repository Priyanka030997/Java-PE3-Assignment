package com.stackroute.pe3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveVowelsTest {
    RemoveVowels obj;
    @Before
    public void setup()
    {
        obj=new RemoveVowels();
    }
    @Test
    public void RemoveVowelsintheGivenStrings()
    {
        String result=obj.RemoveVowelsinString("India,United States,Germany,Egypt,czechoslovakia");

        assertEquals("nd,ntd Stts,Grmny,gypt,czchslvk",result);
    }


}