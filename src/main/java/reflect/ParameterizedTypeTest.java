package reflect;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @author sijiansheng
 * @version V1.0
 * @ClassName ParameterizedTypeTest
 * @Description
 * @copyright 上海容易网电子商务股份有限公司.
 * @Date 2018/11/13 11:35
 */
public class ParameterizedTypeTest {

    public static void main(String[] args) {
        ParamTest paramTest = new ParamTest<String,Integer>();
    }


}

class ParamTest<T1, T2> {
    class A {
    }

    class B extends A {
    }

    private Class<T1> entityClass;

    protected ParamTest() {
        Type type = getClass().getGenericSuperclass();
        System.out.println("getClass()==" + getClass());
        System.out.println("type = " + type);
        Type trueType = ((ParameterizedType) type).getActualTypeArguments()[0];
        System.out.println("trueType1 = " + trueType);
        trueType = ((ParameterizedType) type).getActualTypeArguments()[1];
        System.out.println("trueType2 = " + trueType);
        this.entityClass = (Class<T1>) trueType;


        B t = new B();
        type = t.getClass().getGenericSuperclass();

        System.out.println("B is A's super class :" + ((ParameterizedType) type).getActualTypeArguments().length);
    }

}
