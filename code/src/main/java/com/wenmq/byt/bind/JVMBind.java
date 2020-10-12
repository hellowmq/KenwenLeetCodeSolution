package com.wenmq.byt.bind;

/**
 * Created by  @ifans.wen
 *
 * @date 2020/10/12.
 * <p>
 * javac -g:vars JVMBind.java &&  javap -c -v JVMBind.Dog
 */
public class JVMBind {


    /**
     * invokestatic：用于调用静态方法。
     * invokespecial：用于调用私有实例方法、构造器，以及使用 super 关键字调用父类的实例方法或构造器，和所实现接口的默认方法。
     * invokevirtual：用于调用非私有实例方法。
     * invokeinterface：用于调用接口方法。
     * invokedynamic：用于调用动态方法。// 比较复杂
     *
     * @param args
     */


    /**
     * Created by  @ifans.wen
     *
     * @date 2020/10/12.
     */
    public static class Dog extends Animal implements Word {

        /**
         * javap -c -v JVMBind.Dog
         */
        void globalInvoke() {

            /**
             * invokestatic
             * 调用非私有实例方法
             * 动态绑定
             */
            String s = String.valueOf(this);
            /**
             * invokeinterface
             * 调用非私有实例方法
             * 动态绑定
             */
            Word say = this;
            String word = say.word(); // "invokeinterface"
            /**
             * invokespecial
             * 用于调用私有实例方法、构造器，以及使用 super 关键字调用父类的实例方法或构造器，和所实现接口的默认方法。
             * 静态绑定
             */
            super.saySomething("invokespecial"); // "invokespecial"

            /**
             * invokevirtual
             * 调用非私有实例方法
             * 动态绑定
             */
            saySomething(s); // "invokevirtual"

        }

        @Override
        public void saySomething(String word) {
            System.out.println(word);
        }


        @Override
        public String word() {
            return null;
        }
    }

    /**
     * Created by  @ifans.wen
     *
     *
     * @date 2020/10/12.
     */
    public static class Animal {

        public void saySomething(String word) {
        }

    }

    interface Word {
        String word();
    }

}
