package com.wenmq.code;

/**
 * @author ifans.wen
 * @date 2020/3/16
 * @description
 */

import java.util.Random;

public class UnionSet {

    private int count;// 元素数量
    private int[] rank; // 层数
    private int[] parent;// 节点

    UnionSet(int count) { //初始化操作
        this.count = count;
        rank = new int[count];
        parent = new int[count];

        for (int i = 0; i < count; i++) {
            rank[i] = 1;
            parent[i] = i;

        }

    }

    public void union(int p, int q) { // 合并两个元素

        int pRoot = find(p); //定位到其根节点
        int qRoot = find(q);
        if (pRoot == qRoot) //如果两个都相等，证明已经是连接好的，不必再合并
            return;

        if (rank[pRoot] > rank[qRoot]) { //如果p根节点的层数大于q的，那么将qRoot接到pRoot下面，这样接好以后层级不会增加
            parent[qRoot] = pRoot;

        } else if (rank[pRoot] < rank[qRoot]) {

            parent[pRoot] = qRoot;
        } else //如果等于，则随便哪边层级都会加一
        {
            parent[pRoot] = qRoot;
            rank[qRoot] = rank[qRoot] + 1;
        }


    }

    public int find(int p) {// 查找元素 返回根元素

        while (p != parent[p]) {
            parent[p] = parent[parent[p]]; //路径压缩
            p = parent[p];
        }

        return p;
    }

    public boolean isConnected(int p, int q) {

        return find(p) == find(q);
    }

    public static void test() {
        UnionSet uf = new UnionSet(10);
        int[] a = {1, 1, 1, 5, 3, 2, 2, 4, 4};
        int[] b = {9, 7, 6, 1, 2, 3, 4, 3, 8};
        for (int i = 0; i < a.length; i++) {
            uf.union(a[i], b[i]);
        }
//        for (int i = 0; i < uf.count; i++) {
//            for (int j = i + 1; j < uf.count; j++) {
//                System.out.println("i=" + i + " j=" + j + " is connected=" + uf.isConnected(i, j));
//            }
//        }
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < uf.parent.length; i++) {
            sb.append(uf.parent[i] + " ");
        }
        System.out.println(sb);


    }

    public static void main1(String[] arg) {

        int N = 10000000;
        N /= 10000;
        UnionSet uf = new UnionSet(N);
        double startTime = System.currentTimeMillis();
        int tempA;
        int tempB;
        Random random = new Random();
        //进行N次合并操作
        for (int i = 0; i < N; i++) {
            tempA = random.nextInt(N) % N;
            tempB = random.nextInt(N) % N;
            uf.union(tempA, tempB);

        }
        //进行N次查找
        for (int i = 0; i < N; i++) {
            tempA = random.nextInt(N) % N;
            tempB = random.nextInt(N) % N;
            uf.isConnected(tempA, tempB);

        }

        double endTime = System.currentTimeMillis();

        System.out.println(endTime - startTime);

    }


}