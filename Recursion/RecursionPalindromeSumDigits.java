package Recursion;

import java.util.Scanner;

public class  RecursionPalindromeSumDigits {

    public static int sumOfDigits(int n) {
        if (n == 0) return 0;
        return n % 10 + sumOfDigits(n / 10);
    }

    public static boolean isPalindrome(String str, int start, int end) {
        if (start >= end) return true;
        if (str.charAt(start) != str.charAt(end)) return false;
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Day 18 – Recursion Practice");

        System.out.print("Enter number to find sum of digits: ");
        int num = sc.nextInt();
        System.out.println("Sum of digits: " + sumOfDigits(num));

        sc.nextLine();

        System.out.print("Enter string to check palindrome: ");
        String input = sc.nextLine();
        System.out.println("Is Palindrome: " + 
            isPalindrome(input, 0, input.length() - 1));

        sc.close();
    }
}