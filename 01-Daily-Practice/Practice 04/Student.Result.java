package student;

class Result {
    public void displayResult() {
        System.out.println("Name: Arun");
        System.out.println("Marks: 85");
        System.out.println("Grade: A");
    }
}

public class Main {
    public static void main(String[] args) {
        Result r = new Result();
        r.displayResult();
    }
}
