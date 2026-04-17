package sorting;

import java.util.Arrays;

import util.ArrayUtil;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = { 5, 4, 4, 1, 1 };
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static int[] bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            boolean swapped = false;
            for (int j = 1; j < nums.length - i; j++) {
                if (nums[j] < nums[j - 1]) {
                    ArrayUtil.swapElement(j, j - 1, nums);
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
        return nums;
    }

}
