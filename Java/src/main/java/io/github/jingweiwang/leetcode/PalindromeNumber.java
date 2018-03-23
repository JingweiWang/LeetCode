/**
 * 9.判断一个整数是否是回文数。不能使用辅助空间。
 */
package io.github.jingweiwang.leetcode;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x >= 0 && x <= 99) {
            return (x <= 9) || (x / 10 == x % 10);
        } else if (x >= 100) {
            if (x % 10 == 0) {
                return false;
            }
            int temp = 0;
            while (x > 0 && (temp != x && temp != x / 10)) {
                temp = temp * 10 + x % 10;
                x /= 10;
            }
            return temp == x || temp == x / 10;
        }
        return false;
    }

    public boolean isPalindrome2(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int revertedNumber = 0;
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }
        return x == revertedNumber || x == revertedNumber / 10;
    }
}
