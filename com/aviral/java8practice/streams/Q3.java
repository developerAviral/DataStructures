package com.aviral.java8practice.streams;

import java.util.List;

/*Write a Java program to calculate the sum of all even, odd numbers in a list using streams.*/
public class Q3 {
    public void execute(List<Integer> integerList){
       Integer sumOfEven = integerList.stream().filter(i->i%2==0).mapToInt(Integer::intValue).sum();
       Integer sumOfOdds = integerList.stream().filter(i->i%2!=0).mapToInt(Integer::intValue).sum();

        System.out.println("Sum of Even: " + sumOfEven);
        System.out.println("Sum of Odd " + sumOfOdds);
    }
}
