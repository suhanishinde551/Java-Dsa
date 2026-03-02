package Recursion;

import java.util.Scanner;

public class RecursionArrayReverseSearch {

    public static void reverseArray(int[] arr, int start, int end) {
        if (start >= end) return;

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        reverseArray(arr, start + 1, end - 1);
    }

    public static int linearSearch(int[] arr, int index, int target) {
        if (index == arr.length) return -1;
        if (arr[index] == target) return index;
        return linearSearch(arr, index + 1, target);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        reverseArray(arr, 0, n - 1);

        System.out.println("Reversed array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println();
        System.out.print("Enter element to search: ");
        int target = sc.nextInt();

        int result = linearSearch(arr, 0, target);

        if (result == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index: " + result);

        sc.close();
    }
}