package com.stackroute.pe3;
import java.io.*;
import java.util.*;

public class RemoveVowels {
    public String RemoveVowelsinString(String arr) {
        String words[] = arr.split(",");
        String result = "";

        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].replaceAll("[aeiou]", "");
            if (i == words.length-1) {
                result = result + words[i];
            } else {
                result = result + words[i] + ",";
            }
            //String result=Arrays.toString(words);

        }
        return result;
    }
}
