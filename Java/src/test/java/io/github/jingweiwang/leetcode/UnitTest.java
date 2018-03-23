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

    @Test
    public void PalindromeNumber() {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        assertAll(
                () -> assertTrue(palindromeNumber.isPalindrome(3)),
                () -> assertTrue(palindromeNumber.isPalindrome(99)),
                () -> assertTrue(palindromeNumber.isPalindrome(123321)),
                () -> assertTrue(palindromeNumber.isPalindrome(12321)),
                () -> assertTrue(palindromeNumber.isPalindrome(10100101)),
                () -> assertFalse(palindromeNumber.isPalindrome(-123321)),
                () -> assertFalse(palindromeNumber.isPalindrome(-2147483648)),
                () -> assertFalse(palindromeNumber.isPalindrome(54321)),
                () -> assertFalse(palindromeNumber.isPalindrome(10)),
                () -> assertFalse(palindromeNumber.isPalindrome(100)),
                () -> assertFalse(palindromeNumber.isPalindrome(1000)),
                () -> assertFalse(palindromeNumber.isPalindrome(78)),

                () -> assertTrue(palindromeNumber.isPalindrome2(3)),
                () -> assertTrue(palindromeNumber.isPalindrome2(99)),
                () -> assertTrue(palindromeNumber.isPalindrome2(123321)),
                () -> assertTrue(palindromeNumber.isPalindrome2(12321)),
                () -> assertTrue(palindromeNumber.isPalindrome2(10100101)),
                () -> assertFalse(palindromeNumber.isPalindrome2(-123321)),
                () -> assertFalse(palindromeNumber.isPalindrome2(-2147483648)),
                () -> assertFalse(palindromeNumber.isPalindrome2(54321)),
                () -> assertFalse(palindromeNumber.isPalindrome2(10)),
                () -> assertFalse(palindromeNumber.isPalindrome2(100)),
                () -> assertFalse(palindromeNumber.isPalindrome2(1000)),
                () -> assertFalse(palindromeNumber.isPalindrome2(78))
        );
    }

    @Test
    public void RomanToInteger() {
        RomanToInteger romanToInteger = new RomanToInteger();
        assertAll(
                () -> assertEquals(romanToInteger.romanToInt("I"), 1),
                () -> assertEquals(romanToInteger.romanToInt("III"), 3),
                () -> assertEquals(romanToInteger.romanToInt("V"), 5),
                () -> assertEquals(romanToInteger.romanToInt("VII"), 7),
                () -> assertEquals(romanToInteger.romanToInt("XII"), 12),
                () -> assertEquals(romanToInteger.romanToInt("IV"), 4),
                () -> assertEquals(romanToInteger.romanToInt("IX"), 9),
                () -> assertEquals(romanToInteger.romanToInt("XIX"), 19),
                () -> assertEquals(romanToInteger.romanToInt("XX"), 20),
                () -> assertEquals(romanToInteger.romanToInt("XLV"), 45),
                () -> assertEquals(romanToInteger.romanToInt("MCMLXXX"), 1980)
        );
    }

    @Test
    public void CountAndSay() {
        CountAndSay countAndSay = new CountAndSay();
        assertAll(
                () -> assertEquals(countAndSay.countAndSay(1), "1"),
                () -> assertEquals(countAndSay.countAndSay(2), "11"),
                () -> assertEquals(countAndSay.countAndSay(3), "21"),
                () -> assertEquals(countAndSay.countAndSay(4), "1211"),
                () -> assertEquals(countAndSay.countAndSay(5), "111221"),
                () -> assertEquals(countAndSay.countAndSay(6), "312211"),
                () -> assertEquals(countAndSay.countAndSay(7), "13112221"),
                () -> assertEquals(countAndSay.countAndSay(8), "1113213211")
        );
    }
}