package com.aviral.binarysearch.questions;

public class BinarySearchInfiniteArray {

    public int ans(int [] nums, int target){
        int start = 0;
        int end = 1;

        try{
        while(target > nums[end]){
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }}
        catch (IndexOutOfBoundsException e){
            System.out.println("Its an infinite array so this exception should never be triggered!!");
        }

        return binarySearch(nums, target, start, end);
    }
    public int binarySearch(int[] nums, int target , int start, int end){
        while(start <= end){

            if(end > nums.length){
                end = nums.length -1 ;
            }
            int mid = start + (end - start)/2;
            if(target < nums[mid]){
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
