package com.aviral.engine;

import java.util.Arrays;
import java.util.List;

public class EvenOddSum {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(-1,-2,3,4,0,1,2,3,5,-6);
        EvenOddSum s = new EvenOddSum();
        s.getSum(true,numbers);

    }

    public void getSum(boolean flag, List<Integer> numbers){

        if(flag){ // true then sum of even
            Integer sum = numbers.stream().filter(n-> n<0 && n%2 ==0).mapToInt(x->x).sum();

            System.out.println(sum);

        }
        else{
            Integer sum = numbers.stream().filter(n-> n<0 && n%2 !=0).mapToInt(x->x).sum();

            System.out.println(sum);
        }
    }
}
