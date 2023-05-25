package com.aviral.engine;

import com.aviral.list.LinkedList;

public class Engine {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.insert(10);
        l.insert(50);
        l.insert(20);
        l.show();

        System.out.println("Insert at first");
        l.insertAtFirst(123);
        l.show();

        System.out.println("Insert at 2nd index");
        l.insertAt(13,505);
        l.show();

        System.out.println("Delete at 3rd index");
        l.deleteAt(10);
        l.show();
    }
}
