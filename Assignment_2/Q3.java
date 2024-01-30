import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the size of the array: ");
        int sizeOfArray = scanner.nextInt();
        int[] array = new int[sizeOfArray];


        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < sizeOfArray; i++) {
            array[i] = scanner.nextInt();
        }


        System.out.print("Original array: ");
        displayArray(array);


        System.out.print("Enter the index for deletion: ");
        int loc = scanner.nextInt();


        if (loc < 0 || loc >= sizeOfArray) {
            System.out.println("Invalid index for deletion.");
            return;
        }


        deleteElement(array, sizeOfArray, loc);


        System.out.print("Array after deletion: ");
        displayArray(array);

        scanner.close();
    }


    private static void displayArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }


    private static void deleteElement(int[] array, int size, int loc) {
        // Shift elements to fill the gap created by deletion
        for (int i = loc; i < size - 1; i++) {
            array[i] = array[i + 1];
        }

        array[size - 1] = 0;
    }
}
