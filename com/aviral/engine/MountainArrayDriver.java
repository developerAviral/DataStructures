package com.aviral.engine;

import com.aviral.binarysearch.questions.FindPeak;

public class MountainArrayDriver {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,50,20,10};
        FindPeak findPeak = new FindPeak();

        System.out.println(findPeak.getPeak(nums));

    }
}
