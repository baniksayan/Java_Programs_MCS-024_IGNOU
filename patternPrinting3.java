import java.util.Scanner;
public class patternPrinting3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the row's value: ");
        int r = sc.nextInt();

        System.out.print("Please enter the column's value: ");
        int c = sc.nextInt();

        for (int i = 1; i <=c; i++) {
            for (int j= 1; j <= r; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
