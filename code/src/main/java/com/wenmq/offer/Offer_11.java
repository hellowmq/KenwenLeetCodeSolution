package com.wenmq.offer;

/**
 * Offer-11
 * 旋转数组的最小数字
 *
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素。例如，数组 [3,4,5,1,2] 为 [1,2,3,4,5] 的一个旋转，该数组的最小值为1。  
 *
 */
public class Offer_11 {

    /**
     * Todo: 此题考查数组的检索，二分查找
     */
    class Solution1 implements Solution {
        @Override
        public int minArray(int[] numbers) {
            int i = 0, j = numbers.length - 1;
            while (i < j) {
                int m = (i + j) / 2;
                if (numbers[m] > numbers[j]) i = m + 1;
                else if (numbers[m] < numbers[j]) j = m;
                else j--;
            }
            return numbers[i];
        }
    }

    interface Solution {
        public int minArray(int[] numbers);
    }


}
