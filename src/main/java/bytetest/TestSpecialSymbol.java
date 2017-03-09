package bytetest;

/**
 * Created by sijiansheng on 2017/1/17.
 */
public class TestSpecialSymbol {


    public static void main(String[] args) {
        int t = 1000;
        byte[] arr = new byte[2];
        arr[0] = (byte) t;
        arr[1] = (byte) (t & 0xFF);
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println((t |= (10047 & 0xFF)));//todo 这个结果还不是很明白
//        System.out.println(arr |= ((byte)t);
//        System.out.println((byte) t & 0xFF);
//        System.out.println(((byte) t << 8 & 0xFF) |= (byte) t & 0xFF);
    }

}
