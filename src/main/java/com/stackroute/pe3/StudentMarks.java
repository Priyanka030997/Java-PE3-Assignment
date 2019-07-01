package com.stackroute.pe3;

import java.awt.*;
import java.io.*;
import java.util.*;
public class StudentMarks {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int numOfStudents=sc.nextInt();
        int stuGrades[]=new int[numOfStudents];
        for(int i=0;i<numOfStudents;i++)
        {
            stuGrades[i]=sc.nextInt();
        }
        for(int i=0;i<numOfStudents;i++)
        {
            if((stuGrades[i]>0)&&(stuGrades[i]<=100))
            {
                System.out.println("Grade is correct");
            }
            else
            {
                System.out.println("Error-Grade is incorrect");
            }

        }
    }
}
