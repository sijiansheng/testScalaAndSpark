package test.date;

import java.text.SimpleDateFormat;

/**
 * Created by sijiansheng on 2017/12/7.
 */
public class DateFormatTest {
    
    public static void main(String[] args){
        System.out.println(new SimpleDateFormat("HH").format(System.currentTimeMillis()));
    }
}
