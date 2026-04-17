package searching.binarySearch;
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/
public class SmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] letters = {'e','e','e','e','e','e','n','n','n','n'};
        char target = 'n';
        char result = nextGreatestLetter(letters,target);
        System.out.println(result);
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        return letters[findIndex(letters,target)];
    }
    public static int findIndex(char[] letters, char target){
        int start = 0;
        int end = letters.length-1;

        while (start<=end){
            int mid = start+(end-start)/2;


            if(target<letters[mid])
                end = mid-1;
            else
                start = mid+1;
        }
        return start%letters.length;
    }
}
