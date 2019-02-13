package com.xust.autumn_recruit.laohuzhengquan;

public class Main1 {
    private int count;// 记录连同集数，刚开始的时候为N
    private int[] id;// 用来记录每个点属于哪个集合
    private int[] size;// 加权unionfind算法使用，记录每个连同集内节点个数

    public Main1(int N) {
        count = N;
        id = new int[N];
        size = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
            size[i] = 1;
        }
    }

    /*
     * 返回连同集数
     */
    public int count() {
        return count;
    }

    /*
     * 判断两个节点是否连同
     */
    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }

    /*
     * 查找p属于什么集合
     */
    public int find_quickFind(int p) {
        return id[p];
    }

    /*
     * 将两个节点相连
     */
    public void union_quickFind(int p, int q) {
        if (id[q] == id[q])
            return;
        int a = id[p], b = id[q];
        for (int i = 0; i < id.length; i++) {
            if (id[i] == a)
                id[i] = b;
        }
        count--;// 连同集数减1
    }

    /*
     * 查找p属于什么集合
     */
    public int find_quickUnion(int p) {
        while (p != id[p])
            p = id[p];
        return p;
    }

    /*
     * 将两个节点相连
     */
    public void union_quickUnion(int p, int q) {
        // 首先要判断pq是否呼吁同一个连同集
        int pRoot = find_quickUnion(p), qRoot = find_quickUnion(q);
        if (pRoot != qRoot) {
            id[pRoot] = qRoot;
            count--;
        }
    }

    /*
     * 查找p属于什么集合
     */
    public int find_weightedQuickUnion(int p) {
        while (p != id[p])
            p = id[p];
        return p;
    }

    /*
     * 将两个节点相连
     */
    public void union_weightedQuickUnion(int p, int q) {
        // 首先要判断pq是否呼吁同一个连同集
        int pRoot=find_weightedQuickUnion(p),qRoot=find_weightedQuickUnion(q);
        if(pRoot==qRoot)
            return;
        if(size[pRoot]>size[qRoot]){
            id[qRoot]=pRoot;
            size[pRoot]+=size[qRoot];
        }else{
            id[pRoot]=qRoot;
            size[qRoot]+=size[pRoot];
        }
        count--;
    }

}