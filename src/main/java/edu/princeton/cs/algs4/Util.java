package edu.princeton.cs.algs4;

/**
 * Created by sijiansheng on 2017/11/14.
 */
public class Util {

    // TODO: 2017/11/14 有没有类似scala的上界和下界的方法 2017/11/21可以使用类型转换，实例化类的时候确定一个class。 public class Util<Key>
    public static void printArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i]);
                System.out.println();
            } else {
                System.out.print(array[i] + " ");
            }
        }
    }

    public static void printArray(Comparable[] array) {

        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i]);
                System.out.println();
            } else {
                System.out.print(array[i] + " ");
            }
        }
    }

    public static void printArray(Comparable[] array, String arrayName) {
        System.out.print("[array]" + arrayName + ":");
        printArray(array);
    }
}
