package com.aviral.java8practice.streams;

import java.util.List;

/*1. Write a Java program to calculate the average of a list of integers using streams.*/
public class Q1 {
    public void printAverage(List<Integer> integerList){
      Double avg =  integerList.stream().mapToInt(i->i).average().getAsDouble();
        System.out.println("Average: " + avg);
    }
}
