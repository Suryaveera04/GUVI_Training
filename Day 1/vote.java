
import java.util.Scanner;


public class vote{
    public static void check_vote(int age) {
        if (age >= 18 ) {
            System.out.println("Eligible for vote");
        }
        else {
            System.out.println("Not Eligible for vote");
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = s.nextInt();
        check_vote(age);
    }
}