import java.util.Scanner;
public class calculatorUsingIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();

        System.out.print("Enter the operation (+, -, *, /): ");
        char op = sc.next().charAt(0);

        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        // Calculation and Output
        if (op == '+') {
            System.out.println("Result: " + (a + b));
        } else if (op == '-') {
            System.out.println("Result: " + (a - b));
        } else if (op == '*') {
            System.out.println("Result: " + (a * b));
        } else if (op == '/') {
            if (b != 0) {
                System.out.println("Result: " + (a / b));
            } else {
                System.out.println("Error: Division by zero is not allowed.");
            }
        } else {
            System.out.println("Error: Invalid operation. Please enter +, -, *, or /.");
        }
    }
}
