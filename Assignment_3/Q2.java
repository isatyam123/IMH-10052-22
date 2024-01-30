import java.util.Scanner;

public class Q2{


    public static boolean validateUser(String name) {
        return name.matches("[a-zA-Z]+");
    }


    public static boolean validateUser(int age) {
        return age > 3 && age < 15;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = scanner.nextLine();


        if (validateUser(name)) {
            System.out.println("Name is valid.");
        } else {
            System.out.println("Invalid name. Name should contain only alphabets.");
            return;
        }

        System.out.println("Enter your age:");
        int age = scanner.nextInt();


        if (validateUser(age)) {
            System.out.println("Age is valid.");
        } else {
            System.out.println("Invalid age. Age should be greater than 3 and less than 15.");
        }

        scanner.close();
    }
}
