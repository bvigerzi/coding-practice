package com.coding.practice.datastructs.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimalBinTreeTest {

    @Test
    void toBinTree_perfectlyBalanced() {
        int[] arr = new int[] {1,2,3,5,6,7,8};
        BinNode<Integer> root = MinimalBinTree.toBinTree(arr);
        assertEquals(5, root.getDatum());
        assertEquals(2, root.getLeft().getDatum());
        assertEquals(7, root.getRight().getDatum());
        assertEquals(1, root.getLeft().getLeft().getDatum());
        assertEquals(3, root.getLeft().getRight().getDatum());
        assertEquals(6, root.getRight().getLeft().getDatum());
        assertEquals(8, root.getRight().getRight().getDatum());
    }

    @Test
    void toBinTree_unbalanced() {
        int[] arr = new int[] {1,2,3,5,6,7};
        BinNode<Integer> root = MinimalBinTree.toBinTree(arr);
        assertEquals(5, root.getDatum());
        assertEquals(2, root.getLeft().getDatum());
        assertEquals(7, root.getRight().getDatum());
        assertEquals(1, root.getLeft().getLeft().getDatum());
        assertEquals(3, root.getLeft().getRight().getDatum());
        assertEquals(6, root.getRight().getLeft().getDatum());
    }
}
