import java.util.Scanner;

public class areaOfCircle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the value: ");
        double r = sc.nextDouble();
        double a = 3.141592 * r * r;

        System.out.println(a);
    }
}
