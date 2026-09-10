import java.util.Scanner;

// Custom exception
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class StudentEligibility {

    // Separate method using throws
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18 || age > 60) {
            throw new InvalidAgeException("Invalid age: " + age);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter student age: ");
        int age = sc.nextInt();

        try {
            // Nested try-catch
            try {
                checkAge(age);

                System.out.println(name + " is eligible for admission.");

            } catch (InvalidAgeException e) {
                System.out.println("Inner Catch: " + e.getMessage());
            }

        } catch (Exception e) {
            System.out.println("Outer Catch: " + e.getMessage());

        } finally {
            System.out.println("Eligibility checking completed.");
        }

        sc.close();
    }
}
