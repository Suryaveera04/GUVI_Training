import java.util.*;

public class student {
    public static void pass_or_fail(int marks) {
        if (marks >= 33) {
            System.out.println("Student has passed");
        } else {
            System.out.println("Student has failed");
        }
    }
    public static void grade(int marks) {
        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 80) {
            System.out.println("Grade: B");
        } else if (marks >= 70) {
            System.out.println("Grade: C");
        } else if (marks >= 60) {
            System.out.println("Grade: D");
        } else if (marks >= 50) {
            System.out.println("Grade: E");
        } else {
            System.out.println("Grade: F");
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the marks obtained by the student: ");
        int marks = s.nextInt();
        pass_or_fail(marks);
        grade(marks);
    }
}