package com.bootcoding.java.linkedList;

public class  InsertionNode {
    public static void main(String[] args) {
        Node head = createDummyList();
        printList(head);
        lastInsertNode(head);
        System.out.println("After Last Insert");
        printList(head);
      head = firstInsertNode(head);
        System.out.println("After first insert");
       printList(head);

    }
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    private static  Node firstInsertNode(Node head){
        Node newNode = new Node(100);
        newNode.next = head;
        head = newNode;
       return head;
    }
    private static void lastInsertNode(Node head){
        Node temp = head;
        Node fifithnode = new Node(50);
        System.out.println(head);
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = fifithnode;
    }

    public static void printList(Node head){
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    private static Node createDummyList(){
        Node firstNode = new Node(10);
        Node secondNode = new Node(20);
        Node thirdNode = new Node(30);
        Node forthNode = new Node(40);


        Node head = firstNode;
        head.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = forthNode;

        return head;
    }

}
