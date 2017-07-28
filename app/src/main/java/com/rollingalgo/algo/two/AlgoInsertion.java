package com.rollingalgo.algo.two;

import static java.lang.System.out;

/**
 * 插入算法
 * 为了给要 入的元  出 间，我们需要将其 所有元 在 入之前都向右  动一位。这种算法 做插入排序
 * <p>
 * <p>
 * 总的来说， 插入排序对于部分有序的数  十分高效，也很适合小规模数 。
 * Created by qishoudong on 2016/11/17.
 */

public class AlgoInsertion {

    public static void sort(Comparable[] num) {
        int N = num.length;
        for (int i = 1; i < N; i++) {
            for (int j = i; j > 0 && AlgoUtil.less(num[j], num[j - 1]); j--) {
                AlgoUtil.exch(num, j, j - 1);
            }
        }

    }

    public static void main(String[] a) {
//        Comparable[] num = new Comparable[]{5, 4, 2, 7, 6, 3,
//        };
        Comparable[] num = new Comparable[]{2, 4, 5, 3
        };
        sort(num);
        for (Comparable i : num) {
            out.println("sort-----" + i);
        }
    }
}
