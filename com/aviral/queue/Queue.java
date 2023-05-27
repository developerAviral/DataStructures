package com.aviral.queue;

import javax.sound.midi.Soundbank;

public class Queue {
    int capacity = 5;
    int[] queue = new int[capacity];
    private int size = 0;
    private int front = 0;
    private int rear = 0;

    public void enqueue(int data){
        if(!isFull()){
            queue[rear] = data;
            rear = (rear + 1) %capacity;
            size++;
        }
        else{
            System.out.println("Queue is Full!!");
        }
    }

    public void dequeue(){
        if(!isEmpty()) {
            int data = queue[front];
            front = (front + 1) % capacity;
            size = size - 1;
            System.out.println("Data deleted: " + data);
        }
        else {
            System.out.println("Queue is empty !!");
        }
    }

    public int getSize(){
        return size;
    }
    public boolean isEmpty(){
        return getSize() == 0;
    }

    public boolean isFull(){
        return getSize() == capacity;
    }

    public void show(){
        for(int i =0 ; i< size; i++){
            System.out.print(queue[(i + front)%capacity] + " ");
        }
        System.out.println("");
    }
}
