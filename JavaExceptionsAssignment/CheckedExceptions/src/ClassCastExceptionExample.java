public class ClassCastExceptionExample {
    public static void main(String[] args) {
        // Step 1: Create an object of a parent class
        Object obj = "This is a string";

        // Step 2: Attempt an invalid cast to an unrelated class
        try {
            Integer number = (Integer) obj; // This will throw ClassCastException
        } catch (ClassCastException e) {
            System.out.println("ClassCastException caught: Invalid type for casting.");
        }
    }
}
