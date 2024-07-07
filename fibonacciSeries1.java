import java.util.Scanner;
public class fibonacciSeries1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value for, 'n': ");
        int n = sc.nextInt();

        System.out.print("Fibonacci series: ");
        int a = 0, b = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(a+" ");

            int c = a + b;
            a = b;
            b = c;
        }
    }
}
