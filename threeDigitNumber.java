import java.util.Scanner;
public class threeDigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if(99<n && n<1000) {
            System.out.println("3 Digit Number.");
        } else {
            System.out.println("Not a 3 Digit Number.");
        }
    }
}
