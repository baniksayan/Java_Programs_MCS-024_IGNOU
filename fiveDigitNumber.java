import java.util.Scanner;
public class fiveDigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if(n > 9999 && n < 100000) {
            System.out.println("5 Digit Number.");
        } else {
            System.out.println("Not a 5 Digit Number.");
        }
    }
}
