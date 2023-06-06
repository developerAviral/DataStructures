package com.aviral.binarysearch.questions;

public class NextGreatestLetter {

    public char getNextGreatestLetter(char [] letters , char target){
        int start = 0 ;
        int end = letters.length -1;
        int mid = 0;

        while(start <= end){
            mid= start + (end - start)/ 2;
            if(target < letters[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return letters[ start % letters.length];
    }
}
