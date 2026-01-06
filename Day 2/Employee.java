
public class Employee {
    int EmpId;
    String EmpName;

    Employee(int id, String name) {
        this.EmpId = id;
        this.EmpName = name;
        System.out.println("Employee object has been created Successfully.");
        System.out.println("Employee ID: " + EmpId);
        System.out.println("Employee Name: " + EmpName);
    }
    public static void main(String[] args) {
        Employee emp = new Employee(101, "John Doe");
    }
}