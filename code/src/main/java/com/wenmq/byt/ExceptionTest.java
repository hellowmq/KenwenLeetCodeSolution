package com.wenmq.byt;

/**
 * 当发生 return 时，
 * ``编译器`` 插入了一个 临时变量用于缓存 return 的操作数（字面量或者引用）
 * 除了通过内存地址的修改，否则一切对于返回操作数的修改都将不起作用
 * 无效的操作包括：
 * - 修改字面量的值
 * - 修改引用的地址
 *
 *
 * jvm 指令中，finally 语法块会以冗余的方式插入到 try 和 catch 之后
 *
 */
public class ExceptionTest {


//    public String testStringException() {
//
//        try {
//            inside_try();
//            return "000000";
//        } catch (Exception e) {
//            inside_catch(e);
//            return "1111111";
//        } finally {
//            inside_finally();
//            return "2222222";
//
//        }
//    }

    /**
     * @return 1111111 when exception
     *         1111111 when no exception
     */
    public String testException2() {
        String s = "";
        try {
            inside_try();
            s = "0000000";
            return s;
        } catch (Exception e) {
            inside_catch(e);
            s = "1111111";
            return s;
        } finally {
            inside_finally();
            s = "2222222";
        }
    }

    /**
     * @return 2222222 when exception
     *         2222222 when no exception
     * return 语句会更新到局部变量表
     */
    public String testException3() {
        String s;
        try {
            inside_try();
            s = "0000000";
            return s;
        } catch (Exception e) {
            inside_catch(e);
            s = "1111111";
            return s;
        } finally {
            inside_finally();
            s = "2222222";
            return s;
        }
    }

    /**
     * @return 1 when exception
     *         0 when no exception
     */
    public int testException4() {
        int s;
        try {
            inside_try();
            s = 0;
            return s;
        } catch (Exception e) {
            inside_catch(e);
            s = 1;
            return s;
        } finally {
            inside_finally();
            s = 2;
        }
    }
    /**
     * @return [1] when exception
     *         [2] when no exception
     */
    public int[] testException5() {
        int[] s = {0};
        try {
            inside_try();
            s[0] = 0;
            return s;
        } catch (Exception e) {
            inside_catch(e);
            s[0] = 1;
            return s;
        } finally {
            inside_finally();
            s[0] = 2;
        }
    }

    /**
     * @return 11111112222222 when exception
     *         00000002222222 when no exception
     */
    public StringBuilder testException6() {
        StringBuilder s = new StringBuilder();
        try {
            inside_try();
            s.append("0000000");
            return s;
        } catch (Exception e) {
            inside_catch(e);
            s.append("1111111");
            return s;
        } finally {
            inside_finally();
            s.append("2222222");
        }
    }

    public boolean exceptionAllow;

    //分别为try块、catch块和finally块中被调用的函数
    public void inside_try() throws Exception {
        if (exceptionAllow) throw new NullPointerException();
    }

    public void inside_catch(Exception e) {
    }

    public void inside_finally() {
    }
}