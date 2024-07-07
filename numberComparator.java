//Create a program that takes two numbers as input and determines which one is larger.
//Print the larger number.
import java.util.Scanner;
public class numberComparator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Input.

        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();

        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();

        if (a>b) {
            System.out.println(a+" is, Larger than "+b);
        }
        else if (b>a) {
            System.out.println(b+" is, Larger than "+a);
        }
    }
}
