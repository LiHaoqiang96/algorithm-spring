package com.xust.autumn_recruit.laohuzhengquan;

public class Main {
    class Edge {
        private int a;
        private int b;

    }
    boolean isConnected (Edge[] graph, int p, int q) {
        Boolean bool = false;
        int len = graph.length;
        int[][] array = new int[len][2];
        for (int i = 0; i < len; i++) {
            array[i][0] = graph[i].a;
            array[i][1] = graph[i].b;
        }

        for (int i = 0; i < len - 1; i++) {
            if (array[i][0] == p) {
                if (array[i][1] == q) {
                    bool = true;
                }else {
                    for (int j = 0; j < len; j++) {
                        if (i == j) {
                            continue;
                        }
                    }
                }
            }
        }
        return bool;
    }

    public static void main(String[] args) {
    }

}
