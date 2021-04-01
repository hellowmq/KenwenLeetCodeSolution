package com.wenmq.leetcode;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * Q767
 * https://leetcode-cn.com/problems/reorganize-string/
 */

public class Solution767 {

    /**
     * 堆重排比较容易
     * 堆排序写不出来，
     */
    @SuppressWarnings("checkstyle:ParameterName")
    public String reorganizeString(String S) {
        if (S.length() < 2) {
            return S;
        }
        int[] counts = new int[26];
        int maxCount = 0;
        int length = S.length();
        for (int i = 0; i < length; i++) {
            char c = S.charAt(i);
            counts[c - 'a']++;
            maxCount = Math.max(maxCount, counts[c - 'a']);
        }
        if (maxCount > (length + 1) / 2) {
            return "";
        }
        PriorityQueue<Character> queue = new PriorityQueue<>(
                (letter1, letter2) -> counts[letter2 - 'a'] - counts[letter1 - 'a']);
        for (char c = 'a'; c <= 'z'; c++) {
            if (counts[c - 'a'] > 0) {
                queue.offer(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (queue.size() > 1) {
            char letter1 = queue.poll();
            char letter2 = queue.poll();
            sb.append(letter1);
            sb.append(letter2);
            int index1 = letter1 - 'a';
            int index2 = letter2 - 'a';
            counts[index1]--;
            counts[index2]--;
            if (counts[index1] > 0) {
                queue.offer(letter1);
            }
            if (counts[index2] > 0) {
                queue.offer(letter2);
            }
        }
        if (queue.size() > 0) {
            sb.append(queue.poll());
        }
        return sb.toString();
    }

    /**
     * 每次重排
     */
    @SuppressWarnings("checkstyle:ParameterName")
    public String reorganizeString2(String S) {

        StringBuilder sb = new StringBuilder();
        int[][] nums = new int[26][2];
        for (char c : S.toCharArray()) {
            nums[c - 'a'][0] = c;
            nums[c - 'a'][1]++;
        }
        // 26 * log(26)的时间复杂度
        Arrays.sort(nums, (x, y) -> y[1] - x[1]);
        // n*26*log(26)的时间复杂度。每次把个数最多的两个字符加到结果中。
        while (nums[0][1] != 0) {
            char word = (char) nums[0][0];
            int len = sb.length();
            if (len > 1 && word == sb.charAt(len - 1)) {
                return "";
            }
            sb.append(word);
            nums[0][1]--;
            if (nums[1][1] != 0) {
                sb.append((char) nums[1][0]);
                nums[1][1]--;
            }
            Arrays.sort(nums, (x, y) -> y[1] - x[1]);
        }
        return sb.toString();

    }

}
