package LinkedList;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MergeSortedLists {

    // Merge function
    public static Node merge(Node head1, Node head2) {

        Node dummy = new Node(-1);
        Node temp = dummy;

        while (head1 != null && head2 != null) {

            if (head1.data < head2.data) {
                temp.next = head1;
                head1 = head1.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
            }

            temp = temp.next;
        }

        // Remaining elements
        if (head1 != null) {
            temp.next = head1;
        } else {
            temp.next = head2;
        }

        return dummy.next;
    }

    // Display
    public static void display(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        // First List
        Node head1 = new Node(10);
        head1.next = new Node(30);
        head1.next.next = new Node(50);

        // Second List
        Node head2 = new Node(20);
        head2.next = new Node(40);
        head2.next.next = new Node(60);

        Node mergedHead = merge(head1, head2);

        System.out.println("Merged Linked List:");
        display(mergedHead);
    }
}