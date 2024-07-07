import java.util.Scanner;
public class volumeOfASphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value for, 'n': ");
        int n = sc.nextInt();

        float pi = 3.14f;
        //int n = 7; // user input.

        double v = (4.0 / 3.0) * pi * n * n * n;
        //The formula of Volume of a Sphere is: (4.0 / 3.0) * pi * r^3

        System.out.println(v);
    }
}
