package com.skpakala.datastructures;

public class Stack {

    private int top = -1;
    // private int stackSize = 0;
    private int[] stack;

    /**
     * 
     * @param stackSize
     */
    public Stack(int stackSize) {
        // this.stackSize = stackSize;
        stack = new int[stackSize];
    }

    /**
     * 
     * @param element
     */
    public void push(int element) {
        stack[++top] = element;
    }

    /**
     * 
     * @return
     */
    public int pop() {
        int result = stack[top];
        top--;
        return result;
    }

    /**
     * 
     * @return
     */
    public int peek() {
        return stack[top];
    }

    /**
     * 
     * @return
     */
    public boolean isEmpty() {
        return stack.length > 0 ? true : false;
    }

}