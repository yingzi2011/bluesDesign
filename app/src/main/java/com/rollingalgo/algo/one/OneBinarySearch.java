package com.rollingalgo.algo.one;

/**
 * 二分查找例子
 * Created by qishoudong on 2016/11/11.
 */

public class OneBinarySearch {

    /**
     *
     * @param key
     * @param a
     * @return
     */
    public static int rank(int key, int[] a) { // 数组   有序的
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) { //  查找的键   存      存 于a[lo..hi] 中
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }

    public static void main(String[] arg0) {

    }
}
