package com.aviral.java8practice.streams;

import java.util.List;
import java.util.stream.Collectors;

/* Write a Java program to remove all duplicate elements from a list using streams.*/
public class Q4 {
    public void execute(List<Integer> duplicateIntegerList, List<String> duplicateStringList){
       List<Integer> integerList =  duplicateIntegerList.stream().distinct().collect(Collectors.toList());
        List<String> stringList =  duplicateStringList.stream().distinct().collect(Collectors.toList());

        System.out.println("Unique Integer List: " + integerList);
        System.out.println("Unique String List: " +stringList);
    }
}
