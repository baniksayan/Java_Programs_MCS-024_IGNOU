import java.util.Scanner;
public class patternPrinting20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the value: ");
        int r = sc.nextInt();

        for (int i = 1; i <=r; i++) {
            int a = 1;
            for (int j = 1; j <=i ; j++) {
                System.out.print( a+ " ");
            a += 2;
            }
            System.out.println();
        }
    }
}
