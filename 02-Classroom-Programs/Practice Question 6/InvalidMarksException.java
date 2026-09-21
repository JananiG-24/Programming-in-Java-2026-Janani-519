import java.util.Scanner;

class c extends Exception {
    public InvalidMarksException(String message) {
        super(message);
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student's marks: ");
        int marks = sc.nextInt();

        try {
            if (marks < 0 || marks > 100) {
                throw new InvalidMarksException("Invalid marks! Marks must be between 0 and 100.");
            }

            System.out.println("Student's marks: " + marks);

        } catch (InvalidMarksException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
