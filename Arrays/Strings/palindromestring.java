package Arrays.Strings;
import java.util.Scanner;

public class palindromestring {
    


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String reversed = "";

        for(int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }

        if(str.equals(reversed)) {
            System.out.println("It is a palindrome string");
        } else {
            System.out.println("Not a palindrome string");
        }

        sc.close();
    }
}
