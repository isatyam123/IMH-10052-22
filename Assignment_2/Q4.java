import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        System.out.println("Enter the elements of the array:");
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the element to search: ");
        int element = scanner.nextInt();

        int index = searchElement(array, element);

        if (index != -1) {
            System.out.println("Element " + element + " found at index " + index + " in the array.");
        } else {
            System.out.println("Element " + element + " not found in the array.");
        }

        scanner.close();
    }

    private static int searchElement(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1;
    }
}
