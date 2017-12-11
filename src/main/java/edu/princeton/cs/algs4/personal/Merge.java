package edu.princeton.cs.algs4.personal;

import static edu.princeton.cs.algs4.Util.printArray;

/**
 * Created by sijiansheng on 2017/11/16.
 */
public class Merge {

    public static void sort(Comparable[] a, Comparable[] aux, int lo, int hi) {
        if (lo >= hi) return;
        int mid = lo + (hi - lo) / 2;
        sort(a, aux, lo, mid);
        sort(a, aux, mid+1, lo);
        merge(a, aux, lo, mid, hi);
    }

    public static void sort(Comparable[] a) {

        Comparable[] aux = new Comparable[a.length];
        int hi = a.length - 1;

        for (int i = 0; i < a.length; i++) {
            aux[i] = a[i];
        }
        sort(a, aux, 0, hi);
    }

    public static void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi) {

        assert isSorted(a, lo, mid);
        assert isSorted(a, mid + 1, hi);
        int i = lo;
        int j = mid + 1;
        for (int k = lo; k <= hi; k++) {
            System.out.println("k:" + k + ",i:" + i + ";j:" + j);
            if (i > mid) a[k] = aux[j++];
            else if (j > hi) a[k] = aux[i++];
            else if (less(aux[j], aux[i])) a[k] = aux[j++];
            else a[k] = aux[i++];
        }
    }

    public static Boolean less(Comparable a, Comparable b) {
        return a.compareTo(b) < 0;
    }

    public static void main(String[] args) {
//        String[] a1 = {"0", "2", "4", "8", "10", "1", "3", "5", "5", "7"};
//        sort(a1);
//        printArray(a1);
        String[] a1 = {"0", "2", "4", "8", "10", "1", "3", "5", "5", "7"};
        String[] aux1 = {"0", "2", "4", "8", "10", "1", "3", "5", "5", "7"};
        merge(a1, aux1, 0, 4, 9);
        printArray(a1);
    }


    private static boolean isSorted(Comparable[] a, int lo, int hi) {
        for (int i = lo + 1; i <= hi; i++)
            if (less(a[i], a[i - 1])) return false;
        return true;
    }

}
