import java.util.*;

public class tempconvertion {
    public static void clecius (double f){
        double cel = (f - 32) * 5/9;
        System.out.println("Temperature in Celcius: " + cel);
    }

    public static void fahrenheit (double c){
        double fahr = (c * 9/5) + 32;
        System.out.println("Temperature in Fahrenheit: " + fahr);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit: ");
        double f = s.nextDouble();
        System.out.println("Enter temperature in Celcius: ");
        double c = s.nextDouble();

        clecius(f);
        fahrenheit(c);


    }
}