package com.rollingalgo.algo;

import static java.lang.System.out;

/**
 * Created by qishoudong on 2016/11/8.
 */

public class Test {
    public static void main(String[] str) {
        out.print("ceshi:"+gcd(11,0));
    }


    public static int gcd(int p, int q) {
        if (q == 0) return p;
        int r = p % q;
        return gcd(q, r);
    }
}
