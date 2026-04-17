package searching.binarySearch;

public class FirstAndLastOccuraceOfADigit {
    public static void main(String[] args) {
        int[] letters = {5,7,7,7,7,8,8,10};
        int target =5;
        int[] answers = firstAndLastOccuraceOfADigit(letters,target);
        System.out.println(answers[0]+" "+answers[1]);
    }

    private static int[] firstAndLastOccuraceOfADigit(int[] letters, int target) {
        int start = 0;int end = letters.length;
        int index = BinarySearchAlgo.binarySearch(letters, target);
        return new int[]{binarySearch(letters, target, true), binarySearch(letters, target, false)};
    }
    public static int binarySearch(int[] nums, int target,boolean isfirst) {
        int start=0,end=nums.length-1;
        int index = -1;
        while (start<=end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid])
                end = mid - 1;
            else if(target > nums[mid])
                start = mid + 1;
            else {
                index = mid;
                if(isfirst)
                    end=mid-1;
                else
                    start = mid+1;
            }
        }
        return index;

    }

}
