package com.tdd.findhighestnumber;

public class HighestNumberFinder {

    public int findHighestNumber(int[] arr) {
        if(arr.length == 1)
            return arr[0];
        else if(arr.length == 2)
            return arr[0] < arr[1] ? arr[1] : arr[0];

        return 0;
    }
}
