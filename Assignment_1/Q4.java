import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accepting two variables from the user
        System.out.print("Enter the first number: ");
        double firstNumber = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double secondNumber = scanner.nextDouble();

        // Performing arithmetic operations
        double sum = firstNumber + secondNumber;
        double multiplication = firstNumber * secondNumber;
        double subtraction = firstNumber - secondNumber;

        // Displaying the results
        System.out.println("Sum: " + sum);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Subtraction: " + subtraction);

        scanner.close();
    }
}
