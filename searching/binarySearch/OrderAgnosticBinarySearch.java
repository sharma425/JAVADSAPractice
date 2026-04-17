package searching.binarySearch;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,2,3,3,3,3,5,6,7,12,12,20,33};
    int target = 3;
    int index = orderAgnosticBinarySearch(arr,target);
        System.out.println(index);
    }

    private static int orderAgnosticBinarySearch(int[] arr,int target) {
        int start = 0, end=arr.length-1;
        boolean isAsc = arr[end]>arr[start];
        while (start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target)
                return mid;
            if(isAsc){
                    if(target < arr[mid])
                        end = mid-1;
                    else
                        start = mid+1;
                }else {
                    if(target < arr[mid])
                        start = mid+1;
                    else
                        end = mid-1;
                }

        }
        return -1;
    }
}
