public class Q2 {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("Message from command line argument: " + args[0]);
        } else {
            System.out.println("No command line argument provided. Please provide a message.");
        }
    }
}
