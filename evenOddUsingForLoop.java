import java.util.Scanner;
public class evenOddUsingForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value for 'n': ");
        int n = sc.nextInt();

        // Check if the number is even or odd
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i+ " is even");
            } else {
                System.out.println(i+ " is odd");
            }
        }
    }
}
