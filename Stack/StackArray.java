package Stack;

import java.util.Scanner;

public class StackArray {

    int top = -1;
    int size;
    int[] stack;

    StackArray(int size) {
        this.size = size;
        stack = new int[size];
    }

    // Push
    public void push(int value) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
            return;
        }

        stack[++top] = value;
        System.out.println(value + " pushed");
    }

    // Pop
    public void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return;
        }

        System.out.println(stack[top] + " popped");
        top--;
    }

    // Peek
    public void peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }

        System.out.println("Top element: " + stack[top]);
    }

    // Display
    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }

        System.out.println("Stack elements:");
        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter stack size: ");
        int size = sc.nextInt();

        StackArray s = new StackArray(size);

        int choice;

        do {
            System.out.println("\n1.Push  2.Pop  3.Peek  4.Display  5.Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    int val = sc.nextInt();
                    s.push(val);
                    break;

                case 2:
                    s.pop();
                    break;

                case 3:
                    s.peek();
                    break;

                case 4:
                    s.display();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 5);
    }
}