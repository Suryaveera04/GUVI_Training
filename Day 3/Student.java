import java.util.Scanner;

public class Student {

    private String name;
    private int sub1;
    private int sub2;
    private int sub3;
    public Student(String name, int sub1, int sub2, int sub3) {
        this.name = name;
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Subject 1 Marks: " + sub1);
        System.out.println("Subject 2 Marks: " + sub2);
        System.out.println("Subject 3 Marks: " + sub3);
    }


    void displayTotal() {
        int total = sub1 + sub2 + sub3;
        System.out.println("Total Marks: " + total);
        double percentage = total / 3.0; 
        System.out.printf("Percentage: %.2f%%\n", percentage);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello, Student!");

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter Subject 1 Marks: ");
        int sub1 = readInt(sc);

        System.out.print("Enter Subject 2 Marks: ");
        int sub2 = readInt(sc);

        System.out.print("Enter Subject 3 Marks: ");
        int sub3 = readInt(sc);

        Student student = new Student(name, sub1, sub2, sub3);
        System.out.println();
        student.displayDetails();
        student.displayTotal();

        sc.close();
    }


    private static int readInt(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.print("Please enter a valid integer: ");
            sc.next();
        }
        return sc.nextInt();
    }
}