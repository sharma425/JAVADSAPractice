package arrays;

public class MaximumSubArraySum {
    public static void main(String[] args) {
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println("Expected : 6, answer : " + findMaximumSubArraySum(nums));
        int[] nums1 = { 5, 4, -1, 7, 8 };
        System.out.println("Expected : 23, answer : " + findMaximumSubArraySum(nums1));
        int[] nums2 = { 1 };
        System.out.println("Expected : 1, answer : " + findMaximumSubArraySum(nums2));
    }

    public static int findMaximumSubArraySum(int[] nums) {
        int sum = 0;
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            if (sum > maxValue) {
                maxValue = sum;
            }
            if (sum < 0)
                sum = 0;
        }
        return maxValue;
    }
}
