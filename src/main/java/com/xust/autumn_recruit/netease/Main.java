package com.xust.autumn_recruit.netease;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Model> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new Model(sc.nextLong(), sc.nextLong()));
        }
        sc.close();
        long res = 0;
        for (Model one : list) {
            if (one.x == 1 && one.y == 1) {
                res = 1;
            } else if (one.x == 1) {
                res = one.y - 2;
            } else if (one.y == 1) {
                res = one.x - 2;
            } else if (one.x == 2 || one.y == 2) {
                res = 0;
            } else if (one.x > 2 && one.y > 2) {
                res = (one.x - 2) * (one.y - 2);
            }
            System.out.println(res);
        }
    }


    static class Model {
        Long x;
        Long y;

        Model(Long x, Long y) {
            this.x = x;
            this.y = y;
        }
    }
}
