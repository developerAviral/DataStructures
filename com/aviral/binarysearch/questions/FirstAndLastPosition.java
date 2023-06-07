package com.aviral.binarysearch.questions;

/***/
public class FirstAndLastPosition {

    public int[] getFirstAndLast(int[] nums , int target){
        int[] ans = {-1,-1};
        int startIndex = searchElement(nums, target, true);
        int endIndex = searchElement(nums, target, false);
        ans[0] = startIndex;
        ans[1] = endIndex;
        return ans;
    }

    public int searchElement(int[] nums, int target, boolean findStartIndex){
          int start = 0;
          int end = nums.length -1 ;
          int mid = 0;
          int ans = -1;
          while(start <= end){
              mid = start + (end - start)/2;
              if(target < nums[mid]){
                  end = mid -1 ;
              }
              else if(target > nums[mid]){
                  start = mid + 1;
              }
              else{
                  if(findStartIndex){
                      ans = mid;
                      end = mid -1;
                  }
                  else{
                      ans = mid;
                      start = mid + 1;
                  }
              }
          }
          return ans;
    }
}
