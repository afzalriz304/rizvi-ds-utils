package com.rizvi_ds_utils.linkedlist;

public class Node implements Cloneable {

    public static final String defaultList = "DEFAULT";
    public static final String withLoopList = "WithLoop";
    public static final String reverseList = "reverseList";


    private String type = defaultList;
    private int data;
    private Node next;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Node CreateLinkedList() {

        Node head = new Node();
        head.data = 1;

        // creating second node and attach it to the head
        Node node2 = new Node();
        node2.data = 2;

        // creating third node and attach with the first
        Node node3 = new Node();
        node3.data = 3;

        // creating last node and since it's the last node attach to the null;
        Node node4 = new Node();
        node4.data = 4;

        Node node5 = new Node();
        node5.data = 5;

        Node node6 = new Node();
        node6.data = 6;

        Node node7 = new Node();
        node7.data = 7;

        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = null;
        
        return head;
    }

    @Override
    protected Node clone() throws CloneNotSupportedException {
        Node head = this;
        Node current, prev = null;
        while (head != null) {
            switch (this.type) {
                case withLoopList:

                    break;
                case reverseList:
                    current = head.next;
                    head.next = prev;

                    prev = head;
                    head = current;
                    break;
                default:
                    head = head.next;
            }
        }

        switch (this.type) {
            case reverseList:
                return prev;
            default:
                return head;
        }
    }

    public void printLinkedList(Node root) {
        while (root != null) {
            if (root.next == null)
                System.out.print(root.data + "->NULL");
            else
                System.out.print(root.data + "->");

            root = root.next;
        }
        System.out.println();
    }

    public void reverseList() {
        Node root = this;
        Node current, prev = null;
        while (root != null) {
            current = root.next;
            root.next = prev;

            prev = root;
            root = current;
        }
        root = prev;
        printLinkedList(root);
    }

    public int length(Node head) {
        int len = 0;
        while (head != null) {
            len++;
            head = head.next;
        }
        return len;
    }
}