
import java.util.Scanner;

public class leapyear {
    public static void check_leapyear(int year) {
        if ( year % 100 == 0) {
            if ( year % 400 == 0){
                System.out.println(year + " is a leap year");
            }
            else {
                System.out.println(year + " is not a leap year");
            }
        }
        else if ( year % 4 == 0) {
            System.out.println(year + " is a leap year");
        }
        else {
            System.out.println(year + " is not a leap year");
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = s.nextInt();
        check_leapyear(year);
    }
}