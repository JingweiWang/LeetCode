/**
 * 13.给定一个罗马数字，将其转换成整数。
 * 返回的结果要求在 1 到 3999 的范围内。
 * <p>
 * 罗马数字采用七个罗马字母作数字、即Ⅰ（1）、X（10）、C（100）、M（1000）、V（5）、L（50）、D（500）。记数的方法：
 * 相同的数字连写，所表示的数等于这些数字相加得到的数，如 Ⅲ=3；
 * 小的数字在大的数字的右边，所表示的数等于这些数字相加得到的数，如 Ⅷ=8、Ⅻ=12；
 * 小的数字（限于 Ⅰ、X 和 C）在大的数字的左边，所表示的数等于大数减小数得到的数，如 Ⅳ=4、Ⅸ=9；
 * 在一个数的上面画一条横线，表示这个数增值 1,000 倍
 * <p>
 * Ⅲ=3、Ⅳ=4、Ⅵ=6、XIX=19、XX=20、XLV=45、MCMLXXX=1980
 */
package io.github.jingweiwang.leetcode;

public class RomanToInteger {
    public int romanToInt(String s) {
        int result = 0;
        final String[][] roman = new String[][]{
                {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"},
                {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"},
                {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"},
                {"", "M", "MM", "MMM"}
        };
        for (int offset = 0; offset < s.length(); ) {
            for (int i = roman.length - 1; i >= 0; i--) {
                for (int j = roman[i].length - 1; j >= 0; j--) {
                    if (s.startsWith(roman[i][j], offset) && !roman[i][j].equals("")) {
                        result += j * (int) Math.pow(10, i);
                        offset += roman[i][j].length();
                    }
                }
            }
        }
        return result;
    }
}
