package com.wenmq.algo.bina;

import com.wenmq.algo.array.ArraySolution;

import java.util.Arrays;

/**
 * @author ifans.wen
 * @date 2020/7/6
 * @description
 */
public class BinarySolution {

    public static void main(String[] args) {
        int[] aString = new int[]{32,
//                196,147,
//                225,184,165,
//                246,149,170,129,
//                204,153,
//                243,188,141,147,
//                0,
//                217,149,
//                234,176,176,
//                243,178,133,144,
//                213,181,
//                193,187,
//                238,137,134,
//                218,155,
//                33,
//                231,134,162,
//                243,184,144,131,
//                71,
//                201,131,
//                244,133,189,140,
//                242,178,128,156,
//                207,154,
//                230,165,181,
//                240,181,134,180,
                227, 129, 199,
                172, 226, 158, 164, 214, 183, 224, 137, 141, 20, 194, 188, 232, 177, 151, 242, 157, 180, 153, 200, 189, 239, 153, 186, 240, 153, 181, 154};
        System.out.println(validUtf8(aString));
//        int[] a = new int[]{1, 2, 3, 2, 2, 2, 5, 4, 2};
//        System.out.println(majorityElement(a));
//        System.out.println(hammingWeight(25));
//        ArraySolution.printArray(xorQueries(new int[]{1, 3, 4, 8}, new int[][]{{0, 1}, {1, 2}, {0, 3}, {3, 3}}));
//        for (int i = 1; i < 10; i++) {
//            for (int j = 0; j < 10; j++) {
////                System.out.println(xorOperationLow1(i, j) + " " + xorOperation1(i, j));
//                System.out.println(xorOperationLow2(i, j) + " " + xorOperation(i, j));
//                int n = i;
//                int start = j;
////                System.out.println(String.format("%s ^ %s  = %s", getXorResult(n + (start >> 1) - 1) << 1, getXorResult((start >> 1) - 1) << 1, xorOperation2(i, j - 1)));
//            }
//
//        }
//        System.out.println(findComplement(5));
        int i = majorityElement2(new int[]{3, 2});
        System.out.println(i);
        System.out.println(Integer.toBinaryString(i));
    }


    static public int xorOperation1(int n, int start) {
        return (((getXorResult(n + start - 1))
                ^ (getXorResult(start - 1)))
//                + (start % 2)
        );
//        return (getXorResult(n + start >> 1) - getXorResult(start >> 1) + (start & 1));
    }

    static public int xorOperation(int n, int start) {
        int xorTop = getXorResult(n + (start >> 1) - 1);
        int xorBot = (getXorResult((start >> 1) - 1));
        return ((xorTop ^ xorBot) << 1 & (start & n & 1));
    }

    public static int getXorResult(int p) {
        if (p < 0) return 0;
        int a = p & 3;
        switch (a) {
            case 0:
                return p;
            case 1:
                return 1;
            case 2:
                return p + 1;
            case 3:
                return 0;
        }
        return 0;
    }

    public static int xorOperationLow1(int n, int start) {
        int a = 0;
        for (int i = 0; i < n; i++) {
            a ^= (start + i);
        }
        return a;
    }

    public static int xorOperationLow2(int n, int start) {
        int a = 0;
        for (int i = 0; i < n; i++) {
            a ^= (start + 2 * i);
        }
        return a;
    }


    public static int majorityElement(int[] nums) {
        int ans = 0;
        int n = nums.length;
        for (int i = 0; i < 32; i++) {
            int count = 0;
            for (int num : nums) {
                count += num >> i & 1;
            }
            ans += (count << 1 > n) ? 1 << i : 0;
        }
        return ans;
    }


    // you need to treat n as an unsigned value
    static public int hammingWeight(int n) {
        int cnt = 0;
        while (n != 0) {
            n &= n - 1;
            cnt++;
        }
        return cnt;

    }

    static public int[] xorQueries(int[] arr, int[][] queries) {
        int arrLen = arr.length;
        int resultLength = queries.length;
        int[] xorSum = new int[arrLen];
        xorSum[0] = arr[0];
        int[] result = new int[resultLength];
        for (int i = 1; i < arrLen; i++) {
            xorSum[i] = xorSum[i - 1] ^ arr[i];
        }
        for (int i = 0; i < resultLength; i++) {
            result[i] = xorSum[queries[i][1]] ^ ((queries[i][0] > 0) ? (xorSum[queries[i][0] - 1]) : 0);
        }
        return result;
    }

    static public boolean validUtf8(int[] data) {
        int n = 0;
        for (int i = 0; i < data.length; i++) {
            if (n > 0) {
                if (data[i] >> 6 != 2) return false;
                n--;
            } else if (data[i] >> 7 == 0) {
                n = 0;
            } else if (data[i] >> 5 == 0b110) {
                n = 1;
            } else if (data[i] >> 4 == 0b1110) {
                n = 2;
            } else if (data[i] >> 3 == 0b11110) {
                n = 3;
            } else {
                return false;
            }
        }
        return n == 0;
    }

