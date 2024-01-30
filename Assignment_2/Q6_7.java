import java.util.Scanner;
import java.util.Arrays;

public class Q6_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] originalArray = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            originalArray[i] = scanner.nextInt();
        }

        System.out.print("Original array: ");
        displayArray(originalArray);

        int[] evenArray = getEvenArray(originalArray);
        int[] oddArray = getOddArray(originalArray);

        System.out.print("Even array: ");
        displayArray(evenArray);

        System.out.print("Odd array: ");
        displayArray(oddArray);

        System.out.print("Enter the position to divide the array: ");
        int position = scanner.nextInt();

        if (position < 0 || position >= size) {
            System.out.println("Invalid position for division.");
        } else {
            int[] splitArray = Arrays.copyOfRange(originalArray, 0, position);
            checkAndDisplayDuplicates(splitArray);
        }

        scanner.close();
    }

    private static void displayArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    private static int[] getEvenArray(int[] array) {
        return Arrays.stream(array).filter(num -> num % 2 == 0).toArray();
    }

    private static int[] getOddArray(int[] array) {
        return Arrays.stream(array).filter(num -> num % 2 != 0).toArray();
    }

    private static void checkAndDisplayDuplicates(int[] array) {
        Arrays.sort(array);
        boolean foundDuplicates = false;

        System.out.println("Duplicate elements in the split array:");

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
                foundDuplicates = true;
                System.out.print(array[i] + " ");
            }
        }

        if (!foundDuplicates) {
            System.out.println("No duplicate elements found in the split array.");
        }
    }
}
