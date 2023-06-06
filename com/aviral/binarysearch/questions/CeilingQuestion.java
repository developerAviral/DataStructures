package com.aviral.binarysearch.questions;

public class CeilingQuestion {

    public int ceil(int [] arr , int target){
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;

        if(arr[end-1] < target){
            return -1;
        }

        while(start <= end){
            mid = start + (end - start)/2 ;

            if(target > arr[mid]){
                start = mid + 1;
            }
            else if(target < arr[mid]){
                end = mid - 1;
            }
            else{
                return mid;
            }

        }
        return start;
    }
}
