package com.coding.practice.datastructs.graph;

import java.util.Arrays;

public class MinimalBinTree {

    public static BinNode<Integer> toBinTree(int[] arr) {
        if(arr.length == 0) {
            return null;
        }
        if(arr.length == 1) {
            return new BinNode<>(arr[0]);
        }
        int midIndex = arr.length / 2;
        BinNode<Integer> midNode = new BinNode<>(arr[midIndex]);
        int[] leftSubtree = Arrays.copyOfRange(arr, 0, midIndex);
        int[] rightSubtree = Arrays.copyOfRange(arr, midIndex + 1, arr.length);
        midNode.left = toBinTree(leftSubtree);
        midNode.right = toBinTree(rightSubtree);
        return midNode;
    }

}
