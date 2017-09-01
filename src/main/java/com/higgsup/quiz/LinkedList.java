package com.higgsup.quiz;

public class LinkedList {
    private Node start;
    private Node end;
    private int size;

    public LinkedList() {
    }

    public void insertNodeAt(Node node, int pos) {
        if (pos > size) {
            throw new IndexOutOfBoundsException("The position out of bound");
        }
        if (pos == 0) {
            insertFirst(node);
            return;
        }

        if (pos == size) {
            insertEnd(node);
            return;
        }

        Node currentNode = start;
        for (int i = 1; i < size; i++) {
            if (i == pos) {
                node.setLink(currentNode.getLink());
                currentNode.setLink(node);
                break;
            }
            currentNode = currentNode.getLink();
        }
        size++;
    }

    public void insertEnd(Node node) {
        size += 1;
        if (end == null) {
            start = node;
            end = node;
        } else {
            end.setLink(node);
            this.end = node;
        }
    }

    public void insertFirst(Node node) {
        size += 1;
        if (start == null) {
            start = node;
            end = node;
        } else {
            node.setLink(this.start);
            this.start = node;
        }
    }

    public void deleteNode(int pos) {
        if (pos > size - 1) {
            throw new IndexOutOfBoundsException("The position out of bound");
        }
        if (pos == 0) {
            this.start = start.getLink();
        } else {
            Node preNode = this.start;
            for (int i = 1; i < size; i++) {
                Node currentNode = preNode.getLink();
                if (i == pos) {
                    Node nextNode = currentNode.getLink();
                    if (nextNode == null) {
                        preNode.setLink(null);
                    } else {
                        preNode.setLink(nextNode);
                    }
                    break;
                }
            }
        }
        size--;
    }

    public void deleteAll() {
        Node nodeRemove = this.start;
        while (nodeRemove != null) {
            Node nodeNext = nodeRemove.getLink();
            if (nodeNext != null) {
                nodeRemove.setLink(null);
            }
            nodeRemove = nodeNext;
        }
        this.start = this.end = null;
        size = 0;
    }

    public Node getItemAt(int pos) {
        if (pos > size - 1) {
            throw new IndexOutOfBoundsException("The position out of bound");
        }
        Node currentNode = this.start;
        for (int i = 0; i < size; i++) {
            if (i == pos) {
                return currentNode;
            }
            currentNode = currentNode.getLink();
        }
        return null;
    }

    public Node getStart() {
        return start;
    }

    public void setStart(Node start) {
        this.start = start;
    }

    public Node getEnd() {
        return end;
    }

    public void setEnd(Node end) {
        this.end = end;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void display() {
        if (size == 0) {
            System.out.print("empty\n");
            return;
        }
        if (start.getLink() == null) {
            System.out.println(start.getValue());
            return;
        }
        Node preNode = start;
        System.out.print(start.getValue() + "->");
        preNode = start.getLink();
        while (preNode.getLink() != null) {
            System.out.print(preNode.getValue() + "->");
            preNode = preNode.getLink();
        }
        System.out.print(preNode.getValue() + "\n");
    }
}
