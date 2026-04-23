package arrays;

import java.util.Arrays;

import util.ArrayUtil;

public class SortColorsDutchNationalFlag {
    public static void main(String[] args) {
        int[] nums = { 2, 0, 2, 1, 1, 0 };
        sortByDutchNationalFlagAlgo(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void sortColors(int[] nums) {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for (int num : nums) {
            if (num == 0)
                count0++;
            if (num == 1)
                count1++;
            if (num == 2)
                count2++;
        }
        int n = 0;
        while (count0 > 0) {
            nums[n++] = 0;
            count0--;
        }
        while (count1 > 0) {
            nums[n++] = 1;
            count1--;
        }
        while (count2 > 0) {
            nums[n++] = 2;
            count2--;
        }
    }

    public static void sortByDutchNationalFlagAlgo(int[] nums) {
        int mid = 0;
        int low = 0;
        int high = nums.length - 1;
        while (mid < high) {
            if (nums[mid] == 0) {
                ArrayUtil.swapElement(mid, low, nums);
                low++;
                mid++;
            }
            if (nums[mid] == 1)
                mid++;
            if (nums[mid] == 2) {
                ArrayUtil.swapElement(mid, high, nums);
                high--;
            }
        }
    }

}
