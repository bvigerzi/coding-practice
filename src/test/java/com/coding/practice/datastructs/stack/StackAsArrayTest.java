package com.coding.practice.datastructs.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StackAsArrayTest {

    @Test
    void pop_noElements() {
        StackAsArray s = new StackAsArray();
        assertThrows(RuntimeException.class, s::pop);
    }

    @Test
    void pop_element() {
        StackAsArray s = new StackAsArray();
        s.insert(1);
        int result = s.pop();
        assertEquals(1, result);
    }

    @Test
    void pop_multipleElements() {
        StackAsArray s = new StackAsArray();
        s.insert(1);
        s.insert(2);

        int firstElement = s.pop();
        int secondElement = s.pop();

        assertEquals(2, firstElement);
        assertEquals(1, secondElement);
    }

    @Test
    void insert_resizeEvent() {
        StackAsArray s = new StackAsArray();

        for(int i = 1; i < 8; i++ ) {
            s.insert(i);
        }

        for(int i = 7; i > 0; i--) {
            int element = s.pop();
            assertEquals(i, element);
        }
    }
}
