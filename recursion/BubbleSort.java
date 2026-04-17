package recursion;

import java.util.Arrays;

import util.ArrayUtil;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = { 5, 4, 4, 1, 1 };
        recursiveBubbleSort(nums, nums.length);
        System.out.println(Arrays.toString(nums));
    }

    private static void recursiveBubbleSort(int[] nums, int n) {
        if (n == 1)
            return;
        boolean swapped = false;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                ArrayUtil.swapElement(i, i + 1, nums);
                swapped = true;
            }
        }
        if (!swapped)
            return;
        recursiveBubbleSort(nums, n - 1);

    }
}
