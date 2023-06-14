package com.aviral.binarysearch.questions;

public class RotatedArray {
    public static void main(String[] args) {
        int[] nums = new int[]{4,5,6,7,0,1,2};
        RotatedArray rotatedArray = new RotatedArray();
        System.out.println(rotatedArray.getElement(nums,0));
    }
    public int getElement(int[] nums , int target){
        int pivot = getPivot(nums);
        int start = 0;
        int end = nums.length-1;

        //If pivot is not found then array is not rotated
        if(pivot == -1)
        {
            return binarySearch(nums, target,start, end);
        }

        //If pivot is found then you found two sorted array
        if(nums[pivot] == target){
            return pivot;
        }

        //search between start and pivot
        if(target >= nums[start]){
           return binarySearch(nums, target,start, pivot-1);
        }

        //search between pivot and end
        else{
           return  binarySearch(nums,target,pivot+1, end);
        }

    }

    public int binarySearch(int[] nums, int target, int start, int end){
        while(start<= end){
            int mid = start + (end - start)/2;
            if(target > nums[mid]){
                start = mid +1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    public int getPivot(int[] nums){
        int start = 0;
        int end = nums.length -1;

        while(start<=end){
            int mid = start + (end - start)/2;
            //All 4 cases

            if(mid< end && nums[mid] > nums[mid+1]){
                return mid;
            }
            if(mid > start && nums[mid] < nums[mid-1]){
                return mid -1;
            }
            if(nums[mid] <= nums[start]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
