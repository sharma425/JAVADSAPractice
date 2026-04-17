package sorting;

import java.util.Arrays;

import util.ArrayUtil;

public class InsertionSort {

    public static void main(String[] args) {
        int[] nums = { 5, 4, 4, 1, 1 };
        insertionSort(nums);
        System.out.println(Arrays.toString(nums));

    }

    public static int[] insertionSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int j = i;
            while (j > 0 && nums[j] < nums[j - 1]) {
                ArrayUtil.swapElement(j, j - 1, nums);
                j--;
            }
        }
        return nums;
    }

}
