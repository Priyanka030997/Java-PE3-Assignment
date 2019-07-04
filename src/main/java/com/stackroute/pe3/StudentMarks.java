package com.stackroute.pe3;

import java.awt.*;
import java.io.*;
import java.util.*;
public class StudentMarks {
    public String checkStudentGrade(int stuGrades[],int numOfStudents)
    {
        String result="";
        if(numOfStudents>0) {

            for (int i = 0; i < numOfStudents; i++) {
                if ((stuGrades[i] > 0) && (stuGrades[i] <= 100)) {
                    result = "Grade is correct";
                } else {
                    result = "Error-Grade is incorrect";
                }

            }

        }
        else
        {
            result="Error";
        }
        return result;
    }
}
