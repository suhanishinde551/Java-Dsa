package LinkedList;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ReverseLinkedList {

    Node head;

    // Insert at end
    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // Display linked list
    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // Reverse linked list
    public void reverse() {

        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {

            next = current.next;
            current.next = prev;
            prev = current;
            current = next;

        }

        head = prev;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ReverseLinkedList list = new ReverseLinkedList();

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            System.out.print("Enter value: ");
            int value = sc.nextInt();
            list.insert(value);
        }

        System.out.println("Original Linked List:");
        list.display();

        list.reverse();

        System.out.println("Reversed Linked List:");
        list.display();
    }
}