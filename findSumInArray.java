package HW_26_January;

public class findSumInArray {
    public static void main(String[] args) {
        int arr[] = {56, 45, 99, 88, 20, 91, 37, 73, 894, 658, 487, 512}; // sum: 3060

        int sum = 0;
        int n = arr.length;
        for (int i = 0; i <n; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum of elements: "+sum);
    }
}
