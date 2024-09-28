package com.decommer.algorithms;

public class Recursion {
    
    public static int factorial(int n) {
        if(n < 1) {
            return -1;
        }else if(n == 0 || n == 1) {
            return 1;
        }else {
            return n * factorial(n - 1);
        }
    }

    public static int sumOfDigits(int n) {
        if(n == 0 || n < 0) {
            return 0;
        }else {
            return n % 10 + sumOfDigits(n / 10);
        }
    }

    public static int exponentCalc(int b, int e) {
        if(e < 0) {
            return -1;
        }else if(e == 0 || e == 1) {
            return b;
        }return b * exponentCalc(b, e - 1);
    }
}
