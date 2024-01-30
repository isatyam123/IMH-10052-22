import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accepting values of different data types
        System.out.print("Enter an integer: ");
        int intValue = scanner.nextInt();

        System.out.print("Enter a double: ");
        double doubleValue = scanner.nextDouble();

        scanner.nextLine();

        System.out.print("Enter a string: ");
        String stringValue = scanner.nextLine();

        // Displaying the entered values
        System.out.println("Entered integer: " + intValue);
        System.out.println("Entered double: " + doubleValue);
        System.out.println("Entered string: " + stringValue);

        scanner.close();
    }
}
