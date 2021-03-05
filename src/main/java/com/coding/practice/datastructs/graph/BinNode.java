package com.coding.practice.datastructs.graph;

public class BinNode<T> {

    private T datum;
    BinNode<T> left;
    BinNode<T> right;

    public BinNode(T datum) {
        this.datum = datum;
    }

    public T getDatum() {
        return datum;
    }

    public void setDatum(T datum) {
        this.datum = datum;
    }

    public BinNode<T> getLeft() {
        return left;
    }

    public void setLeft(BinNode<T> left) {
        this.left = left;
    }

    public BinNode<T> getRight() {
        return right;
    }

    public void setRight(BinNode<T> right) {
        this.right = right;
    }
}
