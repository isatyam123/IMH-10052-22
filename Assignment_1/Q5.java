import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accepting a double value from the user
        System.out.print("Enter a double value: ");
        double doubleValue = scanner.nextDouble();

        // Accepting a long value from the user
        System.out.print("Enter a long value: ");
        long longValue = scanner.nextLong();

        // Performing type casting
        float floatValue = (float) doubleValue; // Type casting double to float
        long longFromDouble = (long) doubleValue; // Type casting double to long
        int intFromLong = (int) longValue; // Type casting long to int

        // Displaying the results
        System.out.println("Original double value: " + doubleValue);
        System.out.println("Float value after type casting: " + floatValue);
        System.out.println("Original long value: " + longValue);
        System.out.println("Long value from double after type casting: " + longFromDouble);
        System.out.println("Int value from long after type casting: " + intFromLong);

        scanner.close();
    }
}
