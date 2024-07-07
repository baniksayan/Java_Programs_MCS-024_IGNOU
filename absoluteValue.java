import java.util.Scanner;
public class absoluteValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("The absolute value of the entered number is: " + (-number));
        } else {
            System.out.println("The absolute value of the entered number is: " + number);
        }
    }
}
