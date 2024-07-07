import java.util.Scanner;
public class rectangleComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        double l = sc.nextDouble();

        System.out.print("Enter the breadth of the rectangle: ");
        double b = sc.nextDouble();

        double a = l * b; //Formula: Area = length × breadth

        double p = 2 * (l + b); //Formula: Perimeter = 2 × (length + breadth)

        if (a > p) {
            System.out.println("The area of the rectangle is greater than its perimeter.");
        } else {
            System.out.println("The perimeter of the rectangle is greater than its area.");
        }
    }
}
