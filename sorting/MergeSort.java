package sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] nums = { 5, 4, 4, 1, 1 };

        System.out.println(Arrays.toString(mergeSort(nums, 0, nums.length - 1)));
    }

    private static int[] mergeSort(int[] nums, int low, int high) {
        if (low == high)
            return nums;
        int mid = low + (high - low) / 2;
        mergeSort(nums, low, mid);
        mergeSort(nums, mid + 1, high);
        merge(low, high, mid, nums);
        return nums;
    }

    private static void merge(int low, int high, int mid, int[] nums) {
        int left = low;
        int right = mid + 1;
        int[] tmp = new int[high - low + 1];
        int index = 0;
        while (left <= mid && right <= high) {
            if (nums[left] <= nums[right])
                tmp[index++] = nums[left++];
            else
                tmp[index++] = nums[right++];
        }
        while (left <= mid)
            tmp[index++] = nums[left++];

        while (right <= high)
            tmp[index++] = nums[right++];

        for (int i = low; i <= high; i++) {
            nums[i] = tmp[i - low];
        }

    }
}
