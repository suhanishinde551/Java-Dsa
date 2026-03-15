package LinkedList;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DetectLoop {

    Node head;

    // Insert node
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

    // Create loop manually (for testing)
    public void createLoop() {

        if (head == null) return;

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = head.next;  // creating loop
    }

    // Detect loop
    public boolean detectLoop() {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        DetectLoop list = new DetectLoop();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        list.createLoop(); // create loop

        if (list.detectLoop()) {
            System.out.println("Loop detected in Linked List");
        } else {
            System.out.println("No loop detected");
        }
    }
}