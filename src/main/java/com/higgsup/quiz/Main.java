package com.higgsup.quiz;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insertFirst(new Node(1));
        linkedList.display();
        linkedList.insertEnd(new Node(2));
        linkedList.display();
        linkedList.deleteNode(1);
        linkedList.display();
        linkedList.deleteNode(0);
        linkedList.display();
        linkedList.insertNodeAt(new Node(1), 0);
        linkedList.insertNodeAt(new Node(2), 0);
        linkedList.insertNodeAt(new Node(3), 2);
        linkedList.display();
        linkedList.deleteAll();
        linkedList.display();
    }
}
