import java.util.Scanner;

// Interface
interface Factorial {
    int calculate(int n);
}

// Class implementing the interface
class FactorialCalculator implements Factorial {

    public int calculate(int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        FactorialCalculator obj = new FactorialCalculator();

        System.out.println("Factorial of " + n + " = " + obj.calculate(n));

        sc.close();
    }
}
