package arrays;

import java.util.Arrays;

import util.ArrayUtil;

//https://leetcode.com/problems/rearrange-array-elements-by-sign/description/
public class RearrangeArray {
    public static void main(String[] args) {
        int[] nums = { -1, 1 };
        System.out.println(Arrays.toString(rearrangeArray(nums)));
    }

    public static int[] rearrangeArray(int[] nums) {
        int p = 0;
        int n = 1;
        int[] res = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] < 0) {
                res[n] = nums[i];
                n = n + 2;
            } else {
                res[p] = nums[i];
                p = p + 2;
            }

        }
        return res;
    }

}
