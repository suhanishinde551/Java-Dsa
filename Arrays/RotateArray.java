package Arrays;

public class RotateArray {

    public static void main(String args[]) {

        int[] arr = {10, 20, 30, 40, 50};

        int last = arr[arr.length - 1];

        for(int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = last;

        System.out.println("Array after right rotation:");

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
