import java.util.Scanner;
public class patternPrinting13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the value: ");
        int r = sc.nextInt();

        for (int i = 1; i <= r; i++) {
            // Outer loop: iterates through rows from 1 to r
            for (int j = 1; j <= i; j++) {
                // Inner loop: iterates through columns from 1 to i

                if (i % 2 != 0) {
                    // If the row number is odd
                    System.out.print(j + " ");
                } else {
                    // If the row number is even
                    System.out.print((char) (j + 64) + " ");
                }
            }
            // Move to the next line after each row is printed
            System.out.println();
        }
    }
}
