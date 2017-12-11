package test.fortest;

/**
 * Created by sijiansheng on 2017/9/11.
 */
public class SpecialForCirculation {

    public static void main(String[] args) {
        for (int i = 6; i < 10 && i >8; i++) {
            System.out.println(i);
        }

        //只要i>=10或者i<8,就直接打破循环

        //跟下面不一样
   /*     for (int i = 0; i < 10; i++) {
            if (i > 5) {
                System.out.println(i);
            }
        }*/
    }

}
