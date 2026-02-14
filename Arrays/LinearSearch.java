package Arrays;
import java.util.*;

public class LinearSearch {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50, 60};

        System.out.print("Enter number to search: ");
        int key = sc.nextInt();

        boolean found = false;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == key) {
                System.out.println("Element found at index: " + i);
                found = true;
                break;
            }
        }

        if(found == false) {
            System.out.println("Element not found in array");
        }
    }
}
