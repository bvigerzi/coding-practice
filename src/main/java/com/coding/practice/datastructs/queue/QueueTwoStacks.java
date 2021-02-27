package com.coding.practice.datastructs.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class QueueTwoStacks {

    Deque<Integer> currentQueueState = new ArrayDeque<>();
    Deque<Integer> bufferRearrange = new ArrayDeque<>();

    public int pop() {
        if(currentQueueState.size() == 0) {
            throw new RuntimeException();
        }
        currentQueueState.forEach(i -> bufferRearrange.push(i));
        int firstElement = bufferRearrange.pop();
        currentQueueState = new ArrayDeque<>();
        while(bufferRearrange.size() != 0) {
            currentQueueState.push(bufferRearrange.pop());
        }
        return firstElement;
    }

    public void push(int item) {
        currentQueueState.push(item);
    }
}
