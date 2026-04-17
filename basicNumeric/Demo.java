package basicNumeric;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        // System.out.println(reverse(1534236469));
        // isPalindrome(121);
        // isArmstrong(153);
        // divisors(36);
        // System.out.println(isPrime(8));
        System.out.println(findGCD(15, 20));
    }

    public static int findGCD(int num1, int num2) {
        while (num1 != 0 && num2 != 0) {
            if (num1 > num2)
                num1 = num1 % num2;
            else
                num2 = num2 % num1;
        }
        return num1 == 0 ? num2 : num1;

    }

    public static boolean isPrime(int n) {
        for (int i = 2; i * i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static int[] divisors(int n) {
        List<Integer> list = new ArrayList<>();
        int size = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                list.add(i);
                if (n / i != 1)
                    list.add(n / i);
            }

        }
        Collections.sort(list);
        int[] lst = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            lst[i] = list.get(i);
        }
        return lst;

    }

    public static int reverse(int x) {
        long reverse = 0;
        boolean isNegative = x < 0;
        if (isNegative)
            x = x * -1;
        while (x > 0) {
            int digit = x % 10;
            reverse = reverse * 10;
            reverse = reverse + digit;
            x = x / 10;
        }
        return (int) (isNegative ? reverse * -1 : reverse);
    }

    private static boolean isPalindrome(int x) {
        int reverseNum = 0;
        boolean isNegative = x < 0;
        if (isNegative)
            x = x * -1;
        while (x > 0) {
            reverseNum = reverseNum * 10 + x % 10;
            x = x / 10;
        }
        if (isNegative)
            reverseNum = reverseNum * -1;
        return reverseNum == x;
    }

    public static boolean isArmstrong(int n) {
        int num = n;
        int sum = 0;
        while (n > 0) {
            int digit = num % 10;
            sum = sum + digit * digit * digit;
            num = num / 10;
        }
        return n == sum;
    }
}
