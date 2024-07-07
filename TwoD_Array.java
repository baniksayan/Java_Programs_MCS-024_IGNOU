import java.util.Scanner;
public class TwoD_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter dimensions for the first array (rows columns):");
        int rows1 = scanner.nextInt();
        int columns1 = scanner.nextInt();
        int[][] array1 = new int[rows1][columns1];

        System.out.println("Enter elements for the first array:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns1; j++) {
                array1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter dimensions for the second array (rows columns):");
        int rows2 = scanner.nextInt();
        int columns2 = scanner.nextInt();

        if (rows1 != rows2 || columns1 != columns2) {
            System.out.println("Cannot add arrays with different dimensions.");
            return;
        }

        int[][] array2 = new int[rows2][columns2];

        System.out.println("Enter elements for the second array:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < columns2; j++) {
                array2[i][j] = scanner.nextInt();
            }
        }

        int[][] sumArray = new int[rows1][columns1];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns1; j++) {
                sumArray[i][j] = array1[i][j] + array2[i][j];
            }
        }

        System.out.println("Resultant array after addition:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns1; j++) {
                System.out.print(sumArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
