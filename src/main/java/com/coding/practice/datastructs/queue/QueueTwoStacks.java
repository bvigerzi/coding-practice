package com.coding.practice.datastructs.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class QueueTwoStacks {

    Deque<Integer> currentQueueState = new ArrayDeque<>();
    Deque<Integer> bufferRearrange = new ArrayDeque<>();

    public int pop() {
        if(currentQueueState.isEmpty()) {
            throw new RuntimeException();
        }
        currentQueueState.forEach(i -> bufferRearrange.push(i));
        int firstElement = bufferRearrange.pop();
        currentQueueState = new ArrayDeque<>();
        while(!bufferRearrange.isEmpty()) {
            currentQueueState.push(bufferRearrange.pop());
        }
        return firstElement;
    }

    public void push(int item) {
        currentQueueState.push(item);
    }
}
