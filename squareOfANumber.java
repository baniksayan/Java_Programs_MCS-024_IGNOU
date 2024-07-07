import java.util.Scanner;
public class squareOfANumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int n = sc.nextInt();

        System.out.print("The Square Root of " +n+" is: "+n*n);
    }
}
