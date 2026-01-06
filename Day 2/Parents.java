
import java.util.Scanner;


class parent {
    String name;
    int age;

    parent(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Student name is :" + name);
        System.out.println("Student age is :" + age);
    }

}

class Student extends parent {
    Student( String name, int age){
        super(name, age);
    }
}

public class Parents {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter name : ");
        String name = s.nextLine();
        System.out.println("Enter age : ");
        int age = s.nextInt();
        Student stu = new Student(name, age);
        
    }
}