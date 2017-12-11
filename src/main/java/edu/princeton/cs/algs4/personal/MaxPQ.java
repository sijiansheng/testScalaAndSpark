package edu.princeton.cs.algs4.personal;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Comparator;
import java.util.Iterator;

/**
 * Created by sijiansheng on 2017/11/20.
 */
// TODO: 2017/11/20 继承Iterable接口有什么用
public class MaxPQ<Key> implements Iterable<Key> {
    Comparator comparator;
    int N;
    private Key[] pq;

    private MaxPQ() {
        this(1);
    }

    private MaxPQ(int initCapacity) {
        pq = (Key[]) new Object[initCapacity + 1];
        N = 0;
    }

    @Override
    public Iterator<Key> iterator() {
        return null;
    }

    private Boolean less(int a, int b) {
        if (comparator == null) {
            return ((Comparable<Key>) pq[a]).compareTo(pq[b]) < 0;
        } else {
            return comparator.compare(pq[a], pq[b]) < 0;
        }
    }

    private Key max() {
        return pq[1];
    }

    private Key deleteMax() {
        //实际上是数组是从1开始的，如果从0开始，2K就还是0了。
        Key result = pq[1];
        pq[1] = pq[N--];
        pq[N + 1] = null;
        sink(1);
        //N只代表有效的数值的位置
        if (N > 0 && N == (pq.length - 1) / 4) resize(pq.length / 2);
        return result;
    }

    private void insert(Key key) {
        if (N == pq.length - 1) resize(pq.length * 2);
        pq[++N] = key;
        swim(N);
    }


    public void swim(int k) {
        while (k > 1 && less(k / 2, k)) {
            exch(k / 2, k);
            k = k / 2;
        }
    }

    public void sink(int k) {

        //同样效果的代码，算法自带的代码明显更简洁
        while (2 * k <= N) {
            int moreSon = k * 2;
            if (moreSon+1 < N && less(k * 2, k * 2 + 1)) moreSon = k * 2 + 1;
            if (less(k, moreSon)) {
                exch(k, moreSon);
                k = moreSon;
            }else{
                break;
            }
        }
    }

    private Boolean isEmpty() {
        return N == 0;
    }

    public void exch(int a, int b) {
        Key temp = pq[a];
        pq[a] = pq[b];
        pq[b] = temp;
    }

    private void resize(int n) {
        Key[] newPQ = (Key[]) new Object[n];
        for (int i = 1; i <= N; i++) {
            newPQ[i] = pq[i];
        }
        pq = newPQ;
    }

    private int size() {
        return N;
    }

    public static void main(String[] args) {
//        {"S", "H", "E", "L", "L", "S", "O", "R", "T", "E", "X", "A", "M", "P", "L", "E"};
        MaxPQ<String> pq = new MaxPQ<String>();
        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if (!item.equals("-")) pq.insert(item);
            else if (!pq.isEmpty()) StdOut.print(pq.deleteMax() + " ");
        }
        StdOut.println("(" + pq.size() + " left on pq)");
    }
}
