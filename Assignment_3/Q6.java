public class Q6 {

   
    public static void display(int x) {
        System.out.println("Method with int parameter: " + x);
    }


    public static void display(double x) {
        System.out.println("Method with double parameter: " + x);
    }


    public static void display(long x) {
        System.out.println("Method with long parameter: " + x);
    }


    public static void display(float x) {
        System.out.println("Method with float parameter: " + x);
    }

    public static void main(String[] args) {

        int intValue = 42;
        double doubleValue = 3.14;
        long longValue = 123456789L;
        float floatValue = 2.5f;

        display(intValue);
        display(doubleValue);
        display(longValue);
        display(floatValue);
    }
}
