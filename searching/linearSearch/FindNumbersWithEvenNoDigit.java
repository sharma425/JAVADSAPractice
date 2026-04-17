package searching.linearSearch;


public class FindNumbersWithEvenNoDigit {

    public static void main(String[] args) {
       int[] nums = {12,345,2,61,7890};

        System.out.println(findNumberWithEvenDigits(nums));
    }

    private static int findNumberWithEvenDigits(int[] nums) {
        int count = 0 ;
        for(int num : nums){
            if(even(num))
                count++;
        }
        return count;
    }
    private static boolean even(int num){
        return count2WithLog(num)%2==0;
    }
    private static int count(int num){
        int digits = 0;
        if(num<1)
            num=num*-1;
        if(num==0)
            return 1;
        while (num>0){
            digits++;
            num=num/10;
        }
        return digits;

    }

    private static int count2WithLog(int num){
        int digits = 0;
        if(num<1)
            num=num*-1;
        if(num==0)
            return 1;

        return (int) (Math.log10(num)+1);

    }
}
