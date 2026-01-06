/* Write a program to check whether a character is a vowel or consonant.*/

import java.util.*;

public class alphabets {
    public static void check_vowel_or_consonant(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is a vowel");
        } else {
            System.out.println(ch + " is a consonant");
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch = s.next().charAt(0);
        check_vowel_or_consonant(ch);
    }
}