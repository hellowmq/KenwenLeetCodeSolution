package com.wenmq.byt.bind;

/**
 * Created by  @ifans.wen
 *
 * @date 2020/10/13.
 */
public class StaticMethodHide {

    /**
     * 1. 在 C 中查找符合名字及描述符的方法。
     * 2. 如果没有找到，在 C 的父类中继续搜索，直至 Object 类。
     * 3. 如果没有找到，在 C 所直接实现或间接实现的接口中搜索，这一步搜索得到的目标方法必须是非私有、非静态的。并且，如果目标方法在间接实现的接口中，则需满足 C 与该接口之间没有其他符合条件的目标方法。如果有多个符合条件的目标方法，则任意返回其中一个。
     */
    static class MethodParent {
        static void start() {
            System.out.println("start MethodParent");
        }

        static void end() {
            System.out.println("end MethodParent");
        }
    }

    /**
     * javac -g:vars StaticMethodHide.java &&  javap -c -v StaticMethodHide.MethodSon
     */
    static class MethodSon extends MethodParent {
        /**
         * 声明和父类相同的静态方法，这里的本质是隐藏而非重载。
         * 此时父类的静态成员依然存在只是无法访问到。
         * "@Override" 注解会直接报错
         */
        static void start() {
            System.out.println("start MethodSon");
        }
        /**
         * 不声明和父类相同的静态方法，父类的静态成员能通过子类的静态调用。
         * @Override 注解会直接报错
         */
    }

    /**
     * 这说明静态方法无法被重载，可以通过子类来调用，子类的静态方法会隐藏父类的方法签名相同的方法
     */
    public static void main(String[] args) {
        MethodSon.start(); // start MethodSon
        MethodSon.end(); // end MethodParent
    }


}
