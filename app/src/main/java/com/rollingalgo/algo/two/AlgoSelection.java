package com.rollingalgo.algo.two;

import static java.lang.System.out;

/**
 * 选择算法
 * 先找到数中最小的那个元，其次，将它和数的第一个元位
 * (如果第一个元 就是最小元 那么它就和自己  )。再次，在下的元中找到最小的元 ，将它与数的第二个元位 。
 * 如此复， 到将整个数排序。这种方法做选择排序，因为它在不断地选择元之中的最小者
 * Created by qishoudong on 2016/11/15.
 */

public class AlgoSelection {
    /**
     * 方法一
     *
     * @param a
     */
    public static void selectSort(int[] a) {
        int minIndex = 0;
        int temp = 0;
        for (int i = 0; i < a.length - 1; i++) {
            minIndex = i;//无序区的最小数据数组下标
            for (int j = i + 1; j < a.length; j++) {
                //在无序区中找到最小数据并保存其数组下标
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }
            out.println("minIndex-----" + minIndex);
            if (minIndex != i) {
                //如果不是无序区的最小值位置不是默认的第一个数据，则交换之。
                temp = a[i];
                a[i] = a[minIndex];
                a[minIndex] = temp;
            }
            out.println("--i-----i" + i);
        }
    }

    /**
     * 方法二
     *
     * @param num
     */
    public static void sort(Comparable[] num) {
        int N = num.length;
        int min = 0;
        for (int i = 0; i < N; i++) {
            min = i;
            for (int j = i + 1; j < N; j++) {
                if (AlgoUtil.less(num[j], num[min])) {
                    min = j;
                }
            }
            AlgoUtil.exch(num, i, min);
        }
    }


    /**
     * 例子:  班级有5个人,他们随机
     * @param a
     */

    public static void main(String[] a) {
//        int[] num = new int[]{
//                5, 2, 9, 7, 6, 3,
//        };
//        selectSort(num);
        Comparable[] num = new Comparable[]{
                5, 5, 4, 2, 9, 7, 6, 3,
        };
        sort(num);
        for (Comparable i : num) {
            out.println("sort-----" + i);
        }
    }
}
