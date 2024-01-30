import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        System.out.println("Enter the elements of the array:");
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Original array: ");
        displayArray(array);

        System.out.print("Peak element(s): ");
        findAndDisplayPeakElements(array);

        scanner.close();
    }

    private static void displayArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    private static void findAndDisplayPeakElements(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (isPeak(array, i)) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }

    private static boolean isPeak(int[] array, int index) {
        int size = array.length;

        boolean leftNeighbor = index == 0 || array[index] >= array[index - 1];
        boolean rightNeighbor = index == size - 1 || array[index] >= array[index + 1];

        return leftNeighbor && rightNeighbor;
    }
}
