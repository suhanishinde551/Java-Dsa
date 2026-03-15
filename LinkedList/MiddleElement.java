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

public class MiddleElement {

    Node head;

    // Insert node
    public void insert(int data) {
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // Display list
    public void display() {
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // Find middle
    public void findMiddle(){

        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        System.out.println("Middle element is: " + slow.data);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MiddleElement list = new MiddleElement();

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            System.out.print("Enter value: ");
            int val = sc.nextInt();
            list.insert(val);
        }

        System.out.println("Linked List:");
        list.display();

        list.findMiddle();
    }
}