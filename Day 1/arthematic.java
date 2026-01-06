import java.util.*;

public class arthematic {
    public static void add(int a, int b) {
        System.out.println("addition: " + (a+b));
    }

    public static void sub(int a, int b) {
        System.out.println("subtraction: " + (a-b));
    }

    public static void mul(int a, int b) {
        System.out.println("multipication: " + (a*b));
    }

    public static void division(int a, int b) {
        System.out.println("Division: " + (a/b));
    }

    public static void main(String[] args ) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = s.nextInt();
        System.out.println("Enter second number: ");
        int b = s.nextInt();

        add(a, b);
        sub(a, b);
        mul(a, b);
        division(a, b);
        

    }


}
