package Recursion;

import java.util.Scanner;

public class RecursionArraySumMax {

    public static int arraySum(int[] arr, int index) {
        if (index == arr.length) return 0;
        return arr[index] + arraySum(arr, index + 1);
    }

    public static int arrayMax(int[] arr, int index) {
        if (index == arr.length - 1) return arr[index];
        return Math.max(arr[index], arrayMax(arr, index + 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Day 19 – Recursion with Arrays");

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Sum of array: " + arraySum(arr, 0));
        System.out.println("Maximum element: " + arrayMax(arr, 0));

        sc.close();
    }
} 
