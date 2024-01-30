import java.util.Scanner;

public class Q1 {


    public static double calculateArea(double length, double width) {
        return length * width;
    }


    public static double calculatePerimeter(double length, double width) {
        return 2 * (length + width);
    }


    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }


    public static double calculateCircumference(double radius) {
        return 2 * Math.PI * radius;
    }


    public static double calculateArea(int side) {
        return side * side;
    }


    public static double calculatePerimeter(int side) {
        return 4 * side;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a shape: ");
        System.out.println("1. Rectangle");
        System.out.println("2. Circle");
        System.out.println("3. Square");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter length and width of the rectangle:");
                double length = scanner.nextDouble();
                double width = scanner.nextDouble();
                System.out.println("Area: " + calculateArea(length, width));
                System.out.println("Perimeter: " + calculatePerimeter(length, width));
                break;

            case 2:
                System.out.println("Enter the radius of the circle:");
                double radius = scanner.nextDouble();
                System.out.println("Area: " + calculateArea(radius));
                System.out.println("Circumference: " + calculateCircumference(radius));
                break;

            case 3:
                System.out.println("Enter the side length of the square:");
                int side = scanner.nextInt();
                System.out.println("Area: " + calculateArea(side));
                System.out.println("Perimeter: " + calculatePerimeter(side));
                break;

            default:
                System.out.println("Invalid choice");
        }

        scanner.close();
    }
}
