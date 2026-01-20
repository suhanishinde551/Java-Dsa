package Arrays;

public class Arraybasic {
    public static void reverse(int[] arr) {
        int first=0;
        int last=arr.length-1;
        while(first<last){
            int temp=arr[first];
            arr[first]=arr[last];
            arr[last]=temp;
            first++;
            last--;

        }
    }
    
    public static void evenoddcount(int arr[]){
        int evencount=0;
        int oddcount=0;
        if(arr.length==0){
            System.out.println("Array is empty");
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                evencount++;
            }
            else{
                oddcount++;
            }
        }
        System.out.println("Even count: " + evencount);
        System.out.println("Odd count: " + oddcount);
    }

    
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 6, 2};
        System.out.println("Original Array:");
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");

        reverse(arr);
        evenoddcount(arr);
        System.out.println("Reversed Array:");
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");


    }
    
}
