package sorting;

import java.util.Arrays;

// https://leetcode.com/problems/frequency-of-the-most-frequent-element/
//https://www.youtube.com/watch?v=nveGJc_oYAI

public class Leetcode_frequence_of_most_occuring_element {

    public static void main(String[] args) {
        // int[] nums = { 3, 9, 6 };
        int[] nums = { 1, 2, 4 };
        int result = maxFrequency(nums, 5);
        System.out.println(result);
    }

    public static int maxFrequency(int[] nums, int k) {
        InsertionSort.insertionSort(nums);
        int maxSize = 0;
        int start = 1;
        int end = nums.length;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (possible(mid, nums, k)) {
                maxSize = mid;
                start = mid + 1;
            } else
                end = mid - 1;
        }
        return maxSize;
    }

    public static boolean possible(int mid, int[] nums, int k) {
        int allSum = 0;
        for (int i = 0; i < mid; i++)
            allSum += nums[i];
        int maxPossibleSum = nums[mid - 1] * mid;
        if (maxPossibleSum - allSum <= k)
            return true;
        int j = 0;
        for (int i = mid; i < nums.length; i++) {
            allSum -= nums[j++];
            allSum += nums[i];
            maxPossibleSum = nums[i] * mid;
            if (maxPossibleSum - allSum <= k)
                return true;
        }
        return false;
    }
}
