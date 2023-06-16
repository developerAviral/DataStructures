package com.aviral.binarysearch.questions;

public class RotatedArrayBinarySearchWithDuplicates {

    public static void main(String[] args) {
        int[] nums = new int[]{4,5,5,6,7,7,7,7,0,1,2};
        RotatedArrayBinarySearchWithDuplicates rotatedArray = new RotatedArrayBinarySearchWithDuplicates();
        System.out.println(rotatedArray.search(nums,0));
    }

    private int search(int [] nums, int target){
        int pivot = getPivot(nums);
        int start = 0;
        int end = nums.length -1 ;
        if(pivot == -1){
            return binarySearch(nums,target, 0 , nums.length-1);
        }

        if(nums[pivot] == target){
            return pivot;
        }

        if(target >= nums[start]){
            return binarySearch(nums,target,start,pivot-1);
        }
        else{
            return binarySearch(nums,target,pivot+1, end);
        }
    }

    private int binarySearch(int [] nums, int target, int start , int end){
        while(start <= end){
            int mid = start + (end -start)/2;

            if(target == nums[mid]){
                return mid;
            }
            if(target > nums[mid]){
                start = mid +1;
            }
            else{
                end = mid -1 ;
            }
        }
        return -1;
    }

    private int getPivot(int [] nums){
        int start =0 ;
        int end = nums.length-1;

        while(start < end){
            int mid = start + (end - start)/2;

            if(mid<end && nums[mid] > nums[mid +1]){
                return mid;
            }
            if(mid > start && nums[mid] < nums[mid-1])
            {
                return mid -1 ;
            }
            if(nums[start] == nums[mid] && nums[mid] == nums[end]){

                if(nums[start] > nums[start+1])
                {
                    return start;
                }
                //skip duplicates
                start = start + 1;

                if(nums[end] < nums[end-1]){
                    return end;
                }
                end = end - 1;
            }
            else if(nums[start] < nums[mid] || (nums[start] == nums[mid] && nums[mid] > nums[end])){
               start = mid +1;
            }
            else{
                end = mid -1;
            }
        }
        return -1;
    }

}

