package com.rollingalgo.algo.two;

/**
 * Created by qishoudong on 2016/11/14.
 */

public class AlgoUtil {
    /**
     * 比较大小
     *
     * @param numOne
     * @param numOther
     * @return
     */
    public static boolean less(Comparable numOne, Comparable numOther) {
        return numOne.compareTo(numOther) < 0;
    }

    /**
     * 交换
     *
     * @param numInfo
     * @param i
     * @param j
     */
    public static void exch(Comparable[] numInfo, int i, int j) {
        Comparable comparable = numInfo[i];
        numInfo[i] = numInfo[j];
        numInfo[j] = comparable;
    }

    /**
     * 判断是否数组是否是有序
     *
     * @param comparables
     * @return
     */
    public static boolean isSorted(Comparable[] comparables) {
        for (int i = 1; i < comparables.length; i++) {
            if (less(comparables[i], comparables[i - 1])) {
                return false;
            }
        }
        return true;
    }

    public static void sort(Comparable[] a){

    }



//    public static double time(String alg, Comparable[] a) {
////        Stopwatch timer = new Stopwatch();
////        if (alg.equals("Insertion")) AlgoInsertion.sort(a);
////        if (alg.equals("Selection")) AlgoSelection.sort(a);
////        return  timer.elapsed()
//    }



}
