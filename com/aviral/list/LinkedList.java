package com.aviral.list;

public class LinkedList {
    Node head;
    public void insert(int data){
        Node node = new Node();
        node.setData(data);
        node.setNext(null);

        if(head == null){
            head = node;
        }
        else{
            Node n = head;
            while(n.getNext() != null){
                n = n.getNext();
            }
            n.setNext(node);
        }
    }

    public void show(){
        Node node = head;
        while(node != null){
            System.out.println(node.getData());
            node = node.getNext();
        }
    }
}
