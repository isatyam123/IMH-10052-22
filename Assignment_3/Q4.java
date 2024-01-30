import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();
        scanner.close();


        String lowercaseString = inputString.toLowerCase();
        System.out.println("Converted to lowercase: " + lowercaseString);


        displayStringLength(inputString);
    }


    private static void displayStringLength(String... strings) {
        for (String str : strings) {
            System.out.println("Total length of the string: " + str.length());
        }
    }
}
