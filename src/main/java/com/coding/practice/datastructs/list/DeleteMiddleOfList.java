package com.coding.practice.datastructs.list;

public class DeleteMiddleOfList {

    public static void deleteMiddle(Node<String> toDeleteNode, Node<String> headOfList) {
        Node<String> prevNode = headOfList;
        Node<String> currentNode = headOfList;

        while(currentNode != null) {
            if (currentNode.equals(toDeleteNode)) {
                prevNode.next = currentNode.next;
                break;
            } else {
                prevNode = currentNode;
                currentNode = currentNode.next;
            }
        }
    }
}
