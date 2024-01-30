import java.util.Scanner;

class Q1 {
    int main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the User Message Program!");
        System.out.print("Enter your message: ");
        String userMessage = scanner.nextLine();

        System.out.println("You entered: " + userMessage);

        scanner.close();

        // Return 0 to indicate successful execution (although this won't be used)
        return 0;
    }
}
