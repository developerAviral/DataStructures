package com.aviral.stack;

public class DynamicStack {
    int capacity = 2;
    int[] stack = new int[capacity];

    int top = 0;
    public void push(int data){
        if(size() >= capacity){
            expand();
        }
        stack[top++] = data;
    }

    public void pop(){
        if(top <= 0){
            System.out.println("Stack is empty!!");
            return;
        }
        stack[--top] = 0;
        shrink();
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

    private void expand(){
        int length = size();
        capacity *= 2;
        int[] newStack = new int[capacity];
        System.arraycopy(stack,0,newStack,0,length);
        stack = newStack;
    }

    private void shrink(){
        int length = size();
        if(length<= (capacity/2)/2){
            capacity = capacity/2;
        }
        int[] newStack = new int[capacity];
        System.arraycopy(stack,0,newStack,0,length);
        stack = newStack;
    }
    public void show(){
        for(int i =0 ; i < stack.length ; i++){
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
}
