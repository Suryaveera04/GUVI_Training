class Person {
    static int passingmarks = 40;  // percentage threshold
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student1 extends Person {
    int sub1, sub2, sub3;

    Student1(String name, int age, int sub1, int sub2, int sub3) {
        super(name, age);
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;

        int total_marks = sub1 + sub2 + sub3;
        double percentage = (total_marks / 300.0) * 100;

        if (percentage >= passingmarks) {
            System.out.println("Student is pass");
        } else {
            System.out.println("Student is fail");
        }

        System.out.println("Total Marks: " + total_marks);
        System.out.println("Percentage: " + percentage);
    }

    public static void main(String[] args) {
        Student1 s = new Student1("Aliec", 20, 94, 98, 85);
    }
}