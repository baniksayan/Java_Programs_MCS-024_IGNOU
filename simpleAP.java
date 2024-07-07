import java.util.Scanner;
public class simpleAP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        //1 3 5 7 9 ...
        for(int i=1; i<=((2*n)-1); i+=2) {
            System.out.println(i);
        }
    }
}
