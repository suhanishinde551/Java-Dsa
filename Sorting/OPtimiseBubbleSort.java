package Sorting;
import java.util.Scanner;
public class OPtimiseBubbleSort {






    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Optimized Bubble Sort
        for(int i = 0; i < n - 1; i++) {

            boolean swapped = false;

            for(int j = 0; j < n - i - 1; j++) {

                if(arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            // If no swap happened, array is already sorted
            if(!swapped) {
                break;
            }
        }

        System.out.println("Sorted array:");

        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}

