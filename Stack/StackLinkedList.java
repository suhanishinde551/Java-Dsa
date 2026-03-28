
package Stack;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class StackLinkedList {

    Node top;

    // Push
    public void push(int data) {
        Node newNode = new Node(data);

        newNode.next = top;
        top = newNode;

        System.out.println(data + " pushed");
    }

    // Pop
    public void pop() {

        if (top == null) {
            System.out.println("Stack Underflow");
            return;
        }

        System.out.println(top.data + " popped");
        top = top.next;
    }

    // Peek
    public void peek() {

        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }

        System.out.println("Top element: " + top.data);
    }

    // Display
    public void display() {

        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }

        Node temp = top;

        System.out.println("Stack elements:");

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        StackLinkedList s = new StackLinkedList();

        s.push(10);
        s.push(20);
        s.push(30);

        s.display();

        s.pop();

        s.peek();
    }
}