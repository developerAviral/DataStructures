package com.aviral.engine;

import com.aviral.binarysearch.BinarySearch;
import com.aviral.list.LinkedList;
import com.aviral.queue.Queue;
import com.aviral.stack.DynamicStack;
import com.aviral.stack.Stack;

public class Engine {
    public static void main(String[] args) {

        /**Binary Search */
        BinarySearch binary = new BinarySearch();
        int [] arr = new int[]{-1,0,30,42,45,94,108,193,232};
        System.out.println(binary.search(arr,45));
        System.out.println(binary.search(arr,6));
        System.out.println(binary.search(arr,193));
        System.out.println(binary.search(arr,232));

        /** Queue with Arrays */
      /*  Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(50);
        queue.enqueue(60);
        queue.enqueue(70);
        queue.enqueue(80);
        queue.enqueue(90);
        queue.enqueue(150);
        queue.enqueue(260);

        queue.show();

        queue.dequeue();;
        queue.dequeue();

        queue.show();
       */

        /** Dynamic Stack */
       /* DynamicStack st = new DynamicStack();
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
        st.pop();
        st.pop();
        st.show();
        System.out.println(st.isEmpty());
        *
        */

        /** Static Stack */
        /*Stack st = new Stack();
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
        */


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
