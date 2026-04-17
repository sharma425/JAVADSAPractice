package searching.binarySearch;

public class BinarySearchAlgo {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,17,132,234,3245,23545};
        int target = 776;
        int targerIndex  =  binarySearch(nums,target);
        System.out.println(targerIndex);
    }

    public static int binarySearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

            while (start<=end) {
                int mid = start + (end - start) / 2;
                if (nums[mid] == target)
                    return mid;
                if (target < nums[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
                System.out.println(start + " : " + end);
            }
        return -1;

    }
}
