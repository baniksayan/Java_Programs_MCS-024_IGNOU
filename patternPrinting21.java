import java.util.Scanner;
public class patternPrinting21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the value: ");
        int r = sc.nextInt();

        for (int i = 1; i <=r; i++) {
            for (int j = 1; j <=2*i-1; j+=2) {
                System.out.print( j+ " ");
            }
            System.out.println();
        }
    }
}
