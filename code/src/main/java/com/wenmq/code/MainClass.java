package com.wenmq.code;


public class MainClass {

    public static void main(String[] args) {

    }

    private static void buildOutput(int[] nums) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            stringBuilder
                    .append(nums[i])
                    .append(" ")
                    .append(NumberFormatTool.formatNumberWithWHalfUp(nums[i], 2))
                    .append("\n");
        }
        String s = stringBuilder.toString();
        System.out.println(s);
    }


}






