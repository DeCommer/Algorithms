package com.decommer.algorithms;

public class SinglyLinkedLists {

    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while(current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("end");
    }

    public static int countNodes(ListNode head) {
        int count = 0;
        ListNode current = head;
        while(current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public static void main(String[] args) {
        SinglyLinkedLists sll = new SinglyLinkedLists();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(4);
        ListNode third = new ListNode(19);
        ListNode fourth = new ListNode(79);
        ListNode fifth = new ListNode(45);
        
        sll.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        
        printList(sll.head);
        System.out.printf("Number of nodes in list = %d", countNodes(sll.head));
    }
}
