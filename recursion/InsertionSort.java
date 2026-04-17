package recursion;

import java.util.Arrays;

import util.ArrayUtil;

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = { 5, 4, 4, 1, 1 };
        recursiveInsertionSort(nums, nums.length);
        System.out.println(Arrays.toString(nums));
    }

    private static void recursiveInsertionSort(int[] nums, int n) {
        if (n == 1)
            return;
        recursiveInsertionSort(nums, n - 1);
        int last = n - 1;
        while (last > 0 && nums[last - 1] > nums[last]) {
            ArrayUtil.swapElement(last - 1, last, nums);
            last--;
        }
    }

}
