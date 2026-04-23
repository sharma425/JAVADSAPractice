package arrays;

public class CheckSortedAndRotated {
    public static void main(String[] args) {
        int[] nums4 = { 1, 1, 2, 1 };
        System.out.println("expected : true,  Result " + CheckSortedAndRotated(nums4));
        int[] nums = { 5, 5, 6, 6, 6, 9, 1, 2 };
        System.out.println("expected : true,  Result " + CheckSortedAndRotated(nums));
        int[] nums1 = { 3, 4, 5, 1, 2 };
        System.out.println("expected : true,  Result " + CheckSortedAndRotated(nums1));
        int[] nums2 = { 2, 1, 3, 4 };
        System.out.println("expected : flase,  Result " + CheckSortedAndRotated(nums2));
        int[] nums3 = { 1, 2, 3 };
        System.out.println("expected : true,  Result " + CheckSortedAndRotated(nums3));

    }

    public static boolean CheckSortedAndRotated(int[] nums) {
        return CheckSortedAndRotatedOptimal(nums);
    }

    public static boolean CheckSortedAndRotatedOptimal(int[] nums) {
        int n = nums.length;
        if (n < 1)
            return true;
        int inversionCount = 0;
        for (int i = 1; i < n; ++i) {
            if (nums[i] < nums[i - 1])
                inversionCount++;
        }
        if (nums[0] < nums[n - 1])
            inversionCount++;
        return inversionCount < 2;
    }

    public static boolean CheckSortedAndRotatedLogN(int[] nums) {
        int pivot = findPivot(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[(pivot + 1 + i) % nums.length] > nums[(pivot + 2 + i) % nums.length])
                return false;
        }
        return true;

        // if (pivot == -1 || pivot == 0 || pivot == nums.length - 1)
        // return false;
        // if (pivot > 0 && nums[pivot] < nums[pivot - 1])
        // return false;
        // if (pivot < nums.length - 1 && nums[pivot] < nums[pivot + 1])
        // return false;
        // for (int i = 0; i <= pivot - 1; i++) {
        // if (nums[i] > nums[i + 1])
        // return false;
        // }
        // for (int i = pivot + 1; i <= nums.length - 2; i++) {
        // if (nums[i] > nums[i + 1])
        // return false;
        // }
        // return true;
    }

    private static int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            } else if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }
            if (nums[start] >= nums[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }
}
