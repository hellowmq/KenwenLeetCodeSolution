package com.wenmq.java;

public class JavaEqualsCase {
    @SuppressWarnings({
            "UseValueOf",
            "deprecation",
            "NumberEquality",
            "StringEquality",
            "ConstantConditions",
            "CachedNumberConstructorCall",
            "NewObjectEquality"
    })
    public static void main() {
        // 此时两个字符串的对象实际上是同一个对象
        System.out.println("ab" == "ab");
        // 此时两个 Integer 的对象会引用到缓存池中的对象
        System.out.println(Integer.valueOf(1) == Integer.valueOf(1));
        // new 方式构造的 Integer 对象不会进入缓存池
        System.out.println(new Integer(1) == new Integer(1));
        System.out.println(Integer.valueOf(128) == Integer.valueOf(128));
    }
}
