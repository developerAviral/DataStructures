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

    public void insertAtFirst(int data){
        Node node = new Node();
        node.setData(data);
        node.setNext(head);
        head = node;
    }

    public void insertAt(int index, int data){
        Node node = new Node();
        node.setData(data);
        node.setNext(null);

        if(index == 0){
            insertAtFirst(data);
            return;
        }
        Node n = head;
        for(int i =0 ; i < index -1 ; i++){
            if(n.getNext() == null)
                break;
            n = n.getNext();
        }

        Node temp = n.getNext();
        n.setNext(node);
        node.setNext(temp);
    }

    public void deleteAt(int index){
        Node n = head;
        for (int i = 0; i< index -1 ; i++){
            if(n.getNext() == null) {
                System.out.println("Give index in range");
                break;
            }
            n = n.getNext();
        }

        Node temp = n.getNext();
        if(temp != null) {
            n.setNext(temp.getNext());
        }
        else{
            n.setNext(null);
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
