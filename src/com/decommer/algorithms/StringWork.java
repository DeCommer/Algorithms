package com.decommer.algorithms;

public class StringWork {

    public static String isPalindrome(String word){

        char[] charArr = word.toCharArray();
        int start = 0;
        int end = word.length() - 1;
        while(start < end) {
            if(charArr[start] != charArr[end]) {
                return "No";
            }
            start++;
            end--;
        }
        return "Yes";
    }

    
}
