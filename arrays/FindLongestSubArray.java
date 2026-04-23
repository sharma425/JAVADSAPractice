package arrays;

import java.util.HashMap;
import java.util.Map;

public class FindLongestSubArray {
    public static void main(String[] args) {
        int k = 3;
        int[] nums = { 1, 2, 3, 1, 1, 1, 1 };
        System.out.println(longestSubarrayWithSumK(nums, k));
        System.out.println(longestSubarrayWithSumOptimal(nums, k));
    }

    public static int longestSubarrayWithSumK(int[] nums, int k) {
        int subArrSize = 0;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            if (!map.containsKey(sum))
                map.put(sum, i);
            if (sum == k && i + 1 > subArrSize)
                subArrSize = i + 1;

            if (sum > k && map.containsKey(sum - k)) {
                if (i - map.get(sum - k) > subArrSize)
                    subArrSize = i - map.get(sum - k);
            }
        }
        return subArrSize;
    }

    // not for -ve nos
    private static int longestSubarrayWithSumOptimal(int[] nums, int k) {
        int j = 0;
        int sum = 0;
        int subArrSize = 0;

        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];

            if (sum > k) {
                sum = sum - nums[j++];
            }
            if (sum == k) {
                if (i - j + 1 > subArrSize)
                    subArrSize = i - j + 1;
            }
        }

        return subArrSize;

    }
}
