package algorithm;

import java.io.File;
import java.nio.file.Path;

/**
 * Created by sijiansheng on 2017/2/4.
 */
public class ThreeSum {
    public static int count(int[] a) {
        int N = a.length;
        int cnt = 0;
        int all = 0;
        for (int i = 0; i < N; i++)
            for (int j = i + 1; j < N; j++)
                for (int k = j + 1; k < N; k++) {
                    all++;
                    System.out.println("i:"+i);
                    System.out.println("j:"+j);
                    System.out.println("k:"+k);
                    if (a[i] + a[j] + a[k] == 0)
                        cnt++;
                }

        return all;
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 4, -2, -1, -6, -3, -1, -7, -8, -11, 2, 3, 4, 5};
        System.out.println(count(a));
    }

//    public static int[] readLine(String path){
//        File file = new File(path);

//    }
}
