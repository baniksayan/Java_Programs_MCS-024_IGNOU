import java.util.Scanner;
public class largestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        int a = sc.nextInt();

        System.out.print("Enter 2nd Number: ");
        int b = sc.nextInt();

        System.out.print("Enter 3rd Number: ");
        int c = sc.nextInt();

        if (a>=b && a>=c){
            System.out.println(a+" is largest.");
        } else if (b>=a && b>=c){
            System.out.println(b+" is largest.");
        } else {
            System.out.println(c+" is largest.");
        }
    }
}
