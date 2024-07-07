import java.util.Scanner;
public class simpleArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //System.out.print("Please enter the array: ");

        int a[] = new int[10];

        for( int i=0; i<10; i++) {
            System.out.print("Enter the value for a["+i+"] ");
            a[i] = sc.nextInt();
        }
        for (int i = 0; i <10; i++) {
            System.out.print(" "+a[i]);
        }
    }
}
//H.W.: binary search





