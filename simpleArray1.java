package normalUsageJavaPrograms;
import java.util.Scanner;
public class simpleArray1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {5,3,1,4,2};

        int n = arr.length;
        for (int i = 0; i <n; i++) {
            System.out.print(" "+arr[i]);
        }
    }
}
