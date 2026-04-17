package sorting;

import java.util.Arrays;

import util.ArrayUtil;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = { 5, 4, 4, 1, 1 };
        selectionSort(nums);

        System.out.println(Arrays.toString(nums));
    }

    public static int[] selectionSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int k = findMinIndex(i, nums);
            ArrayUtil.swapElement(i, k, nums);
        }
        return nums;
    }

    private static int findMinIndex(int start, int[] nums) {
        int min = start;
        for (int i = start + 1; i < nums.length; i++) {
            if (nums[i] < nums[min])
                min = i;
        }
        return min;
    }
}
