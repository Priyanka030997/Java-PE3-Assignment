package com.stackroute.pe3;

import java.io.*;
import java.util.*;
public class MatrixAddition {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int noofrows = sc.nextInt();
        int noofcolumns = sc.nextInt();
        int first[][] = new int[noofrows][noofcolumns];
        int second[][] = new int[noofrows][noofcolumns];
        int result[][] = new int[noofrows][noofcolumns];
        for (int row = 0; row < noofrows; row++) {
            for (int column = 0; column < noofcolumns; column++) {
                first[row][column] = sc.nextInt();
            }
        }
        for (int row = 0; row < noofrows; row++) {
            for (int column = 0; column < noofcolumns; column++) {
                second[row][column] = sc.nextInt();
            }
        }
        for (int row = 0; row < noofrows; row++) {
            for (int column = 0; column < noofcolumns; column++) {
                result[row][column] = first[row][column] + second[row][column];
            }
        }
        for (int row = 0; row < noofrows; row++) {
            for (int column = 0; column < noofcolumns; column++) {

                System.out.print(result[row][column]+" ");
            }
            System.out.println();
        }
    }
}
