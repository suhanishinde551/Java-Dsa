package Arrays;
import java.util.Scanner;
public class ArrayIntro {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of Array:");
        int n=sc.nextInt();
        int[] a=new int[n];
    
    // Input of array elements
        System.out.println("Enter Array Elements:");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();

        }

    // Output of array elements
        System.out.println("Array Elements are:");
        System.out.print("[");
        for(int i=0;i<n;i++)
        {
            System.out.print(+a[i]+" ");
        }
    System.out.println("]");

    //Sum of all array elements
    int sum =0;
    for (int i =0;i<n;i++)
        {
            sum=sum+a[i];
            
        }
    System.out.println("Sum of Array Elements is: "+sum);

    //Finding largest element in array
    int max=a[0];
    for (int i=0;i<n;i++)
    {
        if(a[i]>max)
        {
            max=a[i];
        }
    }
    System.out.println("Largest Element is: "+max);

    //Finding smallest element in array
    int min=a[0];
    for (int i=0;i<n;i++)
    {
        if(a[i]<min)
        {
            min=a[i];
        }
    }
    System.out.println("Smallest Element is: "+min);

    //Finding average of array elements
    double average=(double)sum/n;   
    System.out.println("Average of Array Elements is: "+average);

    //Reversing an array
    System.out.println("Reversed Array is:");
    System.out.print("[");
    for(int i=n-1;i>=0;i--)
    {
        System.out.print(a[i]+" ");
    }
       System.out.println("]");
    
    sc.close();
}
}
           

