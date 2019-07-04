package com.stackroute.pe3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentMarksTest {
    StudentMarks obj;
    @Before
    public void setup()
    {
        obj=new StudentMarks();
    }
    @Test
    public void CalculateStudentgrade()
    {
        int arr[]={50,60,100,75};
        String result=obj.checkStudentGrade(arr,4);
        assertEquals("Grade is correct",result);
    }
    @Test
    public void CalculategradeforNegativeNumber()
    {
        int arr[]={50,60,100,75};
        String result=obj.checkStudentGrade(arr,-2);
        assertEquals("Error",result);
    }

}