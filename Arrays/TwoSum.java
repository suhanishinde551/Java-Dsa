package Arrays;
import java.util.*;

public class TwoSum {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target sum: ");
        int target = sc.nextInt();

        boolean found = false;

        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {

                if(arr[i] + arr[j] == target) {
                    System.out.println("Pair found: " + arr[i] + " and " + arr[j]);
                    found = true;
                    break;
                }
            }
            if(found) break;
        }

        if(!found) {
            System.out.println("No pair found");
        }

        sc.close();
    }
}
