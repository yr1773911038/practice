package sjms.demo3;

/**
 * 饿汉模式
 *
 * 线程安全 (这种方式比较常用，但是容易产生垃圾对象)
 */
public class Singleton3 {
    private static Singleton3 instance = new Singleton3();

    private Singleton3() {
    }

    public static Singleton3 getInstance(){
        return instance;
    }
}
