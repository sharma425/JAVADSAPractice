package arrays;

import sorting.QuickSort;

public class SecondLargest {
    public static void main(String[] args) {
        int[] nums = { 8, 8, 7, 6, 5 };
        // int[] nums = { 10, 10, 10, 10, 10 };

        int secondLargestElement = findSecondLargestOptimal(nums);
        System.out.println(secondLargestElement);
    }

    // brute force method
    public static int secondLargestElement(int[] nums) {
        QuickSort.quickSort(nums, 0, nums.length - 1);
        int j = nums.length - 2;

        while (j >= 0) {
            if (nums[j] < nums[j + 1])
                return nums[j];
            j--;
        }
        return -1;
    }

    public static int findSecondLargestBetter(int[] nums) {
        int largest = nums[0];
        for (int num : nums) {
            if (num > largest)
                largest = num;
        }
        int secondLargestElement = -1;
        for (int num : nums) {
            if (num > secondLargestElement && num != largest)
                secondLargestElement = num;
        }
        return secondLargestElement;
    }

    public static int findSecondLargestOptimal(int[] nums) {
        int largest = nums[0];
        int secondLargestElement = -1;
        for (int num : nums) {
            if (num > largest) {
                secondLargestElement = largest;
                largest = num;
            } else if (num != largest && num > secondLargestElement) {
                secondLargestElement = num;
            }
        }

        return secondLargestElement;
    }
}
