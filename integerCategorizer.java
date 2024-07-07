//Write a Java program that categorizes a given integer as positive, negative, or zero.
//Print "Positive," "Negative," or "Zero" accordingly.
import java.util.Scanner;
public class integerCategorizer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an Integer: ");
        int n = sc.nextInt();

        if(n == 0) {
            System.out.println("Uh-oh! It's a Zero.");
        } else if (n >= 1) {
            System.out.println("Oh-ho! It's a Positive Integer.");
        } else if (n <= 1) {
            System.out.println("Mm-hmm! It's a Negative Integer.");
        }
    }
}
