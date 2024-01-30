import java.util.Scanner;

public class Q1_2 {
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


        System.out.print("Enter the position for insertion: ");
        int position = scanner.nextInt();


        if (position < 0 || position > sizeOfArray) {
            System.out.println("Invalid position for insertion.");
            return;
        }

        System.out.print("Enter the element to be inserted: ");
        int element = scanner.nextInt();


        insertElement(array, sizeOfArray, position, element);


        System.out.print("Array after insertion: ");
        displayArray(array);

        scanner.close();
    }


    private static void displayArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }


    private static void insertElement(int[] array, int size, int position, int element) {

        for (int i = size - 1; i >= position; i--) {
            array[i] = array[i - 1];
        }


        array[position] = element;
    }
}
