package com.rizvi_ds_utils.linkedlist;

public class List {
    public static void main(String[] args) throws CloneNotSupportedException {
        Node node = new Node();
        node.setType(Node.defaultList);
        Node head = node.CreateLinkedList();
        node.length(node);
        node.printLinkedList(head);



        /*node.setType(Node.reverseList);
        Node node1 = node.clone();
        node1.printLinkedList(node1);

        Node node2 = node.clone();
        node2.setType(Node.withLoopList);
        node2.CreateLinkedList();*/

    }

}