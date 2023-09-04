package com.aviral.java8practice.streams;

import java.util.ArrayList;
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
    }
}
