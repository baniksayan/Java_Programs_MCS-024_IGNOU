import java.util.Scanner;
public class sumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Taking Input.

        System.out.print("Enter the 1st Number: ");
        int a = sc.nextInt();

        System.out.print("Enter the 2nd Number: ");
        int b = sc.nextInt();

        System.out.print("The sum of "+a+" and "+b+" is : "+ (a+b));
    }
}
