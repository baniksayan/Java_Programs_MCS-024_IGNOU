public class combinations {
public static int comb(int n, int r) {
        if (r > n || r < 0) {
            return 0;
        }

        long nu = 1;
        for (int i = 1; i <= n; i++) {
            nu *= i;
        }
        long de = 1;
        for (int i = 1; i <= r; i++) {
            de *= i;
        }
        for (int i = 1; i <= n - r; i++) {
            de *= i;
        }

        return (int)(nu / de);
    }

    public static void main(String[] args) {
        int n = 5;
        int r = 2;
        int co = comb(n, r);
        System.out.println("Number of combinations: " + co);
    }

    public static class binarySearch {
        public static void main(String[] args) {
            int[] arr = {2, 5, 8, 12, 16, 23, 38};
            int target = 12;

            int low = 0;
            int n = arr.length;
            int high = n-1;

            while (low <= high) {
                int mid = low + (high - low) / 2;

                if (arr[mid] == target) {
                    System.out.println("Target found at index: " + mid);
                    return;
                } else if (arr[mid] < target) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            System.out.println("Target not found");
        }
    }
}
