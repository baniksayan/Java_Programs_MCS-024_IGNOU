public class LeetCode704 {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = ((low + high) / 2); // Prevents overflow

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1; // Target not found
    }

    public static void main(String[] args) {
        LeetCode704 l = new LeetCode704();
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        int result = l.search(nums, target);
        System.out.println("Index of target " + target + ": " + result);
    }
}
