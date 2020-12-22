package com.wenmq.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Q316
 * https://leetcode-cn.com/problems/remove-duplicate-letters/
 * 本题的考点是 "单调栈"，中等难度，但是——写不出来
 * Todo：Review
 * @link {https://oi-wiki.org/ds/monotonous-stack/}
 */
public class Solution316 {
    /**
     * 方法一：
     */
    public String removeDuplicateLetters(String s) {
        int len = s.length();
        if (len < 2) {
            return s;
        }

        char[] charArray = s.toCharArray();
        // 记录每个字符出现的最后一个位置
        int[] lastIndex = new int[26];
        for (int i = 0; i < len; i++) {
            lastIndex[charArray[i] - 'a'] = i;
        }

        Deque<Character> stack = new ArrayDeque<>(len);
        stack.addLast('a');
        // 栈中有的字符记录在这里
        boolean[] visited = new boolean[26];
        for (int i = 0; i < len; i++) {
            char currentChar = charArray[i];
            // 如果栈中已经存在，就跳过
            if (visited[currentChar - 'a']) {
                continue;
            }

            // 在 ① 栈非空，② 当前元素字典序 < 栈顶元素，并且 ③ 栈顶元素在以后还会出现，弹出栈元素
            while (currentChar < stack.peekLast() && lastIndex[stack.peekLast() - 'a'] > i) {
                char top = stack.removeLast();
                visited[top - 'a'] = false;
            }

            stack.addLast(currentChar);
            visited[currentChar - 'a'] = true;
        }

        StringBuilder stringBuilder = new StringBuilder();
        int size = stack.size();
        for (int i = 0; i < size - 1; i++) {
            stringBuilder.insert(0, stack.removeLast());
        }
        return stringBuilder.toString();
    }


    /**
     * 方法二
     */
    public String removeDuplicateLetters2(String s) {
        boolean[] vis = new boolean[26];
        int[] num = new int[26];
        for (int i = 0; i < s.length(); i++) {
            num[s.charAt(i) - 'a']++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!vis[ch - 'a']) {
                while (sb.length() > 0 && sb.charAt(sb.length() - 1) > ch) {
                    if (num[sb.charAt(sb.length() - 1) - 'a'] > 0) {
                        vis[sb.charAt(sb.length() - 1) - 'a'] = false;
                        sb.deleteCharAt(sb.length() - 1);
                    } else {
                        break;
                    }
                }
                vis[ch - 'a'] = true;
                sb.append(ch);
            }
            num[ch - 'a'] -= 1;
        }
        return sb.toString();
    }


}
