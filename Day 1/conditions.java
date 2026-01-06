import java.util.*;

public class conditions {
    public static void positive_or_negative(int n ){
        if(n > 0) {
            System.out.println(n + " is a positive number.");
        } else if (n < 0) {
            System.out.println(n + " is a negative number.");
        } else {
            System.out.println("The number is zero.");
        }
        }
    public static void even_or_odd(int n){
        if(n % 2 == 0) {
            System.out.println(n + " is an even number.");
        } else {
            System.out.println(n + " is an odd number.");
        }
    }
    public static void divisble_5 (int n){
        if ( n % 5 == 0) {
            System.out.println("Number is Divisible with 5");
        }
        else {
            System.out.println("Number is not divisible with 5");
        }

    }
    public static void divisible_10 (int n) {
        if (n %10 == 0){
            System.out.println("The number is multiple of 10");

        }
        else {
            System.out.println("The number is not the multiple of 10");
        }

    }
    public static void Divisible_3_7(int n) {
        if (n % 3 == 0 & n % 7 == 0 ){
            System.out.println("the number divisible with both 3 and 7");
        }
        else {
            System.out.println("the number is not divisible with both 3 and 7");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = s.nextInt();
        positive_or_negative( n );
        even_or_odd(n);
        divisble_5(n);
        divisible_10(n);
        Divisible_3_7(n);




    }
}