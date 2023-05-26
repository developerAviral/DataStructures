package com.aviral.engine;

import com.aviral.list.LinkedList;
import com.aviral.stack.Stack;

public class Engine {
    public static void main(String[] args) {

        Stack st = new Stack();
        st.pop();
        System.out.println(st.isEmpty());
        st.push(10);
        st.push(40);
        st.push(100);
        st.push(1);
        st.push(20);
        st.push(10000);
        st.show();
        st.pop();
        st.show();
        st.pop();
        st.show();
        System.out.println(st.isEmpty());
        /**List Calls */
        /*
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
        l.show();*/
    }
}
