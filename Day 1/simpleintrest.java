// Write a program to calculate simple interest and check if interest is above 1000.

import java.util.*;

public class simpleintrest {
    public static void calculate_simple_interest(double principal, double rate, double time) {
        double interest = (principal * rate * time) / 100;
        System.out.println("Simple Interest: " + interest);
        if (interest > 1000) {
            System.out.println("Interest is above 1000");
        } else {
            System.out.println("Interest is not above 1000");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter principal amount: ");
        double principal = s.nextDouble();
        System.out.println("Enter rate of interest: ");
        double rate = s.nextDouble();
        System.out.println("Enter time in years: ");
        double time = s.nextDouble();
        calculate_simple_interest(principal, rate, time);
    }
}
