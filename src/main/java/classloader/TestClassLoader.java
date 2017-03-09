package classloader;

/**
 * Created by sijiansheng on 2016/9/27.
 */
public class TestClassLoader {

    public static void main(String[] args) {

//        Test11 test11 = new Test11();

        ClassLoader loader = TestClassLoader.class.getClassLoader();
        System.out.println(loader);

        System.out.println("类加载器加载");
        try {
            loader.loadClass("classloader.Test11");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("class.forName加载");
        try {
            Class.forName("classloader.Test11");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("className设置默认不加载静态模块");
        try {
            Class.forName("classloader.Test11", false, loader);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


}

 class Test11 {
    static {
        System.out.println("静态初始化模块执行了");
    }
}
