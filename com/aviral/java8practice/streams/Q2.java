package com.aviral.java8practice.streams;

import java.util.List;
import java.util.stream.Collectors;

/*Write a Java program to convert a list of strings to uppercase or lowercase using streams.*/
public class Q2 {

    public void execute(List<String> stringList){
     List<String> lowercaseList =   stringList.stream().map(s -> s.toLowerCase()).collect(Collectors.toList());
        List<String> uppercaseList =    stringList.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());

        System.out.println("Lowercase List: " + lowercaseList);
        System.out.println("Uppercase List: " + uppercaseList);
    }
}
