package Arrays;
import java.util.*;

public class ArrayLogic {

        public static void main(String args[]){        
        Scanner sc=new Scanner(System.in);
        int[] arr={10,20,30,40,50,60}; 
        

        //Traversing an Array
        for(int i=0;i<arr.length;i++){
            System.out.println("Traversed array elements are:"+arr[i]);
        }

        //Maximum element in array
        int max=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
           
        }
         System.out.println("Maximum element is: "+max);

        //Second Largest Element
        int largest =Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){

            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            }
            else if(arr[i]>secondLargest&&arr[i] !=largest){
                secondLargest=arr[i];
            }
        }
        System.out.println("Second Largest:"+ secondLargest);


        //Check if array is sorted
        boolean isSorted=true;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                isSorted=false;
                break;
           }
        }
        System.out.println("Is array sorted? "+isSorted);
    

        //Frequency of element (example 30)
        int target = 30;
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                count++;
            }
        }
        System.out.println("Frequency of "+target+" is: "+count);
}
}
