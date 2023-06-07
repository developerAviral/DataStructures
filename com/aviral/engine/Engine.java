package com.aviral.engine;

import com.aviral.binarysearch.BinarySearch;
import com.aviral.binarysearch.questions.CeilingQuestion;
import com.aviral.binarysearch.questions.FloorQuestion;
import com.aviral.binarysearch.questions.NextGreatestLetter;
import com.aviral.list.LinkedList;
import com.aviral.queue.Queue;
import com.aviral.stack.DynamicStack;
import com.aviral.stack.Stack;

public class Engine {
    public static void main(String[] args) {

        /**Binary Search */
/*

        NextGreatestLetter greatestLetter = new NextGreatestLetter();
        char [] arr = new char[]{'a','b','c','h','i'};
        System.out.println("Ceil of 44 :" + greatestLetter.getNextGreatestLetter(arr, 'j'));
        System.out.println("Ceil of 233 :" + greatestLetter.getNextGreatestLetter(arr, 'k'));
        System.out.println("Ceil of -1 :" + greatestLetter.getNextGreatestLetter(arr, 'd'));
        System.out.println("Ceil of -20 :" + greatestLetter.getNextGreatestLetter(arr, 'e'));
        System.out.println("Ceil of 2 :" + greatestLetter.getNextGreatestLetter(arr, 'b'));
        System.out.println("Ceil of 2 :" + greatestLetter.getNextGreatestLetter(arr, 'c'));
*/

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
