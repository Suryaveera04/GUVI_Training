// write a java code to do calculator operations like addition, subtraction, multiplication and division using switch case.


import java.util.*;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter first number:");
        double num1 = scanner.nextDouble();
        
        System.out.println("Enter second number:");
        double num2 = scanner.nextDouble();
        
        System.out.println("Choose an operation: +, -, *, /");
        char operation = scanner.next().charAt(0);
        
        double result;
        
        switch (operation) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Error: Invalid operation.");
                break;
        }
        
        scanner.close();
    }
}