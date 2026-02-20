package Strings;
import java.util.Scanner;
public class FirstNonRepeating {
    




    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine().toLowerCase();

        int[] freq = new int[256];

        // Count frequency
        for(int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        char result = ' ';
        boolean found = false;

        // Find first character with frequency 1
        for(int i = 0; i < str.length(); i++) {
            if(freq[str.charAt(i)] == 1) {
                result = str.charAt(i);
                found = true;
                break;
            }
        }

        if(found)
            System.out.println("First non-repeating character: " + result);
        else
            System.out.println("No non-repeating character found");

        sc.close();
    }
}

