import java.util.*;

public class area {
    public static void Square_number(int a){
        System.out.println("Square of the number: " + (a*a));
    }
    public static void cube_number(int a){
        System.out.println("Cube of the number: " + (a*a*a));
    }   
    public static void Triangle_area(int b, int h){
        System.out.println("Area of Triangle: " + (0.5*b*h));
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number to find square and cube: ");
        int a = s.nextInt();
        System.out.println("Enter base of triangle to find area: ");
        int b = s.nextInt();
        System.out.println("Enter height of triangle to find area: ");
        int h = s.nextInt();

        Square_number(a);
        cube_number(a); 
        Triangle_area(b, h);

    }
}