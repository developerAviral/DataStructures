package com.aviral.engine;

import com.aviral.binarysearch.questions.FindInMountainArray;
import com.aviral.binarysearch.questions.FindPeak;

public class MountainArrayDriver {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,50,20,10};
      //  FindPeak findPeak = new FindPeak();

      //  System.out.println(findPeak.getPeak(nums));


        FindInMountainArray findInMountainArray = new FindInMountainArray();
        System.out.println("Element 10 at : " + findInMountainArray.getElement(nums, 10));
        System.out.println("Element 20 at : " + findInMountainArray.getElement(nums, 20));
        System.out.println("Element 50 at : " + findInMountainArray.getElement(nums, 50));
        System.out.println("Element 5 at : " + findInMountainArray.getElement(nums, 5));
        System.out.println("Element 4 at : " + findInMountainArray.getElement(nums, 4));
        System.out.println("Element 3 at : " + findInMountainArray.getElement(nums, 3));
        System.out.println("Element 2 at : " + findInMountainArray.getElement(nums, 2));
        System.out.println("Element 1 at : " + findInMountainArray.getElement(nums, 1));


    }
}
