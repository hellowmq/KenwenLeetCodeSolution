package com.wenmq.cn.leetcode;

import java.util.List;

/**
 * Q1773
 * https://leetcode-cn.com/problems/count-items-matching-a-rule/
 */
public class Solution1773 {
    /**
     * items[i] = [typei, colori, namei]
     * 1 <= items.length <= 104
     * 1 <= typei.length, colori.length, namei.length, ruleValue.length <= 10
     * ruleKey 等于 "type"、"color" 或 "name"
     * 所有字符串仅由小写字母组成
     */
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int index = 0;
        switch (ruleKey) {
            case "type":
                index = 0;
                break;
            case "color":
                index = 1;
                break;
            case "name":
                index = 2;
                break;
            default:
                // ignore
        }
        int count = 0;
        for (List<String> item : items) {
            if (item.get(index).equals(ruleValue)) {
                count++;
            }
        }
        return count;
    }

}
