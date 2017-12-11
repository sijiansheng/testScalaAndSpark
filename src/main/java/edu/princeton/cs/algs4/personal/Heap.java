package edu.princeton.cs.algs4.personal;

import static edu.princeton.cs.algs4.Util.printArray;

/**
 * Created by sijiansheng on 2017/11/22.
 */
public class Heap {

    public Heap() {
    }

    private static void sort(Comparable[] a) {
        int n = a.length;

        for (int k = n / 2; k >= 1; k --) {
            sink(a, k, n);
        }

        while (n > 0) {
            exch(a, 1, n--);
            sink(a, 1, n);
        }
    }

    private static void sink(Comparable[] a, int k, int n) {
        while (2*k <= n) {
            int j = k * 2;
            if (j  < n && less(a, j, j + 1)) j++;
            if (!less(a, k, j)) break;
            exch(a, k, j);
            k = j;
        }
    }

    private static boolean less(Comparable[] pq, int i, int j) {
        return pq[i - 1].compareTo(pq[j - 1]) < 0;
    }

    private static void exch(Object[] pq, int i, int j) {
        Object swap = pq[i - 1];
        pq[i - 1] = pq[j - 1];
        pq[j - 1] = swap;
    }

    public static void main(String[] args) {
        String[] a = {"0", "2", "4", "8", "1", "1", "3", "5", "5", "7"};
        Heap.sort(a);
        printArray(a);
    }

}
