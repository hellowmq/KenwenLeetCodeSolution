package com.wenmq.byt;

/**
 * Created by  @ifans.wen
 *
 * @date 2020/9/9.
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

    public int testException5() {
        int[] s = {0};
        try {
            inside_try();
            s[0] = 0;
            System.out.println(s[0]);
            return s[0];
        } catch (Exception e) {
            inside_catch(e);
            s[0] = 1;
            System.out.println(s[0]);
            return s[0];
        } finally {
            inside_finally();
            s[0] = 2;
        }
    }

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