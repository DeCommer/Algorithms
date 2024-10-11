package com.decommer.algorithms;

class SinglyLinkedList {
    // Node class representing each element in the list
    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    private Node head;

    // Add a new node to the end of the list
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode; // If the list is empty, set head to the new node
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next; // Traverse to the end of the list
            }
            current.next = newNode; // Link the new node at the end
        }
    }

    // Remove a node from the list
    public void remove(int data) {
        if (head == null) return; // If the list is empty, do nothing

        // If the head needs to be removed
        if (head.data == data) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next; // Bypass the node to be removed
                return;
            }
            current = current.next;
        }
    }

    // Display the list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println(current);
    }

    // Main method to demonstrate the functionality
    public static void main(String[] args) {

        SinglyLinkedList list = new SinglyLinkedList();
        list.add(10);
        list.add(20);
        list.add(4);
        list.add(19);
        list.add(79);
        list.add(45);

        System.out.print("Linked List: ");
        list.display(); // Output: 10 20 30

        list.remove(20);
        System.out.print("After removing 20: ");
        list.display(); // Output: 10 30
    }
}

