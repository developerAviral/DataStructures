package com.aviral.java8practice.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DriverClass {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(4);
        integerList.add(4);
        integerList.add(4);
        integerList.add(4);

        Q1 question1 = new Q1();
        question1.printAverage(integerList);

        Q2 question2 = new Q2();
        question2.execute(Arrays.asList("aviral","Rahul","BaCkery"));

        Q3 question3 = new Q3();
        question3.execute(integerList);
    }
}
