package HW_26_January;

public class findMinInArray {
    public static void main(String[] args) {
        int arr[] = {78, 84, 94, 33, 21, 82, 65};

        int max = arr[0];
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            if(arr[i] < max) {
                max = arr[i];
            }
        }
        System.out.println("Minimum Element in the Array: "+max);
    }
}
