package com.decommer.algorithms.Basic;

public class LinearSearch {

    //int search
    //string search

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        
    }

    public static int linearSearch(int[] arr, int searchValue){
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == searchValue) {
                return i;
            }
        }
        return -1;
    }

}
