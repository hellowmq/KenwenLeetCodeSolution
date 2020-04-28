package com.wenmq.code;

import java.util.List;

/**
 * @author ifans.wen
 * @date 2020/4/28
 * @description
 */
public class CyclicShift {
//    a b =>  b a
//    12345 => 45123;
//a b    => a_ b_
//    123 45 => 321 54;
//    a_ b_ => (a_ b_)_ = b a
//    321 54 => 45 123
//
//
//    a_ b_ = (b a)_


    public static void main(String[] args) {
        testCyclicShift();
    }

    int follow = 0x00;




    static void testCyclicShift() {
        String a = "12345";
        String b = "67890";

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("a_: " + reverse(a));
        System.out.println("b_: " + reverse(b));
        System.out.println("(b a)_: " + reverse(b + a));
        System.out.println("a_ + b_: " + reverse(a) + reverse(b));
        System.out.println("(a_ + b_)_: " + reverse(reverse(a) + reverse(b)));
    }





    /**
     * 反转字符串,把from字符串反转过来（很常见牢记）
     * 字符串求长度用length(),数组求长度用length
     *
     * @param from
     * @return
     */
    public static String reverse(String from) {
        char[] froms = from.toCharArray();
        for (int i = 0; i < from.length() / 2; i++) {
            char temp = froms[i];
            froms[i] = froms[from.length() - 1 - i];
            froms[froms.length - 1 - i] = temp;
        }
        return String.valueOf(froms);
    }

    public static <E> List<E> reverse(List<E> from) {
        for (int i = 0; i < from.size() / 2; i++) {
            E temp = from.get(i);
            from.set(i, from.get(from.size() - 1 - i));
            from.set(from.size() - 1 - i, temp);
        }
        return from;
    }


}
