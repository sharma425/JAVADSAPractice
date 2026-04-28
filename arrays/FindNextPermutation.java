package arrays;

import java.util.Arrays;

//https://leetcode.com/problems/next-permutation/description/
public class FindNextPermutation {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void nextPermutation(int[] nums) {
        int pivot = -1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                pivot = i;
                break;
            }
        }
        if (pivot == -1) {
            reverse(nums, 0, nums.length - 1);
            return;
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] > nums[pivot]) {
                int tmp = nums[i];
                nums[i] = nums[pivot];
                nums[pivot] = tmp;
                break;
            }
        }

        reverse(nums, pivot + 1, nums.length - 1);

    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
            start++;
            end--;
        }
    }

}
