public class ClassNotFoundExceptionExample {
    public static void main(String[] args) {
        try {
            // Attempt to load a non-existent class
            Class.forName("com.example.NonExistentClass");
        } catch (ClassNotFoundException e) {
            System.err.println("ClassNotFoundException caught: " + e.getMessage());
        }
    }
}
