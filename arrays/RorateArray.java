package arrays;

import java.util.Arrays;

public class RorateArray {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        // rotateArrayByOne(nums);
        rotateByK(nums, 3);
        System.out.println(Arrays.toString(nums));

    }

    public static void rotateArrayByOne(int[] nums) {
        int first = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }
        nums[nums.length - 1] = first;
    }

    public static void rotateByK(int[] nums, int k) {
        reverseArray(nums, 0, k - 1);
        reverseArray(nums, k, nums.length - 1);
        reverseArray(nums, 0, nums.length - 1);
    }

    private static void reverseArray(int[] nums, int start, int end) {
        while (start < end) {
            int tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
            start++;
            end--;
        }
    }
}
