package com.wenmq.code;


import com.wenmq.code.sun.FloatingDecimal;

public class MainClass {

    public static void main(String[] args) {

//        System.out.println("amountStr".substring(0, 3));
//        int[] nums = {0,1000, 9999, 10000, 10001,
//                10049, 10050, 10099, 10100,
//                10499, 10500, 10999, 11000,
//                12345, 99999, 100000,100500};
//        //        0 1 2 10 100 999 1000 9999 1W 1W 1.04W 1.05W 1.09W 1.1W 1.23W 9.99W 10W
//
//        int[] ints = {0, 9999, 10000, 12690};
//        buildOutput(nums);
//        buildOutput(ints);
        String[] strs = {
//                "1.4e4",
//                "1.5e5",
                "1.5e6",
                "1.5e7",
                "1.5e8"
        };

        double[] doubles = {
//                "1.4e4",
//                "1.5e5",
                1.5e6,
                1.5e7,
                1.5e8
        };

//        for (String str :
//                strs) {
//            try {
//                System.out.println(
//                        FloatingDecimal.toJavaFormatString(
//                                FloatingDecimal.parseDouble(str)
//                        ));
//
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
        for (double str :
                doubles) {
            try {
                System.out.println(
                      Double.valueOf(str)
                );
                System.out.println(
                        FloatingDecimal.toJavaFormatString(
                                str
                        ));

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

//        for (double str :
//                doubles) {
//            try {
//                System.out.println(
////                        FloatingDecimal.toJavaFormatString(
//                        str
////                        )
//                );
//
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }

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






