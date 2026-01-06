


public class Employee {
    String Empname;
    int EmpId;
    static int Salary;

    public Employee(String Empname, int EmpId, int Salary) {
        this.Empname = Empname;
        this.EmpId = EmpId;
        this.Salary = Salary;
    }

    public static void Calculate_bonus() {
        double bonus = Salary * 0.52;
        double salary = Salary + bonus;
        System.out.println("bonus Salary :" + bonus);
        System.out.println("Updated salary :" + salary);
    }
    public static void main(String[] args) {
        Employee emp = new Employee("Surya",101,20000);
        emp.Calculate_bonus();
    }
}