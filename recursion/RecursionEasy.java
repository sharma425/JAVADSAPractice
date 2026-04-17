package recursion;

import java.util.Arrays;

public class RecursionEasy {
    public static void main(String[] args) {
        // printNTimes(0, 5);
        // print1ToN(1, 6);
        // printNto1(10, 5);
        // System.out.println(sumOfFirstN(10));
        // System.out.println(factorial(10));// 3628800
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println(Arrays.toString(reversedArr(0, arr.length - 1, arr)));
        // System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        // int[] arr = new int[100000000];

    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z]", "");
        int start = 0;
        int end = s.length() - 1;

        return check(start, end, s.toLowerCase());
    }

    public static boolean check(int start, int end, String s) {
        if (start < end) {
            if (s.charAt(start) != s.charAt(end))
                return false;
            return check(start + 1, end - 1, s);
        }
        return true;

    }

    public static int[] reversedArr(int start, int end, int[] arr) {
        if (start < end) {
            int tmp = arr[start];
            arr[start] = arr[end];
            arr[end] = tmp;
            reversedArr(start + 1, end - 1, arr);
        }
        return arr;
    }

    public static int factorial(int num) {
        if (num > 1)
            return num * factorial(num - 1);
        return 1;
    }

    public static int sumOfFirstN(int n) {
        int sum = 0;
        if (n > 0)
            return n + sumOfFirstN(n - 1);
        return sum;

    }

    public static void print1ToN(int start, int end) {
        if (start > end)
            return;
        print1ToN(start, end - 1);
        System.out.println(end);

    }

    public static void printNto1(int start, int end) {
        if (start < end)
            return;
        printNto1(start, end + 1);
        System.out.println(end);
    }

    public static void printNTimes(int i, int n) {
        if (i >= n)
            return;
        System.out.println("hello");
        printNTimes(i + 1, n);
    }

}