    static public boolean validUtf82(int[] data) {
//      0,10,110,1110,11110
        boolean[][] trans = new boolean[][]{
                {
                        true, false, true, true, true
                },
                {
                        true, true, true, true, true
                },
                {
                        false, true, false, false, false
                },
                {
                        false, true, false, false, false
                },
                {
                        false, true, false, false, false
                }
        };
        int state = 0;
        int extra = 0;
        for (int i = 0; i < data.length; i++) {
            int target = getTarget(data[i]);
            if (target == 6) {
                return false;
            }
            if (trans[state][target]) {
                switch (target) {
                    case 0:
                        if (extra > 0) {
                            return false;
                        }
                        extra = 0;
                        break;
                    case 1:
                        extra--;
                        if (extra < 0) {
                            return false;
                        }
                        break;
                    default:
                        if (extra > 0) {
                            return false;
                        }
                        extra = target - 1;
                        break;
                }
                state = target;
            } else {
                return false;
            }

        }
        return extra == 0;
    }

    private static int getTarget(int dat) {
        int target = 6;
        if ((dat >> 7 & 1) == 0) {
            return 0;
        }
        if ((dat >> 6 & 0b11) == 0b10) {
            return 1;
        }
        if ((dat >> 5 & 0b111) == 0b110) {
            return 2;
        }
        if ((dat >> 4 & 0b1111) == 0b1110) {
            return 3;
        }
        if ((dat >> 3 & 0b11111) == 0b11110) {
            return 4;
        }
        return target;
    }

    public int totalHammingDistance(int[] nums) {
        int a = 0;
        int cnt;
        int counter;
        for (int i = 0; i < 30; i++) {
            cnt = 0;
            counter = 1 << i;
            for (int n : nums) {
                if ((n & counter) == 0) cnt++;
            }
            a += cnt * (nums.length - cnt);

        }
        return a;
    }

    public int[] swapNumbers(int[] numbers) {
        numbers[0] ^= numbers[1];
        numbers[1] ^= numbers[0];
        numbers[0] ^= numbers[1];
        return numbers;
    }


    public int getSum(int a, int b) {
        if (a == 0) return b;
        if (b == 0) return a;
        int s;
        int carrier;
        while (true) {
            s = a ^ b;
            carrier = a & b;
            if (carrier == 0) break;
            a = s;
            b = carrier << 1;
        }
        return s;
    }

    public boolean isPowerOfFour(int num) {
        return ((num & (num - 1)) == 0) && (num & 0xAAAAAAAA) == 0;
    }

    static public int numberOfSteps(int num) {

        int a = 0;
        while (num != 0) {
            if ((num & 1) == 1) {
                num--;
            } else {
                num = num >> 1;
            }
            a++;
        }
        return a;
    }


    static public int findComplement(int num) {
        int a = num;
        int bit = 0;
        while (a != 0) {
            a >>= 1;
            bit++;
        }
        return ((1 << bit) - 1) ^ num;
    }

    public int exchangeBits(int num) {
        return ((num & 0xAAAAAAAA) >> 1) | ((num & 0x55555555) << 1);
    }


    public int[] sortByBits(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += Integer.bitCount(arr[i]) << 16;
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            arr[i] %= 1 << 16;
        }
        return arr;
    }


    static public int majorityElement2(int[] nums) {
        int result = 0;
        int cnt;
        int counter;
        int length = nums.length;
        for (int i = 0; i < 32; i++) {
            cnt = 0;
            counter = 1 << (31 - i);
            for (int j = 0; j < length; j++) {
                if ((nums[j] & counter) == 0) cnt++;
            }
            result <<= 1;
            if ((cnt << 1) < length) {
                result++;
            }
        }
        cnt = 0;
        for (int a : nums) {
            if (a == result) cnt++;
        }
        return (cnt << 1 > length) ? result : -1;
    }


    public int missingNumber(int[] nums) {
        int a = getXorResult(nums.length);
        for (int b : nums
        ) {
            a ^= b;
        }
        return a;
    }


    public char findTheDifference(String s, String t) {
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
        char a = (char) 0;
        for (char b : ss) a ^= b;
        for (char b : tt) a ^= b;
        return a;
    }


    public boolean hasAlternatingBits(int n) {
        long i = n ^ (n << 1);
        return (i & (i + 1)) != 0;

    }

    public int reverseBits(int n) {
        int ans = 0;
        for (int bitsSize = 31; n != 0; n = n >>> 1, bitsSize--) {
            ans += (n & 1) << bitsSize;
        }
        return ans;

    }
}
