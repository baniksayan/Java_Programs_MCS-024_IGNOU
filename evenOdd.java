//Write a Java program that checks if a given number is even or odd.
//Print "Even" if it's even, and "Odd" if it's odd.
import java.util.Scanner;
public class evenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Input.

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n%2 == 0) {
            System.out.println("Even number."); //Output.
        }
        else if (n%2 == 1) {
            System.out.println("Odd number."); //Output.
        }
    }
}
