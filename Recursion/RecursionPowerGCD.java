package Recursion;

import java.util.Scanner;

public class RecursionPowerGCD {

    public static int power(int x, int n) {
        if (n == 0) return 1;
        return x * power(x, n - 1);
    }

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Day 16 – Recursion Practice");

        System.out.print("Enter base number: ");
        int base = sc.nextInt();
        System.out.print("Enter exponent: ");
        int exponent = sc.nextInt();
        System.out.println(base + "^" + exponent + " = " + power(base, exponent));

        System.out.print("Enter first number for GCD: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number for GCD: ");
        int num2 = sc.nextInt();
        System.out.println("GCD of " + num1 + " and " + num2 + " = " + gcd(num1, num2));

        sc.close();
    }
}