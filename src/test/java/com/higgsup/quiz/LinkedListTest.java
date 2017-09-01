package com.higgsup.quiz;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {
    @Test
    public void testInsertStart() {
        LinkedList linkedList = new LinkedList();
        Node first = new Node(1);
        linkedList.insertFirst(first);
        Assert.assertEquals(linkedList.getSize(), 1);
        Assert.assertEquals(linkedList.getStart(), first);
        Assert.assertEquals(linkedList.getEnd(), first);
        linkedList.display();
    }

    @Test
    public void testInsertStartWhenLinkedListExistItem() {
        LinkedList linkedList = new LinkedList();
        Node node = new Node(1);
        linkedList.insertFirst(node);
        Assert.assertEquals(linkedList.getSize(), 1);
        Node first = new Node(0);
        linkedList.insertFirst(first);
        Assert.assertEquals(linkedList.getSize(), 2);
        Assert.assertEquals(linkedList.getStart(), first);
        Assert.assertEquals(linkedList.getEnd(), node);
        linkedList.display();
    }

    @Test
    public void testInsertEnd() {
        LinkedList linkedList = new LinkedList();
        Node first = new Node(1);
        linkedList.insertFirst(first);
        Assert.assertEquals(linkedList.getSize(), 1);
        Assert.assertEquals(linkedList.getStart(), first);
        Assert.assertEquals(linkedList.getEnd(), first);
        linkedList.display();
    }

    @Test
    public void testInsertEndWhenLinkedListExistItem() {
        LinkedList linkedList = new LinkedList();
        Node node = new Node(1);
        linkedList.insertFirst(node);
        Assert.assertEquals(linkedList.getSize(), 1);
        Node end = new Node(0);
        linkedList.insertEnd(end);
        Assert.assertEquals(linkedList.getSize(), 2);
        Assert.assertEquals(linkedList.getStart(), node);
        Assert.assertEquals(linkedList.getEnd(), end);
        linkedList.display();
    }

    @Test
    public void testInsertPosFirst() {
        LinkedList linkedList = new LinkedList();
        Node first = new Node(1);
        linkedList.insertNodeAt(first, 0);
        Assert.assertEquals(linkedList.getSize(), 1);
        Assert.assertEquals(linkedList.getStart(), first);
        Assert.assertEquals(linkedList.getEnd(), first);
        linkedList.display();
    }

    @Test
    public void testInsertPosEnd() {
        LinkedList linkedList = new LinkedList();
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        linkedList.insertEnd(node1);
        linkedList.insertNodeAt(node2, 1);
        Assert.assertEquals(linkedList.getSize(), 2);
        Assert.assertEquals(linkedList.getStart(), node1);
        Assert.assertEquals(linkedList.getEnd(), node2);
        linkedList.display();
    }

    @Test
    public void testInsertPosBetween() {
        LinkedList linkedList = new LinkedList();
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        linkedList.insertFirst(first);
        linkedList.insertEnd(third);
        linkedList.insertNodeAt(second, 1);
        Assert.assertEquals(linkedList.getSize(), 3);
        Assert.assertEquals(linkedList.getItemAt(1), second);
        linkedList.display();
    }

    @Test
    public void deleteAll() {
        LinkedList linkedList = new LinkedList();
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        linkedList.insertFirst(node1);
        linkedList.insertFirst(node2);
        linkedList.insertFirst(node3);
        Assert.assertEquals(linkedList.getSize(), 3);
        linkedList.deleteAll();
        Assert.assertEquals(linkedList.getSize(), 0);
        linkedList.display();
    }

}
