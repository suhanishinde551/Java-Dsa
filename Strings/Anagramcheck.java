    package Strings;

import java.util.Scanner;

public class Anagramcheck {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        if(str1.length() != str2.length()) {
            System.out.println("Not an anagram");
            return;
        }

        int[] freq = new int[256];

        for(int i = 0; i < str1.length(); i++) {
            freq[str1.charAt(i)]++;
            freq[str2.charAt(i)]--;
        }

        boolean isAnagram = true;

        for(int i = 0; i < 256; i++) {
            if(freq[i] != 0) {
                isAnagram = false;
                break;
            }
        }

        if(isAnagram)
            System.out.println("Anagram strings");
        else
            System.out.println("Not anagram");

        sc.close();
    }
}


