import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();


        int[] numbers = new int[size];
        System.out.println("Enter " + size + " integers:");

        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }


        int sum = findSum(numbers);
        System.out.println("Sum of values in the array: " + sum);


        displayReverseOrder(sum);

        scanner.close();
    }


    private static int findSum(int... arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }


    private static void displayReverseOrder(int num) {
        String sumString = Integer.toString(num);
        System.out.print("Sum in reverse order: ");
        for (int i = sumString.length() - 1; i >= 0; i--) {
            System.out.print(sumString.charAt(i));
        }
    }
}
