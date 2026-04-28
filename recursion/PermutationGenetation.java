package recursion;

import java.util.ArrayList;
import java.util.List;

public class PermutationGenetation {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        List<List<Integer>> result = generatePermutation(nums);
        System.out.println(result);
    }

    private static List<List<Integer>> generatePermutation(int[] nums) {
        boolean[] marker = new boolean[nums.length];
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> permutation = new ArrayList<>();
        premute(nums, marker, permutation, result);
        return result;
    }

    private static void premute(int[] nums, boolean[] marker, List<Integer> permutation, List<List<Integer>> result) {
        if (permutation.size() == nums.length) {
            result.add(new ArrayList<>(permutation));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!marker[i]) {
                marker[i] = true;
                permutation.add(nums[i]);
                premute(nums, marker, permutation, result);
                permutation.remove(permutation.size() - 1);
                marker[i] = false;
            }
        }
    }

}
