import java.util.Scanner;
public class patternPrinting12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the value: ");
        int r = sc.nextInt();

        for (int i = 1; i <=r; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print((char)(i+64) +" ");
            }
            System.out.println();
        }
    }
}
