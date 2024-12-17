
public class IllegalArgumentExceptionExample {
    int age;

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age must be greater than zero");
        } else {
            this.age = age;
            System.out.println("The person's age is: " + this.age);
        }
    }

    public static void main(String[] args) {
        IllegalArgumentExceptionExample person = new IllegalArgumentExceptionExample();
        person.setAge(10); //Passing positive value to avoid exception
    }
}