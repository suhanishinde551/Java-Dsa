package Arrays;

public class MergeSortedArrays {

    public static void main(String[] args) {

        int[] arr1 = {1,3,5};
        int[] arr2 = {2,4,6};

        int n1 = arr1.length;
        int n2 = arr2.length;

        int[] merged = new int[n1 + n2];

        int i = 0, j = 0, k = 0;

        while(i < n1 && j < n2) {

            if(arr1[i] < arr2[j]) {
                merged[k] = arr1[i];
                i++;
            } else {
                merged[k] = arr2[j];
                j++;
            }
            k++;
        }

        while(i < n1) {
            merged[k] = arr1[i];
            i++;
            k++;
        }

        while(j < n2) {
            merged[k] = arr2[j];
            j++;
            k++;
        }

        System.out.println("Merged Array:");

        for(int num : merged) {
            System.out.print(num + " ");
        }
    }
}