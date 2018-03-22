/**
 * 7.给定一个范围为 32 位 int 的整数，将其颠倒。
 * 假设我们的环境只能处理 32 位 int 范围内的整数。根据这个假设，如果颠倒后的结果超过这个范围，则返回 0。
 */
package io.github.jingweiwang.leetcode;


public class ReverseInteger {
    public int reverse1(int x) {
        long result = 0;

        do {
            result = result * 10 + x % 10;
            x = x / 10;
        }
        while (x != 0);

        if (result >= Integer.MIN_VALUE && result <= Integer.MAX_VALUE) {
            return (int) result;
        } else {
            return 0;
        }
    }
}
