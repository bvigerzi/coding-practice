package com.coding.practice.datastructs.lists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class DeleteMiddleOfListTest {

    @Test
    void test_deleteMiddleOfList() {
        Node<String> head = new Node<>("a");
        Node<String> b = new Node<>("b");
        Node<String> c = new Node<>("c");
        Node<String> d = new Node<>("d");
        Node<String> e = new Node<>("e");
        head.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;
        DeleteMiddleOfList.deleteMiddle(c, head);

        assertEquals(head.next, b);
        assertEquals(b.next, d);
        assertEquals(d.next, e);
        assertNull(e.next);
    }
}
