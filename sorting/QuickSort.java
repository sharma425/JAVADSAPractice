package sorting;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] nums = { 7, 4, 1, 5, 3 };
        quickSort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    public static void quickSort(int[] nums, int low, int high) {
        if (low < high) {
            int partition = createPartition(nums, low, high);
            quickSort(nums, low, partition - 1);
            quickSort(nums, partition + 1, high);
        }
    }

    private static int createPartition(int[] nums, int low, int high) {
        System.out.println("low:" + low + ", high: " + high);
        int left = low;
        int right = high;
        int pivot = low;

        while (left < right) {
            while (nums[pivot] >= nums[left] && left < high) {
                left++;
            }
            while (nums[pivot] < nums[right] && right > low) {
                right--;
            }

            if (left < right)
                swap(nums, left, right);
        }
        swap(nums, pivot, right);
        return right;
    }

    private static void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

}