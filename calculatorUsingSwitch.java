import java.util.Scanner;
public class calculatorUsingSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();

        System.out.print("Enter the operation (+, -, *, /): ");
        char op = sc.next().charAt(0);

        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        switch(op) {
            case '+':
                System.out.println("Result: " + (a + b));
                break;
            case '-':
                System.out.println("Result: " + (a - b));
                break;
            case '*':
                System.out.println("Result: " + (a * b));
                break;
            case '/':
                System.out.println("Result: " + (a / b));
                break;
            default:
                System.out.println("Error: Invalid operation. Please enter +, -, *, or /.");
        }
    }
}
