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

public class LinkedListOperations {

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

    // Display list
    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // Search element
    public void search(int key) {
        Node temp = head;
        int position = 1;

        while (temp != null) {
            if (temp.data == key) {
                System.out.println("Element found at position: " + position);
                return;
            }
            temp = temp.next;
            position++;
        }

        System.out.println("Element not found");
    }

    // Delete element
    public void delete(int key) {

        if (head == null)
            return;

        if (head.data == key) {
            head = head.next;
            return;
        }

        Node temp = head;

        while (temp.next != null && temp.next.data != key) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LinkedListOperations list = new LinkedListOperations();

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            System.out.print("Enter value: ");
            int value = sc.nextInt();
            list.insert(value);
        }

        System.out.println("Linked List:");
        list.display();

        System.out.print("Enter element to search: ");
        int searchKey = sc.nextInt();
        list.search(searchKey);

        System.out.print("Enter element to delete: ");
        int deleteKey = sc.nextInt();
        list.delete(deleteKey);

        System.out.println("Linked List after deletion:");
        list.display();
    }
}