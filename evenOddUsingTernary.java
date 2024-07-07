import java.util.Scanner;
public class evenOddUsingTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Input.

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println((n%2==0) ? "Even number." : "Odd number.");

//        if (n%2 == 0) {
//            System.out.println("Even number."); //Output.
//        }
//        else if (n%2 == 1) {
//            System.out.println("Odd number."); //Output.
//        }
    }
}
