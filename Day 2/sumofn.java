// sum of n natural numbers

import java.util.*;

public class sumofn {
    public static void sum(int n) {
        int sum = 0;
        /*for (int i = 1; i <= n; i++) {
            sum += i;
        }*/
       while (n > 0) {
           sum += n;
           n--;
       }
        System.out.println("Sum of first " + n + " natural numbers is: " + sum);

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = s.nextInt();
        sum(n);
    }

}