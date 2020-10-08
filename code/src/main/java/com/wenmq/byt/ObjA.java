package com.wenmq.byt;

/**
 * javac -g:vars ObjA.java &&  javap -c -v ObjA
 */
class ObjA implements Runnable {

    int fieldA;
//    public boolean fieldB;
//
//    public int getA() {
//        return fieldA;
//    }
//
//    public void setA(int a) {
//        this.fieldA = a;
//    }

    @Override
    public void run() {
        int tag;
        boolean flag = true;
        if (flag) {
            int left = 0;
            tag = left;
        } else {
            int right = 0;
            tag = right;
        }
    }

//    public void setZero() {
//        int index = 0;
//        setA(index);
//    }
}
