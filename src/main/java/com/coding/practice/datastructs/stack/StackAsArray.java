package com.coding.practice.datastructs.stack;

public class StackAsArray {

    private static final int DEFAULT_STACK_SIZE = 5;
    private static final int RESIZE_INCREMENT = 5;
    private int[] stack;

    public StackAsArray() {
        stack = new int[DEFAULT_STACK_SIZE];
    }

    public int pop() {
        int firstEl = stack[0];
        if(firstEl == 0) {
            throw new RuntimeException();
        }
        for(int i = 0; i < stack.length - 1; i++) {
            if(stack[i] == 0) {
                break;
            }
            stack[i] = stack[i+1];
        }
        stack[stack.length - 1] = 0;
        return firstEl;
    }

    public void insert(int item) {
        if(item == 0) {
            throw new RuntimeException();
        }
        if(stack[stack.length - 1] == 0) {
            for(int i = stack.length - 1; i > 0; i--) {
                stack[i] = stack[i - 1];
            }
            stack[0] = item;
        } else {
            int[] resizedArray = new int[stack.length + RESIZE_INCREMENT];
            for(int i = 0; i < stack.length; i++) {
                resizedArray[i + 1] = stack[i];
            }
            resizedArray[0] = item;
            stack = resizedArray;
        }
    }
}
