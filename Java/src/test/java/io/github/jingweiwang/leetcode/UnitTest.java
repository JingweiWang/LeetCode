package io.github.jingweiwang.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UnitTest {
    @Test
    public void TwoSumTest() {
        int[] givenNums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] realResult = new int[]{0, 1};

        TwoSum twoSum = new TwoSum();
        int[] result1 = twoSum.solution1(givenNums, target);
        int[] result2 = twoSum.solution2(givenNums, target);
        int[] result3 = twoSum.solution3(givenNums, target);
        assertAll(
                () -> assertArrayEquals(result1, realResult),
                () -> assertArrayEquals(result2, realResult),
                () -> assertArrayEquals(result3, realResult)
        );
    }

    @Test
    public void ReverseInteger() {
        ReverseInteger reverseInteger = new ReverseInteger();
        assertAll(
                () -> assertEquals(reverseInteger.reverse1(123), 321),
                () -> assertEquals(reverseInteger.reverse1(-123), -321),
                () -> assertEquals(reverseInteger.reverse1(120), 21)
        );

    }
}