package com.rollingalgo.algo.two;

import static java.lang.System.out;

/**
 * 希尔排序
 * 插入排序的优化
 * 希尔排序为了加快速度简单地改进了插入排序，  交换不相邻的元素以对数组的局部进行排序，并最终用插入排序将局部有序的数组排序。
 *
 * @author qishoudong
 */
public class AlgoShellSort {

    public static void sort(Comparable[] num) {
        int N = num.length;
        int h = 1;
        while (h < N / 3) {
            h = 3 * h + 1;
        }
        while (h >= 1) {
            //将数组变为h有序
            for (int i = 1; i < N; i++) {
                // 将a[i]插入 a[i-h], a[i-2*h], a[i-3*h]...  中
                for (int j = i; j >= h && AlgoUtil.less(num[j], num[j - h]); j -= h) {
                    AlgoUtil.exch(num, j, j - 1);
                }
            }
            h = h / 3;
        }

    }

    public static void main(String[] a) {
//        Comparable[] num = new Comparable[]{5, 4, 2, 7, 6, 3,
//        };
        Comparable[] num = new Comparable[]{11, 42, 23, 555, 22, 55, 99, 67, 102, 4, 5, 3, 331, 87, 43, 21
        };
        sort(num);
        for (Comparable i : num) {
            out.println("sort-----" + i);
        }
    }
}
