public class Q3 {


    public static void displayTotalArguments(int... numbers) {
        System.out.println("Total number of arguments: " + numbers.length);
    }


    public static int calculateMax(int... numbers) {
        if (numbers.length == 0) {
            System.out.println("No numbers provided.");
            return Integer.MIN_VALUE; // Return a minimum value to indicate no valid maximum
        }

        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }


    public static int calculateSum(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }


    public static void checkDifferentTypes(Object... args) {
        for (Object arg : args) {
            System.out.println("Argument Type: " + arg.getClass().getName() + ", Value: " + arg);
        }
    }

    public static void main(String[] args) {

        displayTotalArguments(10, 20, 30, 40, 50);


        int maxNumber = calculateMax(15, 8, 30, 22, 17);
        System.out.println("Maximum Number: " + maxNumber);


        int sum = calculateSum(5, 10, 15, 20);
        System.out.println("Sum of Numbers: " + sum);


        checkDifferentTypes(10, "Hello", 3.14, true);
    }
}
