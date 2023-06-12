package com.aviral.binarysearch.questions;

public class FindInMountainArray {

    public int getElement(int[] nums, int target){
        FindPeak peak = new FindPeak();
        int p = peak.getPeak(nums);
        int firstTry = orderAgnosticBinarySearch(nums, target, 0, p);
        if(firstTry != -1){
            return firstTry;
        }
        return orderAgnosticBinarySearch(nums,target, p + 1, nums.length -1 );
    }

    public int orderAgnosticBinarySearch(int [] nums, int target, int start, int end){
        boolean isAscending = nums[start] < nums[end];

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(nums[mid] == target){
                return mid;
            }

            if(isAscending){
                if(target < nums[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            else{
                if(target > nums[mid]){
                    end = mid -1 ;
                }
                else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}


