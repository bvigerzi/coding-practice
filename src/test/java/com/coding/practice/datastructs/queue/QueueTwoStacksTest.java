package com.coding.practice.datastructs.queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class QueueTwoStacksTest {

    @Test
    void pop_singleElement() {
        QueueTwoStacks q = new QueueTwoStacks();
        q.push(1);
        int result = q.pop();
        assertEquals(1, result);
    }

    @Test
    void pop_multipleElements() {
        QueueTwoStacks q = new QueueTwoStacks();
        for(int i = 1; i < 5; i++) {
            q.push(i);
        }
        for(int i = 1; i < 5; i++) {
            assertEquals(i, q.pop());
        }
    }

    @Test
    void pop_noElements() {
        QueueTwoStacks q = new QueueTwoStacks();
        assertThrows(RuntimeException.class, q::pop);
    }

    @Test
    void pop_push_intertwined() {
        QueueTwoStacks q = new QueueTwoStacks();
        q.push(1);
        q.push(2);
        assertEquals(1, q.pop());
        q.push(3);
        q.push(4);
        q.push(5);
        assertEquals(2, q.pop());
        assertEquals(3, q.pop());
        assertEquals(4, q.pop());
        assertEquals(5, q.pop());
        assertThrows(RuntimeException.class, q::pop);
        q.push(6);
        assertEquals(6, q.pop());
    }
}
