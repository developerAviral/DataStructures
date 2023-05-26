package com.aviral.stack;

public class Stack {
    int [] stck = new int[5];
    int top = 0;
    public void push(int data){
        if(top == stck.length){
            System.out.println("Stack is full!!");
            return;
        }
        stck[top++] = data;
    }

    public void pop(){
        if(top <= 0){
            System.out.println("Stack is empty!!");
            return;
        }
        stck[--top] = 0;
    }

    public boolean isEmpty(){
        if(top <=0){
            return true;
        }
        return false;
    }

    public int size(){
        return top;
    }

    public void show(){
        for(int i =0 ; i < stck.length ; i++){
            System.out.print(stck[i] + " ");
        }
        System.out.println();
    }
}
