package edu.princeton.cs.algs4.personal;

/**
 * Created by sijiansheng on 2017/11/21.
 * elem[]数组用来按照座位号存成绩；
 * elemIndex[]用来存座位号，按照成绩的大小整理为堆结构;
 * heapIndex[]用来按照座位号存该座位号在堆中的位置，因此与上面的数组存的数据刚好逆序，即elemIndex[heapInde[i]]=i。
 */
public class IndexMaxPQ<Key> {
    int[] heapLocationOfIndex;//以索引的key值排序的二叉堆
    int[] keyIndexs;//key的索引
    Key[] keys;
    int n;//排序对象的数量

    public IndexMaxPQ(int maxN) {
        if (maxN < 0) throw new IllegalArgumentException();
        heapLocationOfIndex = new int[maxN + 1];
        keyIndexs = new int[maxN + 1];
        keys = ((Key[]) new Object[maxN + 1]);
    }

    public void insert(int index, Key key) {
        keys[index] = key;
        heapLocationOfIndex[index] = n;
        keyIndexs[n] = index;
        n++;
    }

    public void change(int index, Key newKey) {

    }

    public void contains(int index) {

    }

    public void swim(int heapIndex) {
        while (heapIndex > 1 && less(heapIndex / 2, heapIndex)) {
            exch(heapIndex, heapIndex / 2);
            heapIndex = heapIndex / 2;
        }
    }

    private Boolean less(int a, int b) {
        return keyIndexs[a] < keyIndexs[b];
    }

    private void exch(int a, int b) {
        int tempKeyIndex = keyIndexs[a];
        keyIndexs[a] = keyIndexs[b];
        keyIndexs[b] = tempKeyIndex;
//        int
//        heapLocationOfIndex[]
    }
}
