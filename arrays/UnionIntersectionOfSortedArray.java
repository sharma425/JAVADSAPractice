package arrays;

import java.util.Arrays;

public class UnionIntersectionOfSortedArray {

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 2, 3, 3, 5, 6 };
        int[] nums2 = { 2, 3, 3, 5, 6, 7 };
        int[] result = intersecTionOfArr(nums1, nums2);
        System.out.println(Arrays.toString(result));
    }

    public static int[] intersecTionOfArr(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int count = 0;
        int[] tmp = new int[nums2.length < nums1.length ? nums2.length : nums1.length];
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                tmp[count++] = nums2[j++];
                i++;
            }

        }

        int[] tmp1 = new int[count];
        for (int k = 0; k < count; k++)
            tmp1[k] = tmp[k];
        return tmp1;

    }

    public static int[] unionArray(int[] nums1, int[] nums2) {
        if (nums1.length == 0)
            return nums2;
        if (nums2.length == 0)
            return nums1;
        int i = 0;
        int j = 0;
        int[] tmp = new int[nums1.length + nums2.length];
        int count = 0;
        while (i < nums1.length && j < nums2.length) {
            if (count > 0) {
                if (tmp[count - 1] == nums1[i]) {
                    i++;
                    continue;
                }
                if (tmp[count - 1] == nums2[j]) {
                    j++;
                    continue;
                }
            }
            if (nums1[i] <= nums2[j])
                tmp[count++] = nums1[i++];
            else if (nums1[i] > nums2[j])
                tmp[count++] = nums2[j++];

        }
        while (i < nums1.length) {
            if (tmp[count - 1] == nums1[i]) {
                i++;
                continue;
            }
            tmp[count++] = nums1[i++];
        }
        while (j < nums2.length) {
            if (tmp[count - 1] == nums2[j]) {
                j++;
                continue;
            }
            tmp[count++] = nums2[j++];
        }

        int[] tmp1 = new int[count];
        for (int k = 0; k < count; k++)
            tmp1[k] = tmp[k];
        return tmp1;

    }

}
