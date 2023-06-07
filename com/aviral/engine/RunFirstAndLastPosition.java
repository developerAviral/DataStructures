package com.aviral.engine;

import com.aviral.binarysearch.questions.FirstAndLastPosition;

public class RunFirstAndLastPosition {
    public static void main(String[] args) {
        FirstAndLastPosition firstAndLastPosition = new FirstAndLastPosition();
        int[] arr = new int[]{2,5,6,7,7,7,7,7,7,10,10,10,40,80,150,150};

        System.out.println(firstAndLastPosition.getFirstAndLast(arr,150)[0]);
        System.out.println(firstAndLastPosition.getFirstAndLast(arr,150)[1]);
    }
}
