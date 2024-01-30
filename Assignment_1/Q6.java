import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a single word (using next()): ");
        String singleWord = scanner.next();
        System.out.println("You entered: " + singleWord);

        System.out.print("Enter a sentence (using nextLine()): ");

        scanner.nextLine();
        String sentence = scanner.nextLine();
        System.out.println("You entered: " + sentence);

        scanner.close();
    }
}
