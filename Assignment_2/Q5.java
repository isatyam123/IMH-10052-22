import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Original array: ");
        displayArray(array);

        findAndPrintDuplicates(array);

        scanner.close();
    }

    private static void displayArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    private static void findAndPrintDuplicates(int[] array) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int value : array) {
            frequencyMap.put(value, frequencyMap.getOrDefault(value, 0) + 1);
        }

        System.out.println("Duplicate elements and their frequency:");

        boolean foundDuplicates = false;

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                foundDuplicates = true;
                System.out.println(entry.getKey() + " - Frequency: " + entry.getValue());
            }
        }

        if (!foundDuplicates) {
            System.out.println("No duplicate elements found.");
        }
    }
}
