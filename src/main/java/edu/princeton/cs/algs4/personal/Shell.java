package edu.princeton.cs.algs4.personal;

import static edu.princeton.cs.algs4.Util.printArray;

/**
 * Created by sijiansheng on 2017/11/14.
 */
public class Shell {

    public static void exch(Object[] array, int x, int y) {
        Object temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }

    public static void sort(Comparable[] array) {

        int n = array.length;
        int h = 0;
        while (h < n / 3) h = h * 3 + 1;

        while(h>=1){

            for (int i = h; i <= n; i ++) {
                for (int j = i; j >= h &&less(array,j,j-h);j-=h){
                    exch(array,j,j-h);
                }
            }
            h=h/3;
        }

    }

    public static boolean less(Comparable[] array, int a, int b) {
        return array[a].compareTo(array[b]) < 0;
    }

    public static void main(String[] args){

        System.out.println("personal");
        String[] a = new String[]{"S", "H", "E", "L", "L", "S", "O", "R", "T", "E", "X", "A", "M", "P", "L", "E"};
        System.out.println("array length is:" + a.length);
        printArray(a);
        edu.princeton.cs.algs4.Shell.sort(a);
//        show(a);
        printArray(a);  ;
    }
}
