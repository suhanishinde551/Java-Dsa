package LinkedList;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class RemoveDuplicates {

    Node head;

    // Insert
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

    // Display
    public void display() {
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // Remove duplicates
    public void removeDuplicates(){

        Node temp = head;

        while(temp != null && temp.next != null){

            if(temp.data == temp.next.data){
                temp.next = temp.next.next;  // skip duplicate
            } else {
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {

        RemoveDuplicates list = new RemoveDuplicates();

        list.insert(10);
        list.insert(20);
        list.insert(20);
        list.insert(30);
        list.insert(30);
        list.insert(40);

        System.out.println("Original List:");
        list.display();

        list.removeDuplicates();

        System.out.println("After removing duplicates:");
        list.display();
    }
}