package Arrays;
import java.util.*;

public class BinarySearch {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50, 60};

        System.out.print("Enter element to search: ");
        int target = sc.nextInt();

        int start = 0;
        int end = arr.length - 1;
        boolean found = false;

        while(start <= end){
            int mid = (start + end) / 2;

            if(arr[mid] == target){
                System.out.println("Element found at index: " + mid);
                found = true;
                break;
            }
            else if(arr[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }

        if(!found){
            System.out.println("Element not found");
        }

        sc.close();
    }
}
