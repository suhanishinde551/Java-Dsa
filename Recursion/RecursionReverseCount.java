package Recursion;

import java.util.Scanner;

public class RecursionReverseCount {

    public static int reverseNumber(int n, int rev) {
        if (n == 0) return rev;
        return reverseNumber(n / 10, rev * 10 + n % 10);
    }

    public static int countDigits(int n) {
        if (n == 0) return 0;
        return 1 + countDigits(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Day 17 – Recursion Practice");

        System.out.print("Enter number to reverse: ");
        int num = sc.nextInt();
        System.out.println("Reversed number: " + reverseNumber(num, 0));

        System.out.print("Enter number to count digits: ");
        int num2 = sc.nextInt();
        System.out.println("Number of digits: " + countDigits(num2));

        sc.close();
    }
}